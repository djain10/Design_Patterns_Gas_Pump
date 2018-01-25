package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class SetInitialValues2 extends SetInitialValues{

	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		Data2 data = new Data2();
		data.setG(0);
		data.setTotal(0);
	}

}
