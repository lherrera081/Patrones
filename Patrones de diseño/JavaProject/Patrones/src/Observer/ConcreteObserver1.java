package Observer;

public class ConcreteObserver1 implements IObserver {

	@Override
	public void action() {
		System.out.println("Concrete observer #1");
	}

}
