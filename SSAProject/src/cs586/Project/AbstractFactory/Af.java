package cs586.Project.AbstractFactory;

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
 * This is a Abstract Factory class for different Gas Pump Components
 *
 *@author Divyank
 *@date 4/22/2017
 */
public abstract class Af {


	public abstract PrintReceipt getPrintReceipt();
	public abstract StoreData getStoreData();
	public abstract SetInitialValues getSetInitialValues();
	public abstract SetPrice getSetPrice();
	public abstract StoreCash getStoreCash();
	public abstract GasPumpedMsg getGasPumpedMsg();
	public abstract ReadyMsg getReadyMsg();
	public abstract CancelMsg getCancelMsg();
	public abstract PayMsg getPayMsg();
	public abstract DisplayMenu getDisplayMenu();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract RejectMsg getRejectMsg();
	public abstract StopMsg getStopMsg();
	public abstract NoReceipt getNoReceipt();
	public abstract ReturnCash getReturnCash();

}
