package cs586.Project.Strategy;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class StopMsg2 extends StopMsg {

	@Override
	public void stopMsg() {
		// TODO Auto-generated method stub
		System.out.println("   Pump Stopped  ");
		System.out.println("  DO YOU WANT A RECEIPT?");

	}

}
