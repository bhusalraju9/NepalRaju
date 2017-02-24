import java.util.ArrayList;

public class Checkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<RetailItem>rtr=new ArrayList<RetailItem>();
		
Potatoe P = new Potatoe(null, 0, 0);

rtr.add(P);
Egg eg=new Egg(null, 0,0);
rtr.add(eg);

IceCream Ice=new IceCream(null);
Sundae Sd=new Sundae(null);


	
	
	for(RetailItem x:rtr){
		
		System.out.println(x);
	}
	
	
	
	
}
}
