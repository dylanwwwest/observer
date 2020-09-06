package observerdesignpattern;

import java.util.ArrayList;

public class Cook implements Subject 
{
String location;
String description;
public ArrayList<Observer> observers;

	public Cook(String string)
	{
}
/**
 * Enters sightin, the location and string
 */
	public void enterSighting(String location,String description)
	{
		
	}
/**
 * adds observer
 */
	public void registerObserver(Observer observer) 
	{
	observers.add(observer);
	}

/**
 * removes an observer
 */
	public void removeObserver(Observer observer) 
	{
	observers.remove(observer);
	}

/**
 * notifies the dea or cartel of the location and description
 */
	public void notifyObservers() 
	{
	for(Observer observer : observers)
		{
		observer.update(location, description);
		}
	}
/**
 * gets the name of dea or cartel
 * 
 */
	public String getName() {
		
		return null;
	}
}
