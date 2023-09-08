package homework4;

// не думаю, что у вас есть время во всем этом разбираться. Я сделала несколько методов для добавления. Можно поштучно, можно кучей (через цикл). Для удаления тоже самое. Метод вывода веса не интересен, он простой. Самое сложное для меня было - compare(). Я сделала через отдельный класс, в классе Box, надеюсь, это подойдет под "Внутри класса Box сделать метод compare()", в принципе, он внутри, но как-то очень притянут за уши =). Я протестила, как могла, вроде все хорошо.

public class Programm {
	public static void main(String[] args) {
		Box<Apple> box1 = new Box<>();
		/**
		 * можно по одному элементу добавлять
		 */
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("red"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("yellow"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("red"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("yellow"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("yellow"));
		box1.showBox();
		System.out.println(box1.getWeight());
		/**
		 * можно кучей добавлять
		 */
		Box<Apple> box2 = AddFruits.addFlow(new Box<Apple>(), new Apple("green"),
				10);
		box2.showBox();
		System.out.println(box2.getWeight());
		/**
		 * можно по одному элементу пересыпать
		 */
		// Box<Apple> box3 = new Box<>();
		// ReplaceFruits.removeByOne(box2, box3);
		// ReplaceFruits.removeByOne(box2, box3);
		// ReplaceFruits.removeByOne(box2, box3);
		// box2.showBox();
		// box3.showBox();
		/**
		 * единстванные апельсины для теста
		 */
		Box<Orange> box5 = new Box<>();
		AddFruits.addFlow(box5, new Orange("yellow"), 6);
		/**
		 * можно кучей пересыпать
		 */
		Box<Apple> box4 = new Box<>();
		ReplaceFruits.replaceFlow(box1, box4, 5);
		box1.showBox();
		box4.showBox();
		/**
		 * вывод веса
		 */
		System.out.println(box1.getWeight());
		System.out.println(box4.getWeight());
		/**
		 * сравнение
		 */
		System.out.println(box1.myProblemMethodForCompare(box4));
	}
}
