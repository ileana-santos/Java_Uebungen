package Constructors;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    //Constructors


    public Customer() {
        this("Nobody","nobody@nowhere.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 1000.00, emailAddress);
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    //Getter
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }





}
