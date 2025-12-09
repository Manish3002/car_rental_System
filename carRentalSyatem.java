package c_r;

import java.util.List;
import java.util.ArrayList;

public class carRentalSyatem {
 private List<car_class> cars;// here we have declared just a list class
 private List<customer> customers;
 private List<rental> rentals;
 
 
 public carRentalSyatem (){
	 cars=new ArrayList<>(); // here we intialised a Arraylist for the storing the data as a database
	 customers = new ArrayList<>();
     rentals = new ArrayList<>();
 }
// in this i have done the adding of cars by using car_class datatype to get the the same datatype of all we used in the same cr_class
 public void addCar(car_class car) {
     cars.add(car);
 }
//in this i have done the adding of customers  by using car_class datatype to get the the same datatype of all we used in the same customers
 public void addCustomer(customer customer) {
     customers.add(customer);
 }
 
 // in this we will be checking whether the class is available or not before taking the car rent
 public void rentCar( car_class car, customer cust, int days) {
	 if(car.isAvailable()) {
		 car.rent(); // we make this car as false because if its avilable we will assign to the customer so we make it as false.
		 rentals.add(new rental(car,cust,days));
	 }else {
		 System.out.println(" Car is not avilable ");
	 }
 }public void returnCar(car_class car) {
	 car.returnCar();
	 rental rentaltoremove=null;
	 for(rental rent: rentals) {
		 if(rent.getCar()== car) {
			 rentaltoremove=rent;
			 break;
		 }
	 }
	 if(rentaltoremove!=null) {
		 rentals.remove(rentaltoremove);
	 }else {
		 System.out.println("Car was not rented");
	 }
 }
 
 // in this we will be doing the trminal interface that will be viible to the users
 public void menu() {
	 Scanner sc=new Scanner(System.in);
	 // this section will b e true until made it false 
	 while (true) {
		 System.out.println("===== Car Rental System =====");
         System.out.println("1. Rent a Car");
         System.out.println("2. Return a Car");
         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");
    //the request requried for the user will be checked here and enter his choice
         int choice = sc.nextInt();
         sc.nextLine(); 
         
         if (choice == 1) {
             System.out.println("\n== Rent a Car ==\n");
             System.out.print("Enter your name: ");
             String customerName = sc.nextLine();

             System.out.println("\nAvailable Cars:");
             for (car_class car : cars) {
                 if (car.isAvailable()) {
                     System.out.println(car.getCarId() + " - " + car.getBrand() + " " + car.getModel());
                 }
             }
	 }
 }
 }
}


