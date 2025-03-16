package accounts;
public class BankAccount{
	private String acc_no;
	private float balance;
	static int acc_count = 0;
	public BankAccount(String acc_no, float balance){
		this.acc_no = acc_no;
		this.balance = balance;
		acc_count += 1;
	}

	

	public String getAcc(){
		return acc_no;
}
	public float getBal(){
		return balance;
}

	public void deposit(float deposit){
		balance += deposit;
		System.out.println("Amount deposited");
		System.out.println("Total Balance: "+getBal()); 
} 
	public void withdraw(float withdraw){
		if(withdraw> balance)
			System.out.println("Insufficient Balance "+getBal());
		else{
			balance -= withdraw;
			System.out.println("Amount withdrawn");
			System.out.println("Remaining  Balance: "+getBal()); 
		}
} 
	public void displayAccount(){
		System.out.println("Account No.: "+getAcc());
		System.out.println("Total Balance: "+getBal());
}
	public void displayTacc(){
		System.out.println("Accounts Created: " + acc_count);
}
}