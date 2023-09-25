package Inheritance.Challenge1;

public class HourlyEmployee extends Employee{

    private double hourly;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourly) {
        super(name, birthDate, hireDate);
        this.hourly = hourly;
    }

    @Override
    public double collectPay() {

        return 40 * hourly;
    }

    public double getDoublePay() {
        if (hourly <= 40 ){
            return collectPay();
        } else {
            return ((hourly - 40) * 2) + collectPay(); //Return Salary incl. overtime pay
        }
    }
}
