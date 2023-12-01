package AtmMachine;

import java.util.*;
import java.util.Scanner;

public class AtmProcess implements AtmOperation{
    Scanner sc=new Scanner(System.in);
    Atm atm=new Atm();
    HashMap<Double,String> ms=new HashMap<>();
    public void balance() {
		 System.out.println("Available Balance:"+atm.getBalance());
		}
	public void deposit() {
		System.out.println("Enter the Amount to Deposit:");
		double deposit=sc.nextDouble();
		ms.put(deposit," Amount Deposited ");
		System.out.println(deposit+ "Deposited successfully");
		atm.setBalance(atm.getBalance()+deposit);
		
	}
	public void withdraw() {
		System.out.println("Enter the Amount to Withdraw:");
		double withdraw=sc.nextDouble();
		if(withdraw<=atm.getBalance()) {
		ms.put(withdraw," Amount Withdrawn ");
		System.out.println("Collect your cash" +withdraw);
		atm.setBalance(atm.getBalance()-withdraw);
		}
		else {
			System.out.println("Insuffient Balance");
		}
	}
	public void ministatement() {
		for(Map.Entry<Double,String> m:ms.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		}
}