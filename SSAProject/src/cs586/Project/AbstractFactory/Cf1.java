package cs586.Project.AbstractFactory;

import cs586.Project.Strategy.CancelMsg;
import cs586.Project.Strategy.CancelMsg1;
import cs586.Project.Strategy.DisplayMenu;
import cs586.Project.Strategy.DisplayMenu1;
import cs586.Project.Strategy.GasPumpedMsg;
import cs586.Project.Strategy.GasPumpedMsg1;
import cs586.Project.Strategy.NoReceipt;
import cs586.Project.Strategy.PayMsg;
import cs586.Project.Strategy.PayMsg1;
import cs586.Project.Strategy.PrintReceipt;
import cs586.Project.Strategy.PrintReceipt1;
import cs586.Project.Strategy.PumpGasUnit;
import cs586.Project.Strategy.PumpGasUnit1;
import cs586.Project.Strategy.ReadyMsg;
import cs586.Project.Strategy.ReadyMsg1;
import cs586.Project.Strategy.RejectMsg;
import cs586.Project.Strategy.RejectMsg1;
import cs586.Project.Strategy.ReturnCash;
import cs586.Project.Strategy.SetInitialValues;
import cs586.Project.Strategy.SetInitialValues1;
import cs586.Project.Strategy.SetPrice;
import cs586.Project.Strategy.SetPrice1;
import cs586.Project.Strategy.StopMsg;
import cs586.Project.Strategy.StopMsg1;
import cs586.Project.Strategy.StoreCash;
import cs586.Project.Strategy.StoreData;
import cs586.Project.Strategy.StoreData1;

/**
 * This is a Abstract Factory class for Gas Pump 1 Component
 *	@author Divyank
 */
public class Cf1 extends Af{

	@Override
	public PrintReceipt getPrintReceipt() {
		// TODO Auto-generated method stub
		PrintReceipt pr1 = new PrintReceipt1();
		return pr1;
	}

	@Override
	public StoreData getStoreData() {
		// TODO Auto-generated method stub
		StoreData1 sd1 = new StoreData1();

		return sd1;
	}

	@Override
	public SetInitialValues getSetInitialValues() {
		// TODO Auto-generated method stub
		SetInitialValues1 siv1 = new SetInitialValues1();

		return siv1;
	}

	@Override
	public SetPrice getSetPrice() {
		// TODO Auto-generated method stub
		SetPrice1 sp1 = new SetPrice1(); 
		return sp1;
	}

	@Override
	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		// TODO Auto-generated method stub
		GasPumpedMsg1 gpm1 = new GasPumpedMsg1();

		return gpm1;
	}

	@Override
	public ReadyMsg getReadyMsg() {
		// TODO Auto-generated method stub
		ReadyMsg1 rm1 = new ReadyMsg1();		

		return rm1;
	}

	@Override
	public CancelMsg getCancelMsg() {
		// TODO Auto-generated method stub
		CancelMsg1 cm1 = new CancelMsg1(); 
		return cm1;
	}

	@Override
	public PayMsg getPayMsg() {
		// TODO Auto-generated method stub
		PayMsg1 pm1 = new PayMsg1();
		return pm1;
	}

	@Override
	public DisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		DisplayMenu1 dm1 = new DisplayMenu1();

		return dm1;
	}

	@Override
	public PumpGasUnit getPumpGasUnit() {
		// TODO Auto-generated method stub
		PumpGasUnit1 pgu1 = new PumpGasUnit1();

		return pgu1;
	}

	@Override
	public RejectMsg getRejectMsg() {
		// TODO Auto-generated method stub
		RejectMsg1 rm1 = new RejectMsg1();
		return rm1;
	}

	@Override
	public StopMsg getStopMsg() {
		// TODO Auto-generated method stub
		StopMsg1 sp1 = new StopMsg1();
		return sp1;
	}

	@Override
	public NoReceipt getNoReceipt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub

		return null;
	}



}
