package com.qf.sell.dao;

import com.qf.sell.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @ClassName ProductInfoDao
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/22
 * @Version V1.0
 **/
public interface ProductInfoDao extends JpaRepository<ProductInfo, Integer> {
    @Query("SELECT pi FROM ProductInfo pi WHERE productStatus= ?1")
    List<ProductInfo> findByProductStatus(Integer productStatus);

    @Query("SELECT pi FROM ProductInfo pi WHERE pi.productName like ?1% and productStatus =0")
    List<ProductInfo> findByNameJPQL(String productName);



}