package com.qf.sell.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OrderDetail
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/22
 * @Version V1.0
 **/
@Entity
@Table(name = "order_detail")
@DynamicUpdate
public class OrderDetail {
    @Id
    @GeneratedValue
    private Integer detailId;
    //订单ID
    @Column(name = "order_id")
    private Integer orderId;
    //商品ID
    @Column(name = "product_id")
    private Integer productId;
    //商品名称
    @Column(name = "product_name")
    private String productName;
    //商品价格
    @Column(name = "product_price")
    private BigDecimal productPrice;
    //商品数量
    @Column(name = "product_quantity")
    private Integer productQuantity;
    //商品图片
    @Column(name = "product_icon")
    private String productIcon;
    //创建时间
    @Column(name = "create_time")
    private Date createTime;
    //更新时间
    @Column(name = "update_time")
    private Date updateTime;

    public OrderDetail() {
    }

    public OrderDetail(Integer orderId, Integer productId, String productName, BigDecimal productPrice, Integer productQuantity, String productIcon, Date createTime, Date updateTime) {
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productIcon = productIcon;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
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
        return "OrderDetail{" +
                "detailId=" + detailId +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", productIcon='" + productIcon + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
