package cs586.Project.Strategy;

/**
 * This is a action class for output processor

 * @author Divyank
 *
 */

public class RejectMsg1 extends RejectMsg{

	@Override
	public void rejectMsg() {
		// TODO Auto-generated method stub
		System.out.println("Credit Card is not Approved");
		System.out.println("THE TRANSACTION IS CANCELLED");

	}

}
