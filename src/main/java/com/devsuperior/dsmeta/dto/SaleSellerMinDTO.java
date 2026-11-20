package com.devsuperior.dsmeta.dto;

public class SaleSellerMinDTO {

	private String sellerName;
	private Double total;
	
	public SaleSellerMinDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSellerMinDTO(String sellerName, Double total) {
		this.sellerName = sellerName;
		this.total = total;
	}

	public String getSellerName() {
		return sellerName;
	}

	public Double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "SaleSellerMinDTO [name=" + sellerName + ", amount=" + total + "]";
	}
	
}
