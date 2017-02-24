import java.util.Scanner;

public class Egg extends RetailItem
{

	@Override
	public String toString() {
		return "Egg [number=" + number + ", ppd=" + ppd + "]";
	}

	double number, ppd;

	public Egg(String name, double number, double ppd) {
		super(name);
		this.number = number;
		this.ppd = ppd;
		display();
	}
	
	double getcost() {
		System.out.println("Cost of egg is ..." +((number*ppd)/12));
		return 0;
		
	}

	public void display()
	{
		Scanner eg = new Scanner (System.in);
		System.out.println("Which egg you want to buy");
		super.name= eg.nextLine();
		System.out.println("Enter number");
		number=eg.nextDouble();
		System.out.println("Enter Price per egg");
	ppd=eg.nextDouble();
		
	getcost();
	}
	
}
