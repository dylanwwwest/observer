package observerdesignpattern;

import java.util.ArrayList;

public class Cartel implements Observer {
	private Subject Cartel;
	private String location;
	private String description;
	/**
	 * Makes the array for observers
	 */
	private Cartel()
	{
		ArrayList<Sighting> observers;
	}
	/**
	 * registers the cartel
	 * 
	 */
	public Cartel(Subject Cartel)
	{
		this.Cartel = Cartel;
		Cartel.registerObserver(this);
	}
	/**
	 * updates the string and location of cook to cartel
	 */
	public void update(String location, String description) 
	{
		this.location = location;
		this.description = description;
	}
	/*
	 * Sends log to the cartel
	 */
	public String getLog()
	{
		return location;
		
	}

}
