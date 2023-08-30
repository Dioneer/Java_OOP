package seminar2.exe2;

public class Dog extends BaseDog implements Voice {

	@Override
	public void voice() {
		System.out.println("Gav");
	}

	@Override
	public void jump() {
		System.out.println("Jump!");
	}
}

abstract class BaseDog {

}