package com.goody.diet.order;

import java.sql.Date;
import java.util.List;

import com.goody.diet.cart.CartDTO;

public class OrderDTO {

	private Long orderNum;
	private String id;
	private Date orderDate;
	private Long orderStatus;
	private List<CartDTO> cartDTOs;
	private Long price;
	
	private String address;
	private String recipient;
	private String recipientTel;
	
	

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getRecipientTel() {
		return recipientTel;
	}
	public void setRecipientTel(String recipientTel) {
		this.recipientTel = recipientTel;
	}
	
	
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public List<CartDTO> getCartDTOs() {
		return cartDTOs;
	}
	public void setCartDTOs(List<CartDTO> cartDTOs) {
		this.cartDTOs = cartDTOs;
	}
	public Long getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	
	
	
}
