package seminar7.builder;

public class OrderBuilder {
	private Order order;

	public OrderBuilder() {
		order = new Order();
	}

	public Order build() {
		if (order.getQnt() <= 0) {
			throw new RuntimeException("qnt too few");
		}
		if (order.getPtoductId() < 1000) {
			throw new RuntimeException("productId too few");
		}
		if (order.getPrice() <= 0) {
			throw new RuntimeException("price too few");
		}
		return order;
	}

	public OrderBuilder setClientName(String clientName) {
		order.setClientName(clientName);
		return this;
	}

	public OrderBuilder setCompanyName(String companyName) {
		order.setCompanyName(companyName);
		return this;
	}

	public OrderBuilder setProductId(int productId) {
		order.setProductId(productId);
		return this;
	}

	public OrderBuilder setProductName(String productName) {
		order.setProductName(productName);
		return this;
	}

	public OrderBuilder setAnt(int qnt) {
		order.setQnt(qnt);
		return this;
	}

	public OrderBuilder setPrice(double price) {
		order.setPrice(price);
		return this;
	}

	public OrderBuilder setSign(boolean sign) {
		order.setSign(sign);
		return this;
	}

}
