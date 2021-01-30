package banking;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int balance = 100;
        int value;
        System.out.println("Welcome!");
        System.out.println("Your current balance is " + balance);
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to withdraw or deposit?");
        String bank = input.nextLine();

        if (bank.equals("withdraw")) {
        	System.out.println("How much would you like to withdraw?");
        	value = input.nextInt();
        	while (value<=0) {
        		System.out.println("You cannot input a negative number. Please try again.");
        		value = input.nextInt();
        	}
        	if (value>balance) {
        		System.out.println("Insufficient funds");
        	}
        	else if (value<=balance) {
        		System.out.println("Withdrew " + value);
        		balance -= value;
        	}
        	System.out.println("Your balance is " + balance);
        }
        else if (bank.equals("deposit")) {
        	System.out.println("How much would you like to deposit?");
        	value = input.nextInt();
        	
        	while (value<=0) {
        		System.out.println("You cannot input a negative number. Please try again.");
        		value = input.nextInt();
        	}
        	System.out.println("Deposited " + value);
        	balance += value;
        	System.out.println("Your balance is " + balance);
        }
    }
}