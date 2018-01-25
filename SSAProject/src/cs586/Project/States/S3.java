package cs586.Project.States;

import cs586.Project.Driver.Driver;
import cs586.Project.Output.Op;

/**
 * This class is used for representing intermediate state called S3
 * @author Divyank
 *
 */
public class S3 extends State {

	@Override
	public void Cancel(){

		//Changed from S3 to S0
		Op op = new Op();
		op.CancelMsg();
		op.ReturnCash();
	}

	@Override
	public void SelectGas(int g){

		if(Driver.choose =='1'){
			if(g == 1){
				System.out.println("Regular gas is selected to pump");
			}

			else if(g == 2) {
				System.out.println("Super Gas is selected to pump");
			}
		}
		else if(Driver.choose == '2')
			if(g == 1){
				System.out.println("Regular gas is selected to pump");
			}

			else if(g == 2){
				System.out.println("Premium gas  is selected to pump");
			}

			else if(g == 3) {
				System.out.println("Super Gas is selected to pump");
			}

		Op op = new Op();
		op.SetPrice(g);
	}
}
