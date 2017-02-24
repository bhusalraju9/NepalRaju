import java.util.Scanner;

public class IceCream extends RetailItem{
	
	static double cost;
	
	public static void main(String[] args) {
		new IceCream(null);
		
	}
	
	
public IceCream(String name) {
		super(name);
		display();
	}






	double getcost() 
	{
		return cost;

	}

void display()
{
	Scanner Ice=new Scanner (System.in);
	System.out.println("Which icecream do you want");
	super.name=Ice.nextLine();
	System.out.println("What is the cost");
	cost=Ice.nextDouble();
	System.out.println("total cost is "+getcost());
	System.out.println(cost);
	
}
	
}
