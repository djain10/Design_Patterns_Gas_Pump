package cs586.Project.MdaEfsm;

import cs586.Project.DataStore.Data2;
import cs586.Project.Driver.Driver;
import cs586.Project.States.S0;
import cs586.Project.States.S1;
import cs586.Project.States.S2;
import cs586.Project.States.S3;
import cs586.Project.States.S4;
import cs586.Project.States.S5;
import cs586.Project.States.S6;
import cs586.Project.States.Start;
import cs586.Project.States.State;

/**
 * This class is used for implementing the MDA-EFSM platform independent class.

 * @author Divyank
 *
 */
public class MdaEfsm {

	State st;

	static int[] sls = new int[8];
	char ch = Driver.choose;

	State[] ls = new State[8];
	public void Activate(){
		st = new Start();
		if( st.getStateId()==0){
			st.Activate();		
			st.setStateId(st.getStateId()+1);
			sls[st.getStateId()] = 1;
			System.out.println("Gas Pump Is Activated");

		}

		else{
			System.out.println("Null modifications");
		}
	}
	public void Start(){
		S0 s0 = new S0();
		if(st.getStateId()==1 && (sls[st.getStateId()]== 1))
		{			
			s0.Start();
			st.setStateId(st.getStateId()+1);
			sls[st.getStateId()] =2;
		}
		else{
			System.out.println("Null modifications");
		}			
	} 
	public void PayCredit(){
		S1 s1 = new S1();
		if(st.getStateId()==2 && (sls[st.getStateId()]== 2)){

			s1.PayCredit();
			st.setStateId(st.getStateId()+1);
			sls[st.getStateId()] =3;
		}
		else{
			System.out.println("Null modifications");
		}			

	} 	
	public void PayCash(int c){
		S1 s1 = new S1();
		if(st.getStateId()==2 && (sls[st.getStateId()]== 2)){

			s1.PayCash(c);
			st.setStateId(st.getStateId()+2);
			sls[st.getStateId()] = 4;
		}
		else{
			System.out.println("Null modifications");
		}			

	} 
	public void Reject(){
		S2 s2 = new S2();
		if(st.getStateId()==3 && (sls[st.getStateId()]== 3)){

			s2.Reject();
			st.setStateId(st.getStateId()-2);
			sls[st.getStateId()] = 1;
		}
		else{
			System.out.println("Null modifications");
		}			

	} 
	public void Cancel(){
		S3 s3 = new S3();
		if(st.getStateId()==4 && (sls[st.getStateId()]== 4)){

			s3.Cancel();
			st.setStateId(st.getStateId()-3);
			sls[st.getStateId()] =1;
		}
		else{
			System.out.println("Null modifications");
		}			

	} 
	public void Approved(){
		S2 s2 = new S2();
		if(st.getStateId()==3 && (sls[st.getStateId()]== 3)){

			s2.Approved();
			st.setStateId(st.getStateId()+1);
			sls[st.getStateId()] =4;
		}
		else{
			System.out.println("Null modifications");
		}			

	} 	
	public void StartPump(){
		S4 s4 = new S4();
		if(st.getStateId()==5 && (sls[st.getStateId()]== 5)){

			s4.StartPump();
			st.setStateId(st.getStateId()+1);
			sls[st.getStateId()] =6;
		}
		else{
			System.out.println("Null modifications");
		}			

	} 
	public void SelectGas(int g){
		S3 s3 = new S3();
		if(st.getStateId()==4 && (sls[st.getStateId()]== 4)){

			s3.SelectGas(g);
			st.setStateId(st.getStateId()+1);
			sls[st.getStateId()] =5;
		}
		else{
			System.out.println("Null modifications");
		}			

	}


	public void Pump(){
		S5 s5 = new S5();

		Data2 dt = new Data2();
		if(st.getStateId()==6 && (sls[st.getStateId()]== 6)){
			if(ch =='1'){
				s5.Pump();
			}
			else if(ch=='2'){
				if(dt.getCash()<(dt.getL() + 1)*dt.getPrice() ){
					s5.StopPump();
				}

				else {
					s5.Pump();
				}
			}
		}
		else{
			System.out.println("Null modifications");
		}			

	} 
	public void Receipt(){
		S6 s6 = new S6();
		if(st.getStateId()==7 && (sls[st.getStateId()]== 7)){

			s6.Receipt();
			st.setStateId(st.getStateId()-6);
			sls[st.getStateId()] =1;
		}
		else{
			System.out.println("Null modifications");
		}			

	}
	public void NoReceipt(){
		S6 s6 = new S6();
		if(st.getStateId()==7 && (sls[st.getStateId()]== 7)){

			s6.NoReceipt();
			st.setStateId(st.getStateId()-6);
			sls[st.getStateId()] =1;
		}
		else{
			System.out.println("Null modifications");
		}			

	}
	public void StopPump(){
		S5 s5 = new S5();
		if(st.getStateId()==6 && (sls[st.getStateId()]== 6)){
			if(Driver.choose == '1'){
			s5.StopPump();
			s5.Receipt();
			}
			if(Driver.choose == '2'){
				s5.StopPump();
			}
			st.setStateId(st.getStateId()+1);
			sls[st.getStateId()] =7;
		}
		else{
			System.out.println("Null modifications");
		}			

	}	


}
