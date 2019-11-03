package com.qf.sell.dao;

import com.qf.sell.entity.ProductCategory;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Transient;
import java.util.List;

/**
 * @ClassName ProductCategoryDao
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/17
 * @Version V1.0
 **/
@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {

    //
    @Query("SELECT pc FROM ProductCategory pc WHERE pc.categoryName like ?1%")
    List<ProductCategory> findAllByNameJPQL(String categoryName);

//    @Query("SELECT pc.categoryName, pc.categoryType FROM ProductCategory pc WHERE pc.categoryName = ?1")
//    List<String[]> findNameAndTypeAllByNameJPQL(String categoryName);
//
//    //
//    @Query(value = "SELECT * FROM product_category pc WHERE pc.category_name = ?1", nativeQuery = true)
//    List<ProductCategory> findAllByNameNative(String categoryName);

}
