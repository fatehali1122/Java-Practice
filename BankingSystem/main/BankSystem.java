package main;
import customers.Customers;
import accounts.BankAccount;
import branches.BankBranch;
import java.util.Scanner;
public class BankSystem{
	public static void main(String [] args){
		BankBranch b = new BankBranch("HBL");
		
		Customers c = new Customers("Fateh Ali",b);
		BankAccount acc = new BankAccount("12",1000.0f);
		Scanner sc = new Scanner(System.in);
	
		while(true){
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. View Acc details");
			System.out.println("4. Total Accounts");
			System.out.println("5. Exit.");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			if(choice == 1)
				acc.deposit(500);
			else if(choice == 2)
				acc.withdraw(100);
			else if(choice == 3){
				c.displayCustomer();
				acc.displayAccount();
}
			else if(choice == 4)
				acc.displayTacc();
			else if(choice == 5)
				break;
}	
	}
}