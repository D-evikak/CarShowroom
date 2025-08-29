package car;

public class Car {
	private String brand;
	private String model;
	private double price;
	private double mileage;
	private String ownerName;
	private static int totalcars;
	private static String showroomName="Motors";
	public static Car c1;
	public Car(String brand,String model,double price,double mileage) {
//constructor 1
		this.model=model;
		this.brand=brand;
		this.price=price;
        this.mileage=mileage;
		this.ownerName="Not Assigned";
		totalcars++;
		
	}
	public Car(String brand,String model,double price,double mileage,String owner) {
	//constructor 2	
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.mileage=mileage;
		this.ownerName="owner";
        totalcars++;
		
	}
	public String getownerName() {
		return ownerName;
	}
	public void setOwnerName(String owner) {
		this.ownerName=owner;
		
	}
public void displayDetails() {
	System.out.println("brand:"+brand);
	System.out.println("model:"+model);
	System.out.println("price:"+price);
	System.out.println("mileage:"+mileage);
	System.out.println("owner:"+ownerName);
}
public void updateprice(double newprice) {
	this.price=newprice;
}
public static void showTotalCars() {
	System.out.println("Total cars:"+totalcars);
}
public static void showShowroomName() {
	System.out.println("showroom:"+showroomName);
}


}

public class Showroom {

	public static void main(String[] args) {
		Car c1=new Car("Toyota","corolla",15000,18.5);
		Car c2=new Car("Honda","civic",20000,16.0,"john");
		Car c3=new Car("hyundai","i20",12000,20.0);
		System.out.println("c1 details");
		c1.displayDetails();
		System.out.println("c2 details");
		c2.displayDetails();
		System.out.println("c3 details");
		c3.displayDetails();
		
		c1.setOwnerName("alice");
		c1.updateprice(1600);
		System.out.println("c1 updated:");
		c1.displayDetails();
		
		Car.showShowroomName();
		Car.showTotalCars();
		


	}



	}


