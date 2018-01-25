package cs586.Project.States;

import cs586.Project.Driver.Driver;
import cs586.Project.Output.Op;

/**
 * This class is used for representing intermediate state called S5
 * @author Divyank
 *
 */

public class S5 extends State {

	@Override
	public void Pump(){


		Op op = new Op();
		op.PumpGasUnit();
		op.GasPumpedMsg();	
		//Changed from S5 to S6
	}
	

	@Override
	public void StopPump(){

		Op op = new Op();
		if(Driver.choose=='1'){
		op.StopMsg();		
		}
		
		if(Driver.choose =='2'){
			op.StopMsg();
		}
	}
	public void Receipt(){

		Op op = new Op();
		op.PrintReceipt();
	}

}
