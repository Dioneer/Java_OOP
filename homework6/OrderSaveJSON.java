package homework6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderSaveJSON {
	private List<Order> orderList;
	private Order order;
	private String fileName = "order.json";

	public OrderSaveJSON(Order order, String fileName) {
		this.order = order;
		this.fileName = fileName;
	}

	public OrderSaveJSON(List<Order> orderList, String fileName) {
		this.orderList = orderList;
		this.fileName = fileName;
	}

	public OrderSaveJSON(List<Order> orderList) {
		this.orderList = orderList;
	}

	public OrderSaveJSON(Order order) {
		this.order = order;
	}

	public void saveToJSON() {
		if (orderList != null && orderList instanceof ArrayList) {
			try (FileWriter fileWriter = new FileWriter(fileName, false)) {
				fileWriter.write("[");
				for (int i = 0; i < orderList.size(); i++) {
					if (i < orderList.size() - 1) {
						fileWriter.write("{\n");
						fileWriter.write("\"clientName\":\"" + orderList.get(i).getClientName() + "\",\n");
						fileWriter.write("\"product\":\"" + orderList.get(i).getProduct() + "\",\n");
						fileWriter.write("\"qnt\":\"" + orderList.get(i).getQnt() + "\",\n");
						fileWriter.write("\"price\":\"" + orderList.get(i).getPrice() + "\"\n},");
						fileWriter.write("\n");
					} else {
						fileWriter.write("{\n");
						fileWriter.write("\"clientName\":\"" + orderList.get(i).getClientName() + "\",\n");
						fileWriter.write("\"product\":\"" + orderList.get(i).getProduct() + "\",\n");
						fileWriter.write("\"qnt\":\"" + orderList.get(i).getQnt() + "\",\n");
						fileWriter.write("\"price\":\"" + orderList.get(i).getPrice() + "\"\n}");
						fileWriter.write("\n");
					}
				}
				fileWriter.write("]");
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		} else

		{
			try {
				FileWriter fileWriter = new FileWriter(fileName, false);
				fileWriter.write("{\n");
				fileWriter.write("\"clientName\":\"" + order.getClientName() + "\",\n");
				fileWriter.write("\"product\":\"" + order.getProduct() + "\",\n");
				fileWriter.write("\"qnt\":\"" + order.getQnt() + "\",\n");
				fileWriter.write("\"price\":\"" + order.getPrice() + "\"\n}");
				fileWriter.write("\n");
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

}
