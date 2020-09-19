package com.ajay.dto;

public class CardDetailDTO {
	private Long number;
	
	public CardDetailDTO(Long number) {
		super();
		this.number = number;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
}
