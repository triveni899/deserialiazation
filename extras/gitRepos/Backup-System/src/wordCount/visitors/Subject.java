package wordCount.visitors;


public interface Subject {

	public void registerObserver(ObserverI observer);
	public void removeObserver(ObserverI observer);
	public void notifyObservers();
}
