package cs586.Project.Strategy;

import cs586.Project.DataStore.Data1;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class PrintReceipt1 extends PrintReceipt {

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		Data1 dt = new Data1();
		System.out.println("   Receipt:  ");
		System.out.println(" # Gallons: "+dt.getG());
		System.out.println("Total: $"+dt.getTotal());
	}

}
