package com.lmw.web;

import com.lmw.beans.Category;
import com.lmw.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService  categoryServiceImpl;

    @RequestMapping("/getAllCategory")
    public String getAllCategory(Model model){
        List<Category> list = categoryServiceImpl.getAllCategory();
        model.addAttribute("list", list);
        return "category.jsp";
    }
}
