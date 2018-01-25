package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class StoreCash2 extends StoreCash{

	@Override
	public void storeCash(int c) {
		// TODO Auto-generated method stub
		Data2 dt = new Data2();
		dt.setCash(c);


	}

}
