package cs586.Project.Strategy;

import cs586.Project.DataStore.Data1;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class SetPrice1 extends SetPrice {


	@Override
	public void setPrice(float g) {
		// TODO Auto-generated method stub
		Data1 dt = new Data1();
		if(g==1)
			dt.setPrice(dt.getRegGas1());

		if(g==2)
			dt.setPrice(dt.getSupGas1());

	}

}
