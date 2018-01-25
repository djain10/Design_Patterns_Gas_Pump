package cs586.Project.Strategy;

import cs586.Project.DataStore.Data1;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class StoreData1 extends StoreData {

	@Override
	public void storeData() {
		// TODO Auto-generated method stub
		float a,b;
		System.out.println("Prices Stored");
		Data1 dt = new Data1();
		a = dt.getRegGas1();		

		dt.setRegGas1(a);
		System.out.println("Regular price:" + a);

		b = dt.getSupGas1();
		dt.setSupGas1(b);
		System.out.println("Super price:" + b);

	}

}
