package chapter3;
import java.util.Scanner;


public class Account {
    private float balances;
    private float number;

    public Account(Float balance, Float number){
        this.balances = balance;
        this.number = number;
    }
    public float deposit(Float number){
        return this.balances + number;
    }

    public float withdraw (Float number){
        return this.balances - number;
    }
    public static void main(String[] args){
        Scanner acc1 = new Scanner(System.in);
        System.out.print("Enter account 1 balance: ");
        float a1 = acc1.nextFloat();
        Scanner acc2 = new Scanner(System.in);
        System.out.print("Enter account 2 balance: ");
        float a2 = acc2.nextFloat();
        Scanner amount = new Scanner(System.in);
        System.out.print("Enter amount to withdraw for account1: ");
        float amount1 = amount.nextFloat();
        Account display = new Account(a1, amount1);
        System.out.println("The new balance for is " + display.withdraw(amount1));
        Scanner amounts = new Scanner(System.in);
        System.out.print("Enter amount to withdraw for account2: ");
        float amount2 = amounts.nextFloat();
        Account display1 = new Account(a2, amount2);
        System.out.println("The new balance is " + display1.withdraw(amount2));
    }
}
