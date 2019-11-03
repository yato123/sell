package com.qf.sell.controller;

import com.qf.sell.entity.ProductCategory;
import com.qf.sell.entity.ProductInfo;
import com.qf.sell.service.impl.ProductCategoryServiceImpl;
import com.qf.sell.vo.ProductCategoryVo;
import com.qf.sell.vo.ProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName ProductCategoryController
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/18
 * @Version V1.0
 **/
@RequestMapping("/pc")
@RestController
public class ProductCategoryController {
    @Autowired
    private ProductCategoryServiceImpl productCategoryService;

    @GetMapping("/fa")
    public List<ProductCategory> showAll() {
        return productCategoryService.findAll();
    }

    @GetMapping(value = "/fo/{id}")
    public Optional showOne(@PathVariable("id") Integer id) {

        return productCategoryService.findOne(id);
    }
    @GetMapping("/fabn/{categoryName}")
    public List<ProductCategory> findAllByNameJPQL(@PathVariable("categoryName") String categoryName){

       return productCategoryService.findAllByNameJPQL(categoryName);
    }

    @PostMapping("/ac")
    public String addCategory(@RequestBody ProductCategory productCategory) {
        ProductCategoryVo productCategoryVo = productCategoryService.addCategory(productCategory);
        if (productCategoryVo != null) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }
    @PutMapping("/up")
    public String updateProductCategory(@RequestBody ProductCategoryVo productCategoryVo){
        if (productCategoryService.updateCategory(productCategoryVo) != null){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @DeleteMapping("/dc/{id}")
    public String deleteCategoryById(@PathVariable Integer id) {
        int result = productCategoryService.deleteCategory(id);
        if (result > 0){
            return "删除成功";
        }else {
            return "删除失败";
        }

    }

}
