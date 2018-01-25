package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class PrintReceipt2 extends PrintReceipt {

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		Data2 dt = new Data2();

		System.out.println("   Receipt:  ");
		System.out.println(" # OF LITRES "+dt.getL());
		System.out.println("TOTAL: $"+dt.getTotal());


	}

}
