import java.util.Scanner;

public class Sundae extends IceCream{
	
	
public Sundae(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

double Costoftopping,t;

public static void main(String[] args) {
	
	Sundae n =new Sundae(null);
	
	
	
	System.out.println(cost);
	n.display();
	
	System.out.println(n.getcost());
	
}


double getcost()
{

	t=Costoftopping+cost;
	return t;
	
}

void display()
{
	Scanner Sd=new Scanner(System.in);
	System.out.println("which topping you want");
	super.name=Sd.nextLine();
	System.out.println("Enter cost of topping");
	Costoftopping=Sd.nextDouble();
	
	
	getcost();

	System.out.println("Total cost is .."+t);
}
}
