package ChainOfResponsability;

public class ConcreteHandler1 extends AbstractHandler {

	@Override
	void handleRequest() {
		System.out.println("Hola, soy el manejador #1");
		///Es posible manejar el llamado del sucesor desde la clase abstracta
		///Depende de el problema a solucionar.
		if(successor!=null)
			successor.handleRequest();
	}

}
