package com.lmw.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
public class Page {

    //用以封装分页查询相关参数
    private final Integer pageSize = 10;//每页显示10条数据
    private Integer currentPage;//当前页
    private Integer totalCount;//总数据条数
    private Integer totalPage;//总页数
    private Integer startIndex;//起始查询位置
}
