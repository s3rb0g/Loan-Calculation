import java.util.*;
public class LoanCalculation{
	
	public static void main(String args[]){
	Scanner xd = new Scanner(System.in);	
	Loan exam = new Loan();
		
	System.out.println("Loan Calculation\n");
	System.out.print("Client name: ");
		String uName = xd.next();
	System.out.print("Loan Amount: ");
		double uAmount = xd.nextDouble();
	System.out.print("Interest: ");
		double uInterest = xd.nextDouble();
	System.out.print("Months: ");
		int uMonths = xd.nextInt();
	System.out.println("\nResult:");
		
	Loan cons = new Loan(uName, uAmount, uInterest, uMonths);
	
	if(uMonths >= 1 && uMonths < 25){
		if(uMonths <= 3){
			exam.lowMonths();		
		}
		else{
			exam.highMonths();
		}
	}
	else if(uMonths <= 0 || uMonths >= 25){
		System.out.println("\nName: " + uName);
		System.out.println("Denied!");	
	}
	else{
		System.out.println("\nInvalid Syntax!");
	}		
		
	
	
	}
}