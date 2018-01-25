package cs586.Project.Driver;

import java.util.InputMismatchException;
import java.util.Scanner;

import cs586.Project.GasPump.GasPump1;
import cs586.Project.GasPump.GasPump2;
import cs586.Project.States.State;

/**
 * This is the main class or driver for Gas Pump System.
 * @author Divyank
 * @date 4/22/2017
 *
 */

public class Driver {

	public static char choose = '1';//initialsing a char variable so that gas pump can be known
	//public static int z =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GasPump1 gp1 = new GasPump1();// creating of gas pump1 object
		GasPump2 gp2 = new GasPump2();// creating of gas pump2 object
		float a,b;
		int a1,b1,c1;
		int c;
		//char ch;
		System.out.println("\n                 CS586: Software System Architecture");
		System.out.println("\n                      Divyank Jain");
		System.out.println("\n                    Welcome to Gas Pump");
		System.out.println("\n \n \n            PLease press Enter:");
		Scanner sh = new Scanner(System.in);
		sh.nextLine();
		//while(flag){
		System.out.println("Select GP-1 or GP-2\n");
		System.out.println("      1. GP-1  ");
		System.out.println("      2. GP-2  ");

		System.out.println("\n Select gp:");

		choose = sh.next().charAt(0); // Taking input of which gas pump execution to start

