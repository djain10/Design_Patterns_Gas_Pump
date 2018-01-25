package cs586.Project.GasPump;

import cs586.Project.DataStore.Data1;
import cs586.Project.MdaEfsm.MdaEfsm;

/**
 * The Gas Pump1 is the input processor
 * @author Divyank
 *
 */
public class GasPump1 {
	MdaEfsm mda = new MdaEfsm();
	public void Activate(float a, float b) // the gas pump is activated where a is regular price and b is super price both are floating numbers
	{
		if(a>0 && b>0){
			Data1 data = new Data1();
			data.setRegGas1(a);
			data.setSupGas1(b);			
			mda.Activate();
		}
	}



	public void Start(){

		mda.Start();

	}
	public void PayCredit(){

		mda.PayCredit();
	} 	
	public void Reject(){

		mda.Reject();

	}
	public void Cancel(){

		mda.Cancel();
	} 
	public void Approved(){

		mda.Approved();
	} 	
	public void Super(){
		mda.SelectGas(2);
	}  
	public void Regular(){

		mda.SelectGas(1);

	}  
	public void StartPump(){

		mda.StartPump();
	}
	public void PumpGallon(){

		mda.Pump();

	} 	
	public void StopPump(){

		mda.StopPump();
		

	} 	


}
