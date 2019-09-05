package com.lmw.service.impl;

import com.lmw.beans.Goods;
import com.lmw.beans.Page;
import com.lmw.mapper.GoodsMapper;
import com.lmw.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public List<Goods> listGood(Page page) {
        return goodsMapper.listGoods(page);
    }


    @Override
    public void addGoods(Goods goods) {
        goodsMapper.addGoods(goods);
    }

    @Override
    public void deleteGoods(Goods goods) {
        goodsMapper.deleteGoods(goods);
    }

    @Override
    public Goods findGoodsById(Goods goods) {
        return goodsMapper.findGoodsById(goods);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsMapper.updateGoods(goods);
    }

    @Override
    public Integer getCount() {
        return goodsMapper.getCount();
    }
}
