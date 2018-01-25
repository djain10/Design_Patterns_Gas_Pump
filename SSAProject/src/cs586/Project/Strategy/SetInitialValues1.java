package cs586.Project.Strategy;

import cs586.Project.DataStore.Data1;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class SetInitialValues1 extends SetInitialValues{

	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		Data1 data = new Data1();
		data.setG(0);
		data.setTotal(0);
	}

}
