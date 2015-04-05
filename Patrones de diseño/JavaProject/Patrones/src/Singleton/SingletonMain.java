package Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton first = Singleton.getInstance();
		first.printCreatedDate();
		System.out.println("Esperando 5 segundos...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Singleton second = Singleton.getInstance();
		second.printCreatedDate();
		System.out.println("Fin de singleton.");
	}

}