		switch(choose){//switch case starts
		case '1':
			System.out.println(" GasPump1" );
			System.out.println(" Menu of Operations\n" );
			System.out.println("  0. Activate(float, float)" );
			System.out.println("  1. Start()" );
			System.out.println("  2. PayCredit()" );
			System.out.println("  3. Reject()" );
			System.out.println("  4. Cancel()" );
			System.out.println("  5. Approved()" );
			System.out.println("  6. Regular()" );
			System.out.println("  7. Super()" );
			System.out.println("  8. StartPump()" );
			System.out.println("  9. PumpGallon()" );
			System.out.println("  a. StopPump()" );
			System.out.println("  q. Quit \n \n \n" );
			System.out.println(" Please make a note of this operations");
			System.out.println("\n GP-1 Execution \n");
			
			char choose1='1';
			while(choose1!= 'q'){
				System.out.println(" Select Operations:");
				System.out.println("\n 0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-Regular,7-Super,"+"\n"
						+ "8-StartPump, 9-PumpGallon, a-StopPump, q-quit");
				choose1= sh.next().charAt(0);//taking input for operations
				switch(choose1){
				case '0':
				{
					System.out.println("\nOperation: Activation(float a, float b)\n");
					if(State.StateId==0){
					try{
						
						System.out.println("Enter the value of the parameter a:");
						a = sh.nextFloat();
						System.out.println("ENter the value of the parameter b:");
						b = sh.nextFloat();
						gp1.Activate(a, b); //gas pump 1 object calls activate function
					}
					catch(InputMismatchException Exception ){
						System.out.println("This value cannot be taken, please enter the value for which it is mentioned\n");
						System.out.println("Please select the operations again\n0");
						sh.nextLine();
					}
					}
					break;
				}
				case '1':
				{
					System.out.println("\nOperation: Start()\n");
					gp1.Start();//gas pump 1 object calls Start function
					break;
				}
				case '2':
				{
					System.out.println("\nOperation: PayCredit()\n");
					gp1.PayCredit();//gas pump 1 object calls PayCredit function
					break;
				}
				case '3':
				{
					System.out.println("\nOperation: Reject()\n");
					gp1.Reject();//gas pump 1 object calls reject function
					break;
				}
				case '4':
				{
					System.out.println("\nOperation: Cancel()\n");
					gp1.Cancel();//gas pump 1 object calls cancel function
					break;
				}
				case '5':
				{
					System.out.println("Operation: Approved()\n");
					gp1.Approved();//gas pump 1 object calls approved function
					break;
				}
				case '6':
				{
					System.out.println("\nOperation: Regular()\n");
					gp1.Regular();//gas pump 1 object calls regular function

					break;
				}
				case '7':
				{
					System.out.println("\nOperation: Super()\n");
					gp1.Super();//gas pump 1 object calls super function

					break;
				}
				case '8':
				{
					System.out.println("\nOperation: StartPump()\n");
					gp1.StartPump();
					break;
				}
				case '9':
				{
					System.out.println("\nOperation: Pump()\n");
					gp1.PumpGallon();
					break;
				}
				case 'a':
				{
					System.out.println("\nOperation: StopPump()\n");
					gp1.StopPump();
					break;
				}
				case 'q':
				{
					System.exit(0);
					sh.close();
					break;
				}//end switch
				}// end while
			} //end case 1

			break;
		case '2':
		{
			System.out.println(" GasPump2\n" );
			System.out.println(" Menu of Operations\n" );
			System.out.println("  0. Activate(int, int, int)" );
			System.out.println("  1. Start()" );
			System.out.println("  2. PayCash(int)" );
			System.out.println("  3. Cancel()" );
			System.out.println("  4. Regular()" );
			System.out.println("  5. Premium");
			System.out.println("  6. Super()" );
			System.out.println("  7. StartPump()" );
			System.out.println("  8. PumpLitre()" );
			System.out.println("  9. Stop()" );
			System.out.println("  a. Receipt()");
			System.out.println("  b. NoReceipt()");
			System.out.println("  q. Quit \n \n \n" );
			System.out.println("\n Please make a note of this operations");
			System.out.println("\n GasPump-2 Execution \n");


			char choose2='1';
			while(choose2!= 'q'){
				System.out.println(" Select Operations:");
				System.out.println("\n 0-Activate,1-Start,2-PayCash,3-Cancel,4-Regular,5-Premium,6-Super, 7- StartPump");
				System.out.println("8-PumpLitre, 9-StopPump,a-Receipt(),b- NoReceipt() q-quit");
				choose2= sh.next().charAt(0);
				switch(choose2){
				case '0':
				{
					System.out.println("\nOperation: Activation(int a, int b, int c)");

					if(State.StateId==0){
					try{
						System.out.println("\nEnter the value of the parameter a:");
						a1 = sh.nextInt();	
						System.out.println("ENter the value of the parameter b:");
						b1 = sh.nextInt();
						System.out.println("ENter the value of the parameter c:");
						c1 = sh.nextInt();

						gp2.Activate(a1, b1,c1);

					}
					catch(InputMismatchException Exception ){
						System.out.println("This value cannot be taken, please enter the value for which it is mentioned\n");
						System.out.println("Please select the operations again");
						sh.nextLine();
					}
					}
					break;
				}
				case '1':
				{
					System.out.println("\nOperation: Start()\n");
					gp2.Start();
					break;
				}
				case '2':
				{
					System.out.println("\nOperation: PayCash(int c)");
					System.out.println("\nEnter the value for c of cash value:");
					c =sh.nextInt();						
					gp2.PayCash(c);
					break;
				}
				case '3':
				{
					System.out.println("\nOperation: Cancel()\n");
					gp2.Cancel();
					break;
				}

				case '4':
				{
					System.out.println("\nOperation: Regular()\n");
					gp2.Regular();					
					break;
				}
				case '5':
				{
					System.out.println("\nOperation: Premium()\n");
					gp2.Premium();					
					break;
				}

				case '6':
				{
					System.out.println("\nOperation: Super()\n");
					gp2.Super();					
					break;
				}
				case '7':
				{
					System.out.println("\nOperation: StartPump()\n");
					gp2.StartPump();
					break;
				}
				case '8':
				{
					System.out.println("\nOperation: Pump()\n");
					gp2.PumpLiter();
					break;
				}
				case '9':
				{
					System.out.println("\nOperation: Stop()\n");
					gp2.Stop();
					break;
				}
				case 'a':
				{
					System.out.println("\nOperation: Receipt()\n");
					gp2.Receipt();
					break;
				}
				case 'b':
				{
					System.out.println("\nOperation: NoReceipt()\n");
					gp2.NoReceipt();
					break;
				}
				case 'q':
				{
					System.exit(0);
					sh.close();
					break;
				}
				}//end switch

			} // end while

			break;
		}//end case 2

		case '3':
			System.exit(0);
			sh.close();
			break;//end case 3


		default:
			System.out.println("Invalid Input");

			break;
		}//end of switch case

		//}//end of while loop
	}

}
