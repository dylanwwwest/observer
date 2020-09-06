package observerdesignpattern;

import java.util.ArrayList;

public class DEA implements Observer 
{
Subject Cook;
String notes;
private String location;
private String description;
/**
 * updates the dea and registers them
 * 
 */
	public DEA(Subject Cook)
	{
		this.Cook = Cook;
		Cook.registerObserver(this);
	}
	/**
	 * updates the dea of his location and description
	 */

	public void update(String location, String description)
	{
	this.location = location;
	this.description = description;
	}

/**
 * getter for the log
 */
	public String getLog() 
	{
		
		return notes;
	}

}

