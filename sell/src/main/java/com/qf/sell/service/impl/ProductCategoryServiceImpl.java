package com.qf.sell.service.impl;

import com.qf.sell.dao.ProductCategoryDao;
import com.qf.sell.entity.ProductCategory;
import com.qf.sell.service.IProductCategoryService;
import com.qf.sell.vo.ProductCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName ProductCategoryService
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/17
 * @Version V1.0
 **/


@Service
public class ProductCategoryServiceImpl implements IProductCategoryService {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    public List<ProductCategory> findAll() {

        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findAllByNameJPQL(String categoryName) {
        if (!categoryName.equals("") && categoryName != null){
            return productCategoryDao.findAllByNameJPQL(categoryName);
        }else {
            return null;
        }
    }

    public Optional findOne(Integer id) {
        if (id != null && id>0){
            return productCategoryDao.findById(id);
        }else {
            return null;
        }
    }

    public ProductCategoryVo addCategory(ProductCategory productCategory) {
        String categoryName =productCategory.getCategoryName();
        if (categoryName != null && "".equals(categoryName)){
            List<ProductCategory> productCategoryList = productCategoryDao.findAllByNameJPQL(categoryName);
            if (productCategoryList.size() == 0) {
                productCategory.setCreateTime(new Date());
                productCategory.setUpdateTime(new Date());
                ProductCategory productCategory1 = productCategoryDao.save(productCategory);
                ProductCategoryVo productCategoryVo = new ProductCategoryVo();
                productCategoryVo.setCategoryId(productCategory1.getCategoryId());
                productCategoryVo.setCategoryName(productCategory1.getCategoryName());
                productCategoryVo.setCategoryType(productCategory1.getCategoryType());
                return productCategoryVo;
            }else {
                return null;
            }
        } else {
            return null;
        }
    }

    public ProductCategory updateCategory(ProductCategoryVo productCategoryVo) {
        if (productCategoryVo.getCategoryId() != null) {
            ProductCategory productCategory = new ProductCategory();
            productCategory.setCategoryId(productCategoryVo.getCategoryId());
            productCategory.setCategoryName(productCategoryVo.getCategoryName());
            productCategory.setCategoryType(productCategoryVo.getCategoryType());
            productCategory.setUpdateTime(new Date());
            return productCategoryDao.save(productCategory);
        }else {
            return null;
        }
    }

    public int deleteCategory(Integer id){
        if (id != null && id >0){
            productCategoryDao.deleteById(id);
            return 1;
        }else {
            return -1;
        }
    }

}
