package observerdesignpattern;

public interface Subject 
{
	/**
	 * makes the subject so that observers can be notified, removed, and registered
	 * 
	 */
public void registerObserver(Observer observer);
public void removeObserver(Observer observer);
public void notifyObservers();
}
