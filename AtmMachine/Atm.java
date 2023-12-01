package AtmMachine;

public class Atm {
    private double balance;
    private double deposit;
    private double withdraw;
    Atm(){
    	
    }
	public Atm(double balance, double deposit, double withdraw) {
		super();
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", deposit=" + deposit + ", withdraw=" + withdraw + "]";
	}
	
	
}