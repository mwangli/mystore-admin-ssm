package com.lmw.web;

import com.lmw.beans.Category;
import com.lmw.beans.Goods;
import com.lmw.beans.Page;
import com.lmw.service.CategoryService;
import com.lmw.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class GoodsController {

    @Autowired
    private GoodService goodServiceImpl;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/listGoods.do")
    public String listGoods(Model model, Page page) {
        if (page.getCurrentPage() == null) {
            page.setCurrentPage(1);
        }
        Integer start = (page.getCurrentPage() - 1) * (page.getPageSize());
        page.setStartIndex(start);
        Integer count = goodServiceImpl.getCount();
        page.setTotalCount(count);
        Double totalPage = Math.ceil(count * 1.0 / page.getPageSize());
        page.setTotalPage(totalPage.intValue());
        List<Goods> list = goodServiceImpl.listGood(page);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "goods.jsp";
    }

    @RequestMapping("/addGoods.do")
    public String listGoods(Model model) {
        List<Category> list = categoryService.getAllCategory();
        model.addAttribute("list", list);
        return "edit.jsp";
    }

    @RequestMapping("/saveGoods.do")
    public String saveGoods(Goods goods, MultipartFile imageFile) throws IOException {

        //图片上传处理
        if (imageFile != null) {
            //参数regex其实代表“正则表达式”，这是一种用来描述规则的规范。
            //如果希望用英文句点进行切分，那么参数必须写成"\\."，这是一个特例。
            String[] splits = imageFile.getOriginalFilename().split("\\.");
            String path = "F:\\goods_images\\";
            if (splits.length > 1) {
                String name = UUID.randomUUID().toString().replaceAll("-", "") + "." + splits[1];
                imageFile.transferTo(new File(path + name));
                goods.setImage(name);
            }
        }

        if (goods.getGid() == null) {
            //ID不存在则添加商品
            goodServiceImpl.addGoods(goods);
        } else {//否则更新商品
            goodServiceImpl.updateGoods(goods);
        }
        return "listGoods.do";
    }

    @RequestMapping("/deleteGoods.do")
    public String deleteGoods(Goods goods) {
        System.out.println(goods);
        goodServiceImpl.deleteGoods(goods);
        return "listGoods.do";
    }

    @RequestMapping("/editGoods.do")
    public String editGoods(Model model, Goods goods) {
        List<Category> list = categoryService.getAllCategory();
        model.addAttribute("list", list);
        Goods g = goodServiceImpl.findGoodsById(goods);
        model.addAttribute("goods", g);
        return "edit.jsp";
    }


}
