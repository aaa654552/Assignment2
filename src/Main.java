public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Max", "RB21");
        Driver driver2 = new Driver("Charles", "SF25");
        Driver driver3 = new Driver("Oscar", "MCL39");
        Vehicle car = new Car("Audi", 2021, driver2, 5, "petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 1974, driver1, true);
        Vehicle truck = new Truck("Volvo", 2015, driver3, 23.6, 4);

        Vehicle[] vehicles = {car, motorcycle, truck};

        for(Vehicle v: vehicles){
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
        }
    }
}
