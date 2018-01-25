package cs586.Project.Strategy;

/**
 * This is a action class for output processor

 * @author Divyank
 */
import cs586.Project.DataStore.Data;

public abstract class SetInitialValues {

	Data data;
	public abstract void setInitialValues();
	public void setdata(Data dt)
	{
		data=dt;
	}
}

