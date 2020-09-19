package com.ajay.dto;

import java.time.LocalDateTime;

import com.ajay.entity.Order;

public class OrderDTO {
	private Double amount;
	private String currency;
	private String type;
	private CardDetailDTO card;
	private LocalDateTime time;
	private String status;
	private String authorization_code;

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

	public CardDetailDTO getCard() {
		return card;
	}

	public void setCard(CardDetailDTO card) {
		this.card = card;
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
	
	public String getAuthorization_code() {
		return authorization_code;
	}

	public void setAuthorization_code(String authorization_code) {
		this.authorization_code = authorization_code;
	}

	public OrderDTO retriveOrderData(Order orders) {
        this.amount=orders.getAmount();
        this.currency=orders.getCurrency();
        this.type=orders.getType();
        this.card=new CardDetailDTO(orders.getCard().getNumber());
        this.status=orders.getStatus();
        this.authorization_code=orders.getAuthorization_code();
        this.time=orders.getTime();
		return this;
	}
}
