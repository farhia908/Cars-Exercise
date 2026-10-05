package Assignment;

public class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    //static members
    public static String companyName = "JUST Rentals";
    public static int totalCars = 0;

    // static methods
    public void displayCompanyName(){
        System.out.println("Company Name: " + companyName);
    }

    // constructors
    public Car(){ }

    public Car(String plateNumber, String model, double dailyRate){
        this.plateNumber = plateNumber;
        this.carModel = model;
        this.dailyRate = dailyRate;
        this.rent = false;

        totalCars ++;
    }
    // getters
    public String getPlateNumber(){
        return plateNumber;
    }
    public String getCarModel(){
        return carModel;
    }
    public double getDailyRate(){
        return dailyRate;
    }
    public boolean isRented(){
        return rent;
    }
    // setters
    public void setDailyRate(double rate){
        this.dailyRate = rate;
    }
    public void rent(){
        if(!rent){
            rent = true;
            System.out.println(carModel  + " Has been rent successfully .");
        }else
            System.out.println(carModel + "Is already rented.");
    }

    public void displayInfo(){
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Car Model: " + carModel);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Rent: " + rent);
    }
}
class Test{
    public static void main(String[] args){
        // create object..

        Car car1 = new Car("ABC-240","Corolla", 30.5 );
        Car car2 = new Car("DXY-123", "Camry", 40.7);

        System.out.println("Total Cars: " + Car.totalCars);

        //display car1 information.
        System.out.println("\n=== Car1 Information === ");
        car1.displayInfo();

        //display car2 information.
        System.out.println("\n=== Car2 Information === ");
        car2.displayInfo();

        car1.rent();


        System.out.println("\n === Change Daily Rate==== ");
        car1.setDailyRate(45.0);
        // update car1
        car1.displayInfo();

        // display getters..
        System.out.println("\n=== Getters ===");
        System.out.println("Plate: " + car1.getPlateNumber());
        System.out.println("Model: " + car1.getCarModel());
        System.out.println("Daily rate: $" + car1.getDailyRate());
        System.out.println("Is rented: " + car1.isRented());
    }
        }
