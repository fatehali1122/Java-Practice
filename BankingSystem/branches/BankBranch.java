package branches;
public class BankBranch{
	private String branchName;
	
	public BankBranch(String branchName){
		this.branchName = branchName;
	}
	
	public String getBranch(){
		return branchName;
	}
public String getBranchName() {
        return branchName;
    }

    // Override toString() to return the branch name instead of memory reference
    @Override
    public String toString() {
        return branchName;
    }


	public void displayBranch(){
		System.out.println("Branch "+getBranch()+" Bank");
	}

}