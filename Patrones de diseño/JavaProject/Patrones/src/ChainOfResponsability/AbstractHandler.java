package ChainOfResponsability;

public abstract class AbstractHandler {
	protected AbstractHandler successor;
	abstract void handleRequest();
	public void setNext(AbstractHandler successor){
		this.successor=successor;
	}
}
