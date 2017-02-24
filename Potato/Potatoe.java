import java.util.Scanner;

//The Potatoe class should be derived from the RetailItem Item class. 
//A Potatoe item has a weight and a price per pound which are used to determine its cost. 
//For example, 2.30 lbs. of Potatoes @ $ 1.00 /lb. = $ 2. 


public class Potatoe extends RetailItem{
	
	@Override
	public String toString() {
		return "Potatoe [wgt=" + wgt + ", Priceperpound=" + Priceperpound + "]";
	}
	double wgt, Priceperpound;

	public Potatoe(String name, double wgt, double Priceperpound) {
		super(name);
		this.wgt = wgt;
		this.Priceperpound = Priceperpound;
		display();
	}
@Override
double getcost() {
	// TODO Auto-generated method stub
	System.out.println("tOTAL COST =" +(wgt*Priceperpound));
	
	return 0;
	
			//(wgt*Priceperpound);
}
public void display()
{
	System.out.println("Which potato you want to buy");
	Scanner pot = new Scanner (System.in);
	
	super.name= pot.nextLine();
	System.out.println("Enter Weight");
	wgt=pot.nextDouble();
	System.out.println("Enter Price per poud");
	Priceperpound=pot.nextDouble();
	
getcost();
}

}