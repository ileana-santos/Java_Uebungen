package Account_Challenge;

import Account_Challenge.Account;

public class Main {
    public static void main(String[] args) {
        Account maxAccount = new Account();
        maxAccount.withdrawFunds(100.0);
        maxAccount.depositFunds(250);
        maxAccount.withdrawFunds(50);

        maxAccount.withdrawFunds(200);


        maxAccount.depositFunds(100);
        maxAccount.withdrawFunds(45.55);
        maxAccount.withdrawFunds(54.46);
        maxAccount.withdrawFunds(54.45);
    }
}
