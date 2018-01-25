package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class SetPrice2 extends SetPrice {

	@Override
	public void setPrice(float g) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Data2 dt = new Data2();
		if(g==1)
			dt.setPrice(dt.getRegGas2());
		if (g==2)
			dt.setPrice(dt.getPremGas2());
		if(g==3)
			dt.setPrice(dt.getSupGas2());


	}

}
