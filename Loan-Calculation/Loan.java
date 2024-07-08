import java.util.*;
public class Loan extends LoanCalculation{
	static String name;
	static double amount; 
	static double interest;
	static int months;
	
	static double total;
	static double inter;
	
	Loan(){
	}
	
	Loan(String name, double amount, double interest, int months){
		this.name = name;
		this.amount = amount;
		this.interest = interest;	
		this.months = months;
	}

	public static void lowMonths(){
	double tAmount = comLow(amount, interest, months);
		
		System.out.println("\nName: " + name);
		System.out.println("Total amount: " + tAmount + "\n");
				
	double month = monthly(tAmount);
	for(int i = 1; i <= months; i++){
		System.out.println("Month " + i + ": " + month);
		}
	System.out.println("\nApproved!");			
	}	
		
		
	public static void highMonths(){
	double ans3 = comHigh(amount, interest);
	
		System.out.println("\nName: " + name);
		System.out.println("Total amount: " + ans3 + "\n");
				
	double ans4 = monthly(ans3);
	for(int j = 1; j <= months; j++){
		System.out.println("Month " + j + ": " + ans4);
	}
	System.out.println("\nApproved!");
		
	}	
	
	public static double comLow(double amou, double inte, int mont){
		inter = inte / 100.0;
		total = amou * inter;
		total += amou;
		double deducMonths = mont * 100;
		total -= deducMonths;
		
		return total;
		
	}

	
	public static double comHigh(double amou, double inte){
		inter = inte / 100.0;
		total = amou * inter;
		total += amou;
		
		return total;
	}

	public static double monthly(double all){
		double answer = all / months;
		answer = Math.round(answer * 100)/100.0;
		
		return answer;
	}
	
}