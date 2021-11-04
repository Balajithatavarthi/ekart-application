package com.infosys.infytel.entity;

import java.util.Date; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infosys.infytel.dto.orderstatus;

@Entity
@Table(name="ordertable")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String orderId;
	@Column(nullable = false)
	private String prodId;
	@Column(nullable = false)
	private String buyerId;
	@Column(nullable = false)
	private Integer amount;
	@Column(nullable = false)
	private Date date;
	@Column(nullable = false)
	private String address;
	@Enumerated(EnumType.STRING)
	private orderstatus status;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public orderstatus getStatus() {
		return status;
	}
	public void setStatus(orderstatus status) {
		this.status = status;
	}
	public Order() {
		super();
	}

	
}
