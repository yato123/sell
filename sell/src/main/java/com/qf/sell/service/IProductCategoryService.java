package com.qf.sell.service;

import com.qf.sell.entity.ProductCategory;
import com.qf.sell.vo.ProductCategoryVo;

import java.util.List;
import java.util.Optional;

public interface IProductCategoryService {
     List<ProductCategory> findAll();
     List<ProductCategory>findAllByNameJPQL(String categoryName);
     Optional findOne(Integer id);
     ProductCategoryVo addCategory(ProductCategory productCategory);
     ProductCategory updateCategory(ProductCategoryVo productCategoryVo);
     int deleteCategory(Integer id);


}
