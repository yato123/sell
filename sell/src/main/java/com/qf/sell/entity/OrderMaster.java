package com.qf.sell.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OrderMaster
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/22
 * @Version V1.0
 **/
@Entity
@Table(name = "order_master")
@DynamicUpdate
public class OrderMaster {
    @Id
    @GeneratedValue
    private Integer orderId;
    //买家名字
    @Column(name = "buyer_name")
    private String buyerName;
    //买家电话
    @Column(name = "buyer_phone")
    private String buyerPhone;
    //买家地址
    @Column(name = "buyer_address")
    private String buyerAddress;
    //买家微信openid
    @Column(name = "buyer_openid")
    private String buyerOpenid;
    //订单总金额
    @Column(name = "order_amount")
    private BigDecimal orderAmount;
    //订单状态，默认0为新下单
    @Column(name = "order_status")
    private Integer orderStatus;
    //支付状态，默认0为未支付
    @Column(name = "pay_status")
    private Integer payStatus;
     //创建时间
    @Column(name = "create_time")
    private Date createTime;
    //更新时间
    @Column(name = "updateTime")
    private Date updateTime;

    public OrderMaster() {
    }

    public OrderMaster(String buyerName, String buyerPhone, String buyerAddress, String buyerOpenid, BigDecimal orderAmount, Integer orderStatus, Integer payStatus) {
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerAddress = buyerAddress;
        this.buyerOpenid = buyerOpenid;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        this.payStatus = payStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerOpenid() {
        return buyerOpenid;
    }

    public void setBuyerOpenid(String buyerOpenid) {
        this.buyerOpenid = buyerOpenid;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
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
        return "OrderMaster{" +
                "orderId=" + orderId +
                ", buyerName='" + buyerName + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", buyerOpenid='" + buyerOpenid + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderStatus=" + orderStatus +
                ", payStatus=" + payStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
