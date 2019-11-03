package com.qf.sell;

import com.qf.sell.dao.ProductInfoDao;
import com.qf.sell.entity.ProductCategory;
import com.qf.sell.entity.ProductInfo;
import com.qf.sell.service.IProductInfoService;
import com.qf.sell.service.impl.ProductCategoryServiceImpl;
import com.qf.sell.service.impl.ProductInfoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class SellApplicationTests {

    @Autowired
    private ProductCategoryServiceImpl productCategoryService;
    @Autowired
    private ProductInfoDao productInfoDao;
    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    void contextLoads() {

//        ProductCategory category = new ProductCategory();
//        category.setCategoryName("最爱");
//        System.out.println( productCategoryService.addCategory(category));
//        System.out.println(productInfoDao.findByProductStatus(0));
        ProductInfo productInfo =new ProductInfo();
        productInfo.setProductName("冰镇三文鱼");
        productInfo.setProductPrice(new BigDecimal(188.88888).setScale(2,BigDecimal.ROUND_HALF_UP));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃得鸡");
        productInfo.setProductIcon("http//xxx.png");
        productInfo.setCategoryType(1);
        productInfo.setProductStatus(0);

        System.out.println(productInfoService.addProductInfo(productInfo));


    }

}
