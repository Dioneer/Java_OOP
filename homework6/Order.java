package homework6;

public class Order {

	// region Constructers
	public Order(String clientName, String product, int qnt, int price) {
		this.clientName = clientName;
		this.product = product;
		this.qnt = qnt;
		this.price = price;
	}

	public Order(Prompt data) {
		this.clientName = data.getClientName();
		this.product = data.getProduct();
		this.qnt = data.getQnt();
		this.price = data.getPrice();
	}
	// endregion

	// region Getters

	public String getClientName() {
		return clientName;
	}

	public String getProduct() {
		return product;
	}

	public int getQnt() {
		return qnt;
	}

	public int getPrice() {
		return price;
	}
	// endregion

	// region Fields
	private String clientName;
	private String product;
	private int qnt;
	private int price;
	// endregion

}
