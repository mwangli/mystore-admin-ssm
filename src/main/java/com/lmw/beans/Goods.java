package com.lmw.beans;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Goods {
    private Integer gid;
    private String name;
    private Double price;
    private String image;
    private String description;
    private Integer hot;
    private Integer cid;
}
