package com.qf.sell.service;

import com.qf.sell.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IOrderDetailDao extends JpaRepository<OrderDetail,Integer> {
    List<OrderDetail> findByOrderId(Integer orderId);
}
