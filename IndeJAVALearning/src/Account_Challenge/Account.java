package Account_Challenge;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String custumerEmail;
    private String custumerPhone;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustumerEmail() {
        return custumerEmail;
    }

    public void setCustumerEmail(String custumerEmail) {
        this.custumerEmail = custumerEmail;
    }

    public String getCustumerPhone() {
        return custumerPhone;
    }

    public void setCustumerPhone(String custumerPhone) {
        this.custumerPhone = custumerPhone;
    }

    //Methods
    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance id $" + balance);
    }

    public void withdrawFunds (double withdrawalAmount) {

        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + balance);
        }
    }

}
