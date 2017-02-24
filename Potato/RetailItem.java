//The RetailItem class is an abstract superclass from which specific types of Grocery 
//Items can be derived. It contains only one data member, a name. It also defines a number of methods.
//All of the RetailItem class methods except the getCost() method are defined in a generic way in the file
//RetailItem.java. The getCost() method is an abstract method that is not defined in the RetailItem class
//because the method of determining the costs varies based on the type of item.
//DO NOT CHANGE THE RetailItem.java file! Your code must work with this class as it is provided

public abstract class RetailItem {

	String name;
	

public RetailItem(String name) {
		super();
		this.name = name;
	}

double getcost() {
	return 0;
}
}



