package ejerciciosPropuestos3;

public class Account {
	
	private String customerName;
	private String accountName;
	private double interestType;
	private double balance;
	
	public double getInterestType() {
		return interestType;
	}

	public void setInterestType(double interestType) {
		this.interestType = interestType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Account(){
		
	}
	
	public Account(String customerName,String accountName,double interestType,double balance) {
		
		this.customerName=customerName;
		this.accountName=accountName;
		this.interestType=interestType;
		this.balance=balance;
	}
	
	public void setBalance(double amount) {
		
		this.balance=amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public boolean deposit(double amount) {
		
		if (amount<=0) {
			return false;
		}
		this.balance+=+amount;
		return true;
	}
	
	public boolean reimbursement(double amount) {
		
		if (amount>this.balance|| amount<=0) {
			return false;
		}
		
		this.balance-=amount;
		
		return true;
	}
	
	public boolean transfer(Account customer,double amount) {
		
		if (amount>this.balance) {
			return false;
		}
		this.reimbursement(amount);
		
		customer.deposit(amount);
		
		return true;		
		
	}
	
	@Override
	public String toString() {
		
		return "Cuenta a nombre de "+this.customerName+": "+this.accountName+". Saldo "+this.balance+".";
	}
}
