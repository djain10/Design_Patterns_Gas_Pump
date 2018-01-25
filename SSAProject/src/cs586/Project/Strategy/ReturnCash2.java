package cs586.Project.Strategy;

import cs586.Project.DataStore.Data2;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class ReturnCash2 extends ReturnCash {

	@Override
	public void returnCash() {
		// TODO Auto-generated method stub
		Data2 data = new Data2();
		data.setCash(data.getCash()-data.getTotal());
		System.out.println("RETURN $"+(data.getCash()-data.getTotal())+" of CASH");

	}

}
