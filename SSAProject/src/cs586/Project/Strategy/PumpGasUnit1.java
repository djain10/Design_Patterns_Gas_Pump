package cs586.Project.Strategy;

import cs586.Project.DataStore.Data1;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class PumpGasUnit1 extends PumpGasUnit {

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub

		Data1 data = new Data1();
		data.setG(data.getG()+1);

		System.out.println("   "+data.getG()+" Gallons Pumped ");
	}

}
