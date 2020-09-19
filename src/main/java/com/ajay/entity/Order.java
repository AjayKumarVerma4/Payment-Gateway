package com.ajay.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")  // cannot name 'order' because it is a reserved word
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name = "AMOUNT")
	private Double amount;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name="CARD_TYPE")
	private String type;
	
	@ManyToOne
	@JoinColumn(name="CARD_ID")
	private CardDetail card;
	
	@Column(name = "ORDERED_ON")
	private LocalDateTime time;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "AUTHORIZATION_CODE")
	private String authorization_code;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CardDetail getCard() {
		return card;
	}

	public void setCard(CardDetail card) {
		this.card = card;
	}

	public String getAuthorization_code() {
		return authorization_code;
	}

	public void setAuthorization_code(String authorization_code) {
		this.authorization_code = authorization_code;
	}
	
}
