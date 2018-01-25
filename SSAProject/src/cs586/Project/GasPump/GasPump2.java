package cs586.Project.GasPump;

import cs586.Project.DataStore.Data2;
import cs586.Project.MdaEfsm.MdaEfsm;

/**
 * The Gas Pump1 is the input processor
 * @author Divyank
 *
 */

public class GasPump2 {
	MdaEfsm mda = new MdaEfsm();
	public void Activate(int a, int b, int c){

		if(a>0 && b>0 && c>0){
			Data2 data2 = new Data2();
			data2.setRegGas2(a);
			data2.setPremGas2(b);
			data2.setSupGas2(c);
			mda.Activate();			
		}
	} 
	public void Start(){
		mda.Start();
	} 
	public void PayCash(int c){
		mda.PayCash(c);
	} 
	public void Cancel(){
		mda.Cancel();
	} 
	public void Super(){
		mda.SelectGas(3);
	}	
	public void Premium(){
		mda.SelectGas(2);
	} 
	public void Regular(){
		mda.SelectGas(1);
	}  
	public void StartPump(){
		mda.StartPump();
	} 
	public void PumpLiter(){
		Data2 data = new Data2();

		if(data.getCash()<(data.getL() + 1)*data.getPrice() )
			mda.StopPump();
		else
			mda.Pump();
	} 
	public void Stop(){
		mda.StopPump();
	} 	
	public void Receipt(){
		mda.Receipt();	
	} 
	public void NoReceipt(){
		mda.NoReceipt();
	} 


}
