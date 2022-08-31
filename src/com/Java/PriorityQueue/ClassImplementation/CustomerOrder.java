package com.Java.PriorityQueue.ClassImplementation;

public class CustomerOrder {

	private int orderId;
	private double orderAmount;
	private String CustomerName;
	
	public CustomerOrder(int orderId,double orderAmount,String CustomerName) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.CustomerName = CustomerName;
	}
	
	@Override
	public String toString() {
		return "orderId "+this.orderId+" orderAmount "+this.orderAmount+" customerName "+this.CustomerName;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
	
	
}
