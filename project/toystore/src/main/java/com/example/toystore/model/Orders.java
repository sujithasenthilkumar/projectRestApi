package com.example.toystore.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String orderedToy;
	private LocalDate orderDate;
	private LocalDate lendingStartDate;
	private LocalDate lendingEndDate;
	
	public Orders(int orderId,String orderedToy, LocalDate orderDate, LocalDate lendingStartDate, LocalDate lendingEndDate) {
		super();
		this.orderId = orderId;
		this.orderedToy = orderedToy;
		this.orderDate = orderDate;
		this.lendingStartDate = lendingStartDate;
		this.lendingEndDate = lendingEndDate;
		}

		public Orders() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public String getOrderedToy() {
			return orderedToy;
		}

		public void setOrderedToy(String orderedToy) {
			this.orderedToy = orderedToy;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		public LocalDate getLendingStartDate() {
			return lendingStartDate;
		}

		public void setLendingStartDate(LocalDate lendingStartDate) {
			this.lendingStartDate = lendingStartDate;
		}

		public LocalDate getLendingEndDate() {
			return lendingEndDate;
		}

		public void setLendingEndDate(LocalDate lendingEndDate) {
			this.lendingEndDate = lendingEndDate;
		}

		
		
}