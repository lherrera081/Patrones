package ChainOfResponsability;

public class ChainOfResponsabilityMain {

	public static void main(String[] args) {
		
		System.out.println("Principal sin sucesor");
		AbstractHandler principal =buildChain1();
		principal.handleRequest();
		System.out.println("Principal con sucesor 2");
		principal =buildChain2();
		principal.handleRequest();
		System.out.println("Principal con sucesor 2 y sucesor 2 con sucesor 3");
		principal =buildChain3();
		principal.handleRequest();
		
	}
	
	public static AbstractHandler buildChain1(){
		///Creación de la cadena de responsabilidad
		AbstractHandler principal = new ConcreteHandler1();
		return principal;
	}
	public static AbstractHandler buildChain2(){
		///Creación de la cadena de responsabilidad
		AbstractHandler principal = new ConcreteHandler1();
		AbstractHandler handler2 = new ConcreteHandler2();
		principal.setNext(handler2);
		return principal;
	}
	public static AbstractHandler buildChain3(){
		///Creación de la cadena de responsabilidad
		AbstractHandler principal = new ConcreteHandler1();
		AbstractHandler handler2 = new ConcreteHandler2();
		principal.setNext(handler2);
		AbstractHandler handler3 = new ConcreteHandler3();
		handler2.setNext(handler3);
		return principal;
	}
	
}
