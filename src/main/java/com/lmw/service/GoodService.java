package com.lmw.service;

import com.lmw.beans.Goods;
import com.lmw.beans.Page;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GoodService {

    List<Goods> listGood(Page page);

    Integer getCount();

    void addGoods(Goods goods);

    void deleteGoods(Goods goods);

    Goods findGoodsById(Goods goods);

    void updateGoods(Goods goods);
}
