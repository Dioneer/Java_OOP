package seminar2.exe2;

public class Cat extends BaseCat implements Voice {
	@Override
	public void voice() {
		System.out.println("May");
	}

	@Override
	public void jump() {
		System.out.println("Jump!");
	}
}

abstract class BaseCat {

}
