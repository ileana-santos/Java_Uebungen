package Composition.Challenge1;

public class SmartKitchen {
    private CoffeeMarker brewMarker;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    //Constructor
    public SmartKitchen() {
        brewMarker = new CoffeeMarker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    //Getter
    public CoffeeMarker getBrewMaster() {
        return brewMarker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    //Methods
    public void setKitchenState(boolean coffeeFlag, boolean refrigeratorFlag, boolean dishWasherFlag){
        brewMarker.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(refrigeratorFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewMarker.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

//Class Refrigerator
class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){

        if (hasWorkToDo) {
            System.out.println("Ordering Food");
        }
    }
}

//Class DishWasher
class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher() {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {

        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}

//Class CoffeeMarker
class CoffeeMarker{
        private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {

        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

