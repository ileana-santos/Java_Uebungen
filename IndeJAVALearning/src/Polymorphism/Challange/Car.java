package Polymorphism.Challange;

public class Car {
    private String description;

    //Constructor
    public Car(String description) {
        this.description = description;
    }


//Methods
    public void startEngine(){
        System.out.println("Start Engine");
    }

    protected void runEngine(){
        System.out.println("Run Engine");
    }

    public void drive(){
        System.out.println("Driving, type is " + getClass().getSimpleName());
        runEngine();
    }


}

//New Class
class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6 ;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

//New Class
class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int baterrySize = 6 ;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int baterrySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.baterrySize = baterrySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", baterrySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6 ;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);

    }
}
