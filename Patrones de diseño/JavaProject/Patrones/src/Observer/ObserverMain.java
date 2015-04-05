package Observer;

public class ObserverMain {

	public static void main(String[] args) {
		///Observable
		IObservable observable= new ConcreteObservable();
		///Observadores
		IObserver observer1= new ConcreteObserver1();
		IObserver observer2= new ConcreteObserver1();
		IObserver observer3= new ConcreteObserver2();
		IObserver observer4= new ConcreteObserver2();
		///Registrar los observadores
		System.out.println("Registrando dos observadores concretos 1 y dos observadores concretos 2...");
		observable.registerObserver(observer1);
		observable.registerObserver(observer2);
		observable.registerObserver(observer3);
		observable.registerObserver(observer4);
		///Notificar acción
		observable.notifyObservers();
		///Eliminar observadores 3 y 4
		System.out.println("Eliminando dos observadores concretos 2...");
		observable.unregisterObserver(observer3);
		observable.unregisterObserver(observer4);
		observable.notifyObservers();
		System.out.println("Agregando un observador concreto 2...");
		observable.registerObserver(observer3);
		observable.notifyObservers();
	}

}
