package com.qf.sell.service;

import com.qf.sell.entity.ProductInfo;
import com.qf.sell.vo.ProductInfoVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface IProductInfoService {
    List<ProductInfo> findByProductStatus(Integer productStatus);
    Page<ProductInfo> findAll(Integer currentPage,Integer pageSize);
    List<ProductInfo> findAllByName(String productName);
    ProductInfoVo addProductInfo(ProductInfo productInfo);
    ProductInfo updateProductInfo(ProductInfo productInfo);
    int deleteProductInfo(Integer id);

}
