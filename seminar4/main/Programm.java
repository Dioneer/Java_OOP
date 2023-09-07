package seminar4.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Programm {
	public static void main(String[] args) {
		MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[100]);
		myArrayList.add(new Employee("AAAAA", 10));
		System.out.println(myArrayList.getSize());

		for (Employee e : myArrayList) {
			if (e != null) {
				Employee employee = e;
				System.out.println(e.getAge());
			}
		}

		Integer[] array1 = new Integer[] { 1, 2, 2, 3, 4, 5, 6, 7 };
		String[] array2 = new String[] { "1", "asd" };
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println(Arrays.toString(array1));
		Integer[] arr = ArrayUtils.replaceTwoElements(array1, 2, 3);
		System.out.println(Arrays.toString(arr));
	}
}
