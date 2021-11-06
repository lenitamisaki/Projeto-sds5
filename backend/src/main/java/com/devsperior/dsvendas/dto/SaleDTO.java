package com.devsperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsperior.dsvendas.entities.Sale;
import com.devsperior.dsvendas.entities.Seller;

public class SaleDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO() {
		
	}

	public SaleDTO(long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		super();
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entity) {
		super();
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
	}
	
}
	