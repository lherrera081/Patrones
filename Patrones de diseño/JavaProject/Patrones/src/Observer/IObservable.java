package Observer;

public interface IObservable {
	void registerObserver(IObserver observer);
	void unregisterObserver(IObserver observer);
	void notifyObservers();
}
