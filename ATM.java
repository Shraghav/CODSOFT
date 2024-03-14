import java.util.Scanner;
//1) Creating class that represent ATM machine
public class ATM {
    int withDraw(int total, int amount){
        if (amount>total){
            System.out.println("Insufficient Amount");
        }
        else{
            System.out.println("You have withdrawn "+ amount);
        }
        return amount;
    }
    void balance(int amount){
        System.out.println(amount);
    }
    void deposit(int total,int amount){
        System.out.println("You have deposited:"+amount);
    }

    //Main function
    public static  void main(String [] args){
        //Creating object for UserAccount class
        UserAccount b = new UserAccount();
        //Accessing the total amount
        int total = b.TotalAmount;
        //Creating object for ATM  class
        ATM W = new ATM();
        Scanner obj = new Scanner (System.in);

        //Withdraw and Deposit functionality
        while (true) {
            System.out.println("withdraw or deposit:");
            String name = obj.next();

            //For Withdrawing
            if (name.equals("withdraw")) {
                System.out.print("Enter Amount to withdraw:");
                int withDrawAmount = obj.nextInt();
                W.withDraw(total, withDrawAmount);
                //Accessing ATM object W for balance
                if (withDrawAmount > total) {
                    System.out.println("You only have " + total);
                    continue;
                } else if (total - withDrawAmount == 0) {
                    System.out.println("Your bank balance is nill. You cannot withdraw anymore");
                    break;
                }
                System.out.println("Balance amount:");
                W.balance(total - withDrawAmount);
            }

            //For depositing
            if (name.equals("deposit")) {
                System.out.println("Enter Amount to deposit:");
                int depositAmount = obj.nextInt();
                //depositing the required amount
                W.deposit(total, depositAmount);
                System.out.println("Balance amount:");
                W.balance(total + depositAmount);
                total = total + depositAmount;
            }
        }
        obj.close();

    }
}
//4) Creating class that represent user's bank account
class UserAccount {
int TotalAmount=100000;
}

