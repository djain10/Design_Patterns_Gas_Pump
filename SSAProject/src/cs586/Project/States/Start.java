package cs586.Project.States;

import cs586.Project.Output.Op;

/**
 * This class is used for representing Start state

 * @author Divyank
 *
 */
public class Start extends State{

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		//Change from Start state to S0
		Op op = new Op();
		op.StoreData();

	}

}
