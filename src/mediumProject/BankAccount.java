package mediumProject;

public class BankAccount{
	private PersonalData customer;
	private int accountBalance;
	
	public BankAccount(PersonalData customer) {
		this.setCustomer(customer);
		this.setAccountBalance(0);
	}
	
	public void setAccountBalance(int balance) {
		this.accountBalance = balance;
	}
	
	public int getAccountBalance() {
		return this.accountBalance;
	}
	
	public void setCustomer(PersonalData customer) {
		this.customer = customer;
	}
	
	public PersonalData getCustomer() {
		return this.customer;
	}
	
	public void withdraw(int amount) {
		if (amount < this.accountBalance) {
			this.accountBalance = this.accountBalance - amount;
		}
	}
	
	public void deposit(int amount) {
		if (amount > 0) {
			this.accountBalance = this.accountBalance + amount;
		}
	}
	
	public void transfer(BankAccount personTOTransfer, int amount) {
		if (this.getAccountBalance() > amount) {
			this.setAccountBalance(this.getAccountBalance()- amount);
			personTOTransfer.setAccountBalance(personTOTransfer.getAccountBalance() + amount);
		}
	}
	
	public String toString() {
		return customer.getFirstName() + "\n" + customer.getLastName() + "\n" + customer.getAge() + "\n" + this.accountBalance;
	}
}
