package Inheritance.Challenge1;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double salary = annualSalary / 26;
        double adjustedSalary = (isRetired) ? 0.9 * salary : salary;

        return (int) adjustedSalary;
    }

    public void retire(){

        terminate("12/12/2022");
        isRetired = true;
    }
}
