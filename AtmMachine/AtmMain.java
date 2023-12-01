package AtmMachine;

import java.util.Scanner;

public class AtmMain {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("============= ATM Machine INFORMATION ================");
	String ch;
	AtmProcess ap=new AtmProcess();
	do
	{
	
	System.out.println(" 1)To Deposit Amount.\n"
			+ " 2)To Withdraw Amount.\n"
			+ " 3)To Check Balance.\n"
			+ " 4)To Print Ministatement.\n"
			+ " 5)Exit.\n");
	System.out.println("Enter your choice:");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	
	case 1:	ap.deposit();
			break;
	case 2:	ap.withdraw();
	        break;
	case 3:	ap.balance();
	        break;
	case 4:	ap.ministatement();
	        break; 
    default:System.out.println("collect your ATM card");
            System.out.println("Thank you for Using ATM Machine");
	
    
	}
	System.out.println("Do you want to continue? (Y-Yes / N-No)");
	 ch=sc.next();
	}
	while(ch.equals("Y")||ch.equals("y"));

	System.out.println("Thank You!");


}

}
