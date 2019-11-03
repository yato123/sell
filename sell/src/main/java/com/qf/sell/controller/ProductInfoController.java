package com.qf.sell.controller;

import com.qf.sell.entity.ProductInfo;
import com.qf.sell.service.impl.ProductInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * @ClassName ProductInfoController
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/22
 * @Version V1.0
 **/
@RequestMapping("/pi")
public class ProductInfoController {
    @Autowired
    private ProductInfoServiceImpl productInfoServiceImpl;

    @GetMapping("/fa")
    public Page<ProductInfo> findAll(Integer currentPage, Integer pageSize){
        return productInfoServiceImpl.findAll(currentPage,pageSize);
    }
    @GetMapping("/fabn/{productName}")
    public List<ProductInfo> findAllByName(@PathVariable("productName") String productName){
        return productInfoServiceImpl.findAllByName(productName);
    }
    @PostMapping("/ap")
    public String addProductInfo(@RequestBody ProductInfo productInfo){
         if (productInfoServiceImpl.addProductInfo(productInfo) != null){
             return "添加成功";
         }else {
             return "添加失败";
         }
    }
    @PutMapping("/up")
    public String updateProductInfo(@RequestBody ProductInfo productInfo){
        if (productInfoServiceImpl.updateProductInfo( productInfo) != null){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
    @DeleteMapping("/dp/{id}")
    public String deleteProductInfo(Integer id){
        if (productInfoServiceImpl.deleteProductInfo(id) >0 ){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}
