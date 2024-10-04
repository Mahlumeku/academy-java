package _08_oop_demo;

class Product {

	private String productId;
	private String productName;
	private double productPrice;
	private int productQuality;

	public Product(String productId, String productName, double productPrice, int productQuality) {

		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuality = productQuality;

	}

	// Getters/ Accessors
	public String getId() {
		return this.productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public double getProductPrice() {
		return this.productPrice;
	}

	public int getProductQuantity() {
		return this.productQuality;
	}
	// Mutator
	public void reduceStock(int quantity) {
		if (quantity <= productQuality) {
			productQuality -= quantity;
		} else {
			throw new IllegalArgumentException("Insufficient Stock!");
		}
	}
}
