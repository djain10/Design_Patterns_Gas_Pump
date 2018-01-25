package cs586.Project.Output;

import cs586.Project.AbstractFactory.Cf1;
import cs586.Project.AbstractFactory.Cf2;
import cs586.Project.Driver.Driver;
import cs586.Project.Strategy.CancelMsg;
import cs586.Project.Strategy.DisplayMenu;
import cs586.Project.Strategy.GasPumpedMsg;
import cs586.Project.Strategy.NoReceipt;
import cs586.Project.Strategy.PayMsg;
import cs586.Project.Strategy.PrintReceipt;
import cs586.Project.Strategy.PumpGasUnit;
import cs586.Project.Strategy.ReadyMsg;
import cs586.Project.Strategy.RejectMsg;
import cs586.Project.Strategy.ReturnCash;
import cs586.Project.Strategy.SetInitialValues;
import cs586.Project.Strategy.SetPrice;
import cs586.Project.Strategy.StopMsg;
import cs586.Project.Strategy.StoreCash;
import cs586.Project.Strategy.StoreData;

/**
 * This Output Processor class is used for delegating and executing the action.
 * @author Divyank
 *
 */
public class Op {

	char ch = Driver.choose;
	public void StoreData(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			StoreData sd;
			sd =cf.getStoreData();
			sd.storeData();

		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			StoreData sd;
			sd =cf.getStoreData();
			sd.storeData();

		}
	}
	public void PayMsg(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			PayMsg pm;
			pm =cf.getPayMsg();
			pm.payMsg();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			PayMsg pm;
			pm =cf.getPayMsg();
			pm.payMsg();
		}

	}
	public void StoreCash(int c){

		Cf2 cf = new Cf2();
		StoreCash sc;
		sc =cf.getStoreCash();
		sc.storeCash(c);

	}
	public void DisplayMenu(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			DisplayMenu dsp  ;
			dsp = cf.getDisplayMenu();
			dsp.displayMenu();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			DisplayMenu dsp;
			dsp = cf.getDisplayMenu();
			dsp.displayMenu();
		}
	}
	public void RejectMsg(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			RejectMsg rm;
			rm = cf.getRejectMsg();
			rm.rejectMsg();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			RejectMsg rm;
			rm = cf.getRejectMsg();
			rm.rejectMsg();
		}
	}
	public void SetPrice(int g){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			SetPrice sp;
			sp = cf.getSetPrice();			
			sp.setPrice(g);

		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			SetPrice sp;
			sp = cf.getSetPrice();			
			sp.setPrice(g);
		}

	}
	public void ReadyMsg(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			ReadyMsg rm;
			rm = cf.getReadyMsg();
			rm.readyMsg();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			ReadyMsg rm;
			rm = cf.getReadyMsg();
			rm.readyMsg();
		}
	}
	public void SetInitialValues(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			SetInitialValues sin;
			sin = cf.getSetInitialValues();
			sin.setInitialValues();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			SetInitialValues sin;
			sin = cf.getSetInitialValues();
			sin.setInitialValues();
		}	
	}
	public void PumpGasUnit(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			PumpGasUnit pgu;
			pgu = cf.getPumpGasUnit();
			pgu.pumpGasUnit();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			PumpGasUnit pgu;
			pgu = cf.getPumpGasUnit();
			pgu.pumpGasUnit();
		}
	}
	public void GasPumpedMsg(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			GasPumpedMsg gpm;
			gpm = cf.getGasPumpedMsg();
			gpm.gasPumpedMsg();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			GasPumpedMsg gpm;
			gpm = cf.getGasPumpedMsg();
			gpm.gasPumpedMsg();
		}
	}
	public void StopMsg(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			StopMsg sm;
			sm = cf.getStopMsg();
			sm.stopMsg();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			StopMsg sm;
			sm = cf.getStopMsg();
			sm.stopMsg();
		}
	}
	public void PrintReceipt(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			PrintReceipt pm;
			pm = cf.getPrintReceipt();
			pm.printReceipt();
		}
		if(ch == '2'){

			Cf2 cf = new Cf2();
			PrintReceipt pm;
			pm = cf.getPrintReceipt();
			pm.printReceipt();

		}
	}
	public void CancelMsg(){
		if(ch == '1'){
			Cf1 cf = new Cf1();
			CancelMsg cm;
			cm =cf.getCancelMsg();
			cm.cancelMsg();
		}
		if(ch == '2'){
			Cf2 cf = new Cf2();
			CancelMsg cm;
			cm =cf.getCancelMsg();
			cm.cancelMsg();
		}
	}
	public void ReturnCash(){


		Cf2 cf = new Cf2();
		ReturnCash rc;
		rc = cf.getReturnCash();
		rc.returnCash();

	}

	public void NoReceipt(){
		Cf2 cf = new Cf2();
		NoReceipt nr;
		nr = cf.getNoReceipt();
		nr.noReceipt();
	}


}
