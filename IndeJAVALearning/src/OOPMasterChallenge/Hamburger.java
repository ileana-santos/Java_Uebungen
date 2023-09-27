package OOPMasterChallenge;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;


    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    //Constructor

    public Hamburger(String meat, String name, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;

    }

    //Methods
    public void addHamburgerAddition1(String name, double price){

        addition1Name = addition1Name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){

        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){

        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){

        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger(){
        System.out.println("One order of "+ name + " on " + breadRollType + " with additional: " + addition1Name + ", "
                + addition2Name + ", " + addition3Name + ", " + addition4Name);
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }

}

class DeluxeBurger extends Hamburger {
    //Constructor
    public DeluxeBurger() {
        super("Beyond Meat & Vegan Cheese", "Deluxe", 19.10, "Seamen Bun");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    //Override Methods
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
}

class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //Constructor
    public HealthyBurger(String meat, double price) {
        super(meat, "Veggie Pattie", price, "Whole Grain Bun");
    }

    //Override Methods
    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Order of Veggie Pattie with additional: " + healthyExtra1Name + ", " + healthyExtra2Name);
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
