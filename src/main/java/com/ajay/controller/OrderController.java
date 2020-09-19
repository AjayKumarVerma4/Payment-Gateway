package com.ajay.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.dto.OrderDTO;
import com.ajay.entity.CardDetail;
import com.ajay.entity.Order;
import com.ajay.service.CardDetailService;
import com.ajay.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CardDetailService cardDetailService;
	

	private static final Logger log = LoggerFactory.getLogger(OrderController.class);
	
	@PostMapping()
	public ResponseEntity<OrderDTO> create(@RequestBody Order order, HttpServletRequest request,
			HttpServletResponse response) {
		
		log.info("Start of method save");
		OrderDTO orderDTO = new OrderDTO();
		try {
			CardDetail card=order.getCard();
			cardDetailService.saveOrUpdate(card);
			LocalDateTime today=LocalDateTime.now();
			order.setTime(today);
			order.setOrderId(today+""+card.getId());
			order.setStatus("success");
			order.setAuthorization_code("SDSD2323233"+card.getId());
			order.setCard(card);
			orderService.saveOrUpdate(order);

		} catch (Exception e) {
          e.printStackTrace();
		}
		
		log.info("End of method save");
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Total-Count", "1");
		return ResponseEntity.ok().headers(headers).body(orderDTO.retriveOrderData(order));
	}
}