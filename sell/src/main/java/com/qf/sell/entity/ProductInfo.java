package com.qf.sell.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ProductInfo
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/21
 * @Version V1.0
 **/
@Entity
@Table(name = "product_info")
@DynamicUpdate
public class ProductInfo {
    @Id
    @GeneratedValue
    private Integer productId;
    //商品名称
    @Column(name ="product_name")
    private String productName;
    //商品价钱
    @Column(name ="product_price")
    private BigDecimal productPrice;
    //商品库存
    @Column(name ="product_stock")
    private Integer productStock;
    //商品描述
    @Column(name = "product_description")
    private String productDescription;
    //商品图片
    @Column(name = "product_icon")
    private String productIcon;
    //类目编号
    @Column(name = "category_type")
    private Integer categoryType;
    //商品状态，默认0正常1下架
    @Column(name = "product_status")
    private Integer productStatus;
    //创建时间
    @Column(name = "create_time")
    private Date createTime;
    //修改时间
    @Column(name = "update_time")
    private Date updateTime;

    public ProductInfo() {
    }

    public ProductInfo(String productName, BigDecimal productPrice, Integer productStock, String productDescription, String productIcon, Integer categoryType, Integer productStatus) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productIcon = productIcon;
        this.categoryType = categoryType;
        this.productStatus = productStatus;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productDescription='" + productDescription + '\'' +
                ", productIcon='" + productIcon + '\'' +
                ", categoryType=" + categoryType +
                ", productStatus=" + productStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
