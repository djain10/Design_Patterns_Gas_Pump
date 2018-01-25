package cs586.Project.Strategy;

import cs586.Project.DataStore.Data1;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class GasPumpedMsg1 extends GasPumpedMsg {

	@Override
	public void gasPumpedMsg() {
		// TODO Auto-generated method stub

		Data1 data = new Data1();
		data.setTotal(data.getPrice()* data.getG());
		System.out.println("Amount of gas disposed is $: "+data.getTotal());


	}

}
