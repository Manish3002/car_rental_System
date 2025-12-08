package c_r;

public class rental {
	private car_class car;
    private customer customer;
    private int days;

    public rental(car_class car, customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public car_class getCar() {
        return car;
    }

    public customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}
