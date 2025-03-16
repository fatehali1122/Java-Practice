package customers;
import branches.BankBranch;
public class Customers{

	private String name;
	private BankBranch branchName;

	public Customers(String name, BankBranch branchName){
		this.name = name;
		this.branchName = branchName;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBranch(BankBranch branchName){
		this.branchName = branchName;
	}
	public BankBranch getBranch(){
		return branchName;
	}
	public void displayCustomer(){
		System.out.println("Customer Name: "+getName());
		System.out.println("Branch "+getBranch().getBranchName()+" Bank");
	}


}