package Inheritance.Challenge1;

public class Main {
    public static void main(String[] args) {

        Employee eva = new Employee("Eva", "12/12/1985", "01/01/2020");
        System.out.println(eva);
        System.out.println("Age: " + eva.getAge());
        System.out.println("Pay: " + eva.collectPay());
        System.out.println();

        SalariedEmployee tress = new SalariedEmployee("Tress", "02/01/1995", "01/01/2021", 56000);
        System.out.println(tress);
        System.out.println("Salary: $" + tress.collectPay());
        tress.retire();
        System.out.println("Pension Check: " + tress.collectPay());

        HourlyEmployee vin = new HourlyEmployee("Vin", "05/04/1983", "06/01/2019", 35);
        System.out.println(vin);
        System.out.println("Salary: " + vin.collectPay());
        System.out.println("Salary incl. overtime: "  + vin.getDoublePay());

        HourlyEmployee vicky = new HourlyEmployee("Vicky", "05/05/1983", "06/01/2019", 45);
        System.out.println(vicky);
        System.out.println("Salary: " + vicky.collectPay());
        System.out.println("Salary incl. overtime: "  + vicky.getDoublePay());
    }
}
