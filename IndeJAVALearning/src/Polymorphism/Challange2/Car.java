package Polymorphism.Challange2;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

//Constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    //Getter for cylinders & name
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    //Methods
    public String startEngine(){
       return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }
}
class  Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class  Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
       return super.brake();
    }
}

class  Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
       return super.brake();
    }
}
