package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class PumpGasUnit2 extends PumpGasUnit {

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		Data2 data = new Data2();
		data.setL(data.getL()+1);
		System.out.println("   "+data.getL()+" Litres Pumped");
	}

}
