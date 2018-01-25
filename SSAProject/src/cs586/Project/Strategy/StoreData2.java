package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;
/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class StoreData2 extends StoreData {

	@Override
	public void storeData() {
		// TODO Auto-generated method stub
		int a,b,c;
		Data2 data = new Data2();
		System.out.println("\nPrice stored");
		a = data.getRegGas2();
		data.setRegGas2(a);
		System.out.println("\nRegular price: " + a);
		b = data.getPremGas2();
		data.setPremGas2(b);
		System.out.println("\nPremium price: " + b);
		c= data.getSupGas2();
		data.setSupGas2(c);
		System.out.println("\nSuper price: " +c);
	}

}
