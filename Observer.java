package observerdesignpattern;

public interface Observer 
{
	/**
	 * updates string location and gets log for observer
	 */
public void update(String location, String description);

public String getLog();

}
