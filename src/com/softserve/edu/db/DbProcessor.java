package com.softserve.edu.db;

import java.util.List;

import com.softserve.edu.dao.order.Order;
import com.softserve.edu.dao.order.OrderProcessor;

public class DbProcessor {

	public List<Order> getDataFromDB() throws Exception {
		// handle exceptions
		OrderProcessor orderProc = new OrderProcessor();
		List<Order> orders = orderProc.getAllFromOrders();
		return orders;
	}

}
