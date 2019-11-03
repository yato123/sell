package com.qf.sell.service.impl;

import com.qf.sell.dao.ProductInfoDao;
import com.qf.sell.entity.ProductInfo;
import com.qf.sell.service.IProductInfoService;
import com.qf.sell.vo.ProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName ProductInfoServiceImpl
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/22
 * @Version V1.0
 **/
@Service
public class ProductInfoServiceImpl implements IProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> findByProductStatus(Integer productStatus) {
        if (productStatus != null && (productStatus == 0 || productStatus == 1)) {
            return productInfoDao.findByProductStatus(productStatus);
        } else {
            return null;
        }
    }

    @Override
    public Page<ProductInfo> findAll(Integer currentPage,Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(currentPage, pageSize);
        return productInfoDao.findAll(pageRequest);
    }

    @Override
    public List<ProductInfo> findAllByName(String productName) {
        if (!productName.trim().equals("") && productName != null) {
            return productInfoDao.findByNameJPQL(productName);
        } else {
            return null;
        }
    }

    @Override
    public ProductInfoVo addProductInfo(ProductInfo productInfo) {
        String productName = productInfo.getProductName();
        List<ProductInfo> prductInfos = productInfoDao.findByNameJPQL(productName);
        if (productName != null) {
            if (prductInfos.size() == 0) {
                productInfo.setCreateTime(new Date());
                productInfo.setUpdateTime(new Date());
                ProductInfo productInfo1 = productInfoDao.save(productInfo);
                ProductInfoVo productInfoVo = new ProductInfoVo();
                productInfoVo.setProductId(productInfo1.getProductId());
                productInfoVo.setProductName(productInfo1.getProductName());
                productInfoVo.setProductPrice(productInfo1.getProductPrice());
                productInfoVo.setProductStock(productInfo1.getProductStock());
                productInfoVo.setProductDescription(productInfo1.getProductDescription());
                productInfoVo.setProductIcon(productInfo1.getProductIcon());
                productInfoVo.setCategoryType(productInfo1.getCategoryType());
                return productInfoVo;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public ProductInfo updateProductInfo(ProductInfo productInfo) {
        if (productInfo != null) {
            return productInfoDao.save(productInfo);
        } else {
            return null;
        }
    }

    @Override
    public int deleteProductInfo(Integer id) {
        if (id != null && id > 0) {
            productInfoDao.deleteById(id);
            return 1;
        } else {
            return -1;
        }
    }

}
