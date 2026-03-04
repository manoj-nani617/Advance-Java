package com.techouts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.Orders;
import com.techouts.entity.User;
import com.techouts.repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;

	public List<Orders> getOrders(Orders order,User user) {
		return orderRepo.getOrders(order,user);
	}

	public void deleteOrder(int id) {
		orderRepo.deleteOrder(id);
		
	}
	
}
