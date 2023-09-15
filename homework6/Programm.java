package homework6;

import java.util.ArrayList;
import java.util.List;

public class Programm {
	public static void main(String[] args) {
		// сделала список, что бы можно было пачкой записывать в JSON
		List<Order> list = new ArrayList<>();
		// сделала отдельный класс, что бы можно было, его не исключить и/ли добавить
		// другой метод записи
		Prompt data = new Prompt();
		data.inputFromConsole();
		// это добавление вручную
		Order order = new Order("AAAA", "BBBBB", 1, 25);
		Order order2 = new Order("CCCC", "SSSSSS", 5, 65);
		Order order3 = new Order(data);
		// добаление в лист
		list.add(order);
		list.add(order2);
		list.add(order3);

		// Записывать можно одним из 2-х способов!
		// 1 запись по-одному
		// OrderSaveJSON write = new OrderSaveJSON(order3);
		// 2запись листом
		OrderSaveJSON write = new OrderSaveJSON(list);

		write.saveToJSON();

	}
}
