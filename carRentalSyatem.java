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
 public void addCar(car_class car) {
     cars.add(car);
 }

 public void addCustomer(customer customer) {
     customers.add(customer);
 }
 
}
