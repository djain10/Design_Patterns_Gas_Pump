package cs586.Project.Strategy;

/**
 * This is a action class for output processor

 * @author Divyank
 */
import cs586.Project.DataStore.Data;

public abstract class GasPumpedMsg {

	Data dobj;
	public abstract void gasPumpedMsg();

	public void setdata(Data dt)
	{
		dobj=dt;
	}
}


