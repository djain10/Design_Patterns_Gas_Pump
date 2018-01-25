package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class GasPumpedMsg2 extends GasPumpedMsg{

	@Override
	public void gasPumpedMsg() {
		// TODO Auto-generated method stub
		Data2 data = new Data2();
		data.setTotal(data.getPrice()* data.getL());

		System.out.println("Amount of gas disposed is: $"+data.getTotal());


	}

}
