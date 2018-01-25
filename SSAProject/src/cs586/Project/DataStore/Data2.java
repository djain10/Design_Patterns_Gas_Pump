package cs586.Project.DataStore;

/**
 * This class represents Temp data store for Gas Pump-2 component.
 * @author Divyank
 */
public class Data2 extends Data{

	static int temp_a;
	static int temp_b;
	static int temp_c;
	static float price;
	static float cash;
	static float total;
	static float G;
	static float reg_price;
	static float sup_price;
	static float L;

	public void setL(float a)
	{
		L=a;
	}
	public float getL()
	{
		return L;
	}

	public int getRegGas2() {
		return temp_a;
	}
	public void setRegGas2(int a1) {
		temp_a = a1;
	}
	public int getPremGas2() {
		return temp_b;
	}
	public void setPremGas2(int b1) {
		temp_b = b1;
	}
	public int getSupGas2() {
		return temp_c;
	}
	public void setSupGas2(int c1) {
		temp_c = c1;
	}
	public  void setPrice(float a)
	{
		price =a;
	}
	public  void setCash(int a)
	{
		cash = a;
	}
	public  void setG(float a)
	{
		G = a;
	}
	public  float getPrice()
	{
		return price;
	}
	public  float getCash()
	{
		return cash;
	}
	public  float getG()
	{
		return G;
	}

	public float getTotal()
	{
		return total;
	}
	public  void setTotal(float a)
	{
		total = a;
	}



}
