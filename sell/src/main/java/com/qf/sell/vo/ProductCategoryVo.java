package com.qf.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @ClassName ProductCategoryVo
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/21
 * @Version V1.0
 **/
public class ProductCategoryVo {
    @JsonProperty("id")
    private Integer categoryId;
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;

    public ProductCategoryVo() {
    }

    public ProductCategoryVo(Integer categoryId, String categoryName, Integer categoryType) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
