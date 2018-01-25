package cs586.Project.Strategy;

/**
 * This is a action class for output processor

 */
import cs586.Project.DataStore.Data;

public abstract class SetPrice {

	Data data;
	public abstract void setPrice(float g);
	public void setdata(Data dt)
	{
		data=dt;
	}
}
