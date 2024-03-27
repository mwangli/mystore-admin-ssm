package com.lmw.mapper;

import com.lmw.beans.Goods;
import com.lmw.beans.Page;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsMapper {

    @Select("select * from goods ling limit #{startIndex},#{pageSize}")
    List<Goods> listGoods(Page page);

    @Select("select count(*) from goods")
    Integer getCount();

    @Insert("insert into goods(name,price,image,description,hot,cid) values(#{name},#{price},#{image},#{description},#{hot},#{cid})")
    void addGoods(Goods goods);

    @Delete("delete from goods where gid = #{gid}")
    void deleteGoods(Goods goods);

    @Select("select * from goods where gid = #{gid}")
    Goods findGoodsById(Goods goods);

    @Update("update goods set name = #{name},price=#{price},image=#{image}," +
            "description=#{description},hot=#{hot},cid=#{cid} where gid=#{gid}")
    void updateGoods(Goods goods);
}
