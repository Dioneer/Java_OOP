package homework6;

import java.util.Scanner;

public class Prompt {

	// region Fields
	private String clientName;
	private String product;
	private int qnt;
	private int price;
	// endregion

	public Prompt() {
	};

	public String prompt(String message) {
		Scanner in = new Scanner(System.in);
		System.out.println(message);
		return in.nextLine();
	}

	public void inputFromConsole() {
		this.clientName = prompt("Enter name: ");
		this.product = prompt("Enter product: ");
		this.qnt = Integer.parseInt(prompt("Enter qnt: "));
		this.price = Integer.parseInt(prompt("Enter price: "));
	}

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

}
