package cs586.Project.DataStore;

/**
 * This class represents Temp data store for Gas Pump-1 component.
 * @author Divyank
 */
public class Data1 extends Data {

	static float temp_a;
	static float temp_b;
	static float price;
	static float total;
	static float G;

	public float getRegGas1() {
		return temp_a;
	}
	public void setRegGas1(float a) {
		temp_a=a;
	}
	public float getSupGas1() {
		return temp_b ;
	}
	public void setSupGas1(float b) {
		temp_b = b;
	}

	public  void setPrice(float a)
	{
		price =a;
	}
	public  void setG(float a)
	{
		G = a;
	}
	public  float getPrice()
	{
		return price;
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
