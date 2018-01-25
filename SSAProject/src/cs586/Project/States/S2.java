package cs586.Project.States;

import cs586.Project.Output.Op;
/**
 * This class is used for representing intermediate state called S2
 * @author Divyank
 *
 */
public class S2 extends State {

	@Override
	public void Approved(){

		//Changed from S2 to S3
		Op op = new Op();
		op.DisplayMenu();
	}

	@Override
	public void Reject(){
		//System.out.println("Changed from S2 to S0");
		Op op = new Op();
		op.RejectMsg();
	}
}
