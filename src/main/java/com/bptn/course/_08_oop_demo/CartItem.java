package com.bptn.course._08_oop_demo;

class CartItem {

	private Product product;
	private int cartQuantity;

	public CartItem(Product product, int quantity) {

		if (quantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficient Stock!");
		}

		this.product = product;
		this.cartQuantity = quantity;
	}

	// getters /Accessors
	public Product getProduct() {
		return this.product;
	}

	public int getcartQuantity() {
		return this.cartQuantity;
	}

	public double getTotalPrice() {
		return product.getProductPrice() * this.cartQuantity;
	}
}
