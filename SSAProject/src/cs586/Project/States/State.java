package cs586.Project.States;

import cs586.Project.Output.Op;

/**
 * This Abstract class is used for representing Base State.
 *
 * It involves centralized state implementation.

 * @author Divyank
 *
 */

public abstract class State {

	Op op;//object of the output processor
	public static int StateId;    
	public int getStateId()
	{
		return StateId;
	}
	public void set_op(Op o)
	{
		op = o;
	}
	public void setStateId(int a)
	{
		StateId = a;
	}
	
	public void Activate(){}
	public void Start(){}
	public void PayCredit(){}
	public  void PayCash(int t){} 
	public  void Reject(){}
	public  void Cancel(){}
	public  void Approved(){}
	public  void StartPump(){}
	public  void Pump(){}
	public  void StopPump(){}
	public  void SelectGas(int g){}
	public  void Receipt(){}
	public  void NoReceipt(){} 


}
