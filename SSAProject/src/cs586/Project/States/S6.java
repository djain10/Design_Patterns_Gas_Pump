package cs586.Project.States;

import cs586.Project.Driver.Driver;
import cs586.Project.Output.Op;


/**
 * This class is used for representing intermediate state called S6
 * @author Divyank
 *
 */

public class S6 extends State{
	//Changed from S6 to S0
	@Override
	public void Receipt(){

		char ch =Driver.choose;
		if(ch=='1'){		

			Op op = new Op();
			op.PrintReceipt();
		}
		else if(ch=='2'){
			Op op = new Op();
			op.PrintReceipt();
			op.ReturnCash();	
		}
	}

	@Override
	public void NoReceipt(){
		Op op = new Op();
		op.NoReceipt();
		op.ReturnCash();
	}
}
