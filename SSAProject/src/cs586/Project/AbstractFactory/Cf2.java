package cs586.Project.AbstractFactory;

import cs586.Project.Strategy.CancelMsg;
import cs586.Project.Strategy.CancelMsg2;
import cs586.Project.Strategy.DisplayMenu;
import cs586.Project.Strategy.DisplayMenu2;
import cs586.Project.Strategy.GasPumpedMsg;
import cs586.Project.Strategy.GasPumpedMsg2;
import cs586.Project.Strategy.NoReceipt;
import cs586.Project.Strategy.NoReceipt1;
import cs586.Project.Strategy.PayMsg;
import cs586.Project.Strategy.PayMsg2;
import cs586.Project.Strategy.PrintReceipt;
import cs586.Project.Strategy.PrintReceipt2;
import cs586.Project.Strategy.PumpGasUnit;
import cs586.Project.Strategy.PumpGasUnit2;
import cs586.Project.Strategy.ReadyMsg;
import cs586.Project.Strategy.ReadyMsg1;
import cs586.Project.Strategy.RejectMsg;
import cs586.Project.Strategy.RejectMsg1;
import cs586.Project.Strategy.ReturnCash;
import cs586.Project.Strategy.ReturnCash2;
import cs586.Project.Strategy.SetInitialValues;
import cs586.Project.Strategy.SetInitialValues2;
import cs586.Project.Strategy.SetPrice;
import cs586.Project.Strategy.SetPrice2;
import cs586.Project.Strategy.StopMsg;
import cs586.Project.Strategy.StopMsg2;
import cs586.Project.Strategy.StoreCash;
import cs586.Project.Strategy.StoreCash2;
import cs586.Project.Strategy.StoreData;
import cs586.Project.Strategy.StoreData2;

/**
 * This is a Abstract Factory class for Gas Pump 2 Component
 *	@author Divyank
 */
public class Cf2 extends Af {

	@Override
	public PrintReceipt getPrintReceipt() {
		// TODO Auto-generated method stub
		PrintReceipt2 pr2 = new PrintReceipt2();

		return pr2;
	}

	@Override
	public StoreData getStoreData() {
		// TODO Auto-generated method stub
		StoreData2 sd2 = new StoreData2();

		return sd2;
	}

	@Override
	public SetInitialValues getSetInitialValues() {
		// TODO Auto-generated method stub
		SetInitialValues2 siv2 = new SetInitialValues2();

		return siv2;
	}

	@Override
	public SetPrice getSetPrice() {
		// TODO Auto-generated method stub
		SetPrice2 sp2 = new SetPrice2();
		return sp2;
	}

	@Override
	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		StoreCash2 sc2 = new StoreCash2();
		return sc2;
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		// TODO Auto-generated method stub
		GasPumpedMsg2 gpm2 = new GasPumpedMsg2();

		return gpm2;
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
		CancelMsg2 cm2 = new CancelMsg2(); 
		return cm2;
	}

	@Override
	public PayMsg getPayMsg() {
		// TODO Auto-generated method stub
		PayMsg2 pm = new PayMsg2();
		return pm;
	}

	@Override
	public DisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		DisplayMenu2 dm2 = new DisplayMenu2();

		return dm2;
	}

	@Override
	public PumpGasUnit getPumpGasUnit() {
		// TODO Auto-generated method stub
		PumpGasUnit2 pgu2 = new PumpGasUnit2();

		return pgu2;
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
		StopMsg2 sm1 = new StopMsg2();
		return sm1;
	}

	@Override
	public NoReceipt getNoReceipt() {
		// TODO Auto-generated method stub
		NoReceipt1 np1 = new NoReceipt1();
		return np1;
	}

	@Override
	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		ReturnCash2 rc2 = new ReturnCash2();
		return rc2;
	}
}
