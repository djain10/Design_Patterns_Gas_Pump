package cs586.Project.States;

import cs586.Project.Output.Op;

/**
 * This class is used for representing intermediate state called S1
 * @author Divyank
 *
 */
public class S1 extends State{

	public void PayCash(int c){

		//Changed from S1 to S3"
		Op op = new Op();
		op.StoreCash(c);
		op.DisplayMenu();
	}

	public void PayCredit(){

		System.out.println("WAIT - CHECKING CREDIT CARD");

	}
}
