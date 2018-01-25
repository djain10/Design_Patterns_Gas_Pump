package cs586.Project.States;

import cs586.Project.Output.Op;

/**
 * This class is used for representing Idle state

 * @author Divyank
 *
 */
public class S0 extends State {

	public void Start(){

		//Changed from S0 to S1");
		Op op = new Op();
		op.PayMsg();
	}
}
