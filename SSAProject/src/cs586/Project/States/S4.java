package cs586.Project.States;

import cs586.Project.Output.Op;

/**
 * This class is used for representing intermediate state called S4
 * @author Divyank
 *
 */

public class S4 extends State {

	@Override
	public void StartPump(){

		//Changed from S4 to S5
		Op op = new Op();
		op.SetInitialValues();
		op.ReadyMsg();

	}
}
