package Polymorphism.Challange;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Corolla");
        runRace(car);

        Car toyota = new GasPoweredCar("2022 Corolla", 15.4, 6);
        runRace(toyota);

        Car telsa = new ElectricCar("2022 Telsa Model 3", 568, 75);
        runRace(telsa);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Strade",
                16,8,8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
