package Example;
import java.util.Scanner;
public class Ass41 {
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			float principleAmount;
			float timePeriod;
			float interestRate;
			
			System.out.print("please provide principle amount in INR");
	        principleAmount= sc.nextFloat();
	        System.out.print("please provide time period");
	        timePeriod= sc.nextFloat();
	        System.out.print("please provide interest rate in %");
	        interestRate= sc.nextFloat();
	        
	        float simpleInterest = (principleAmount * interestRate * timePeriod)/100;
	        System.out.println("The total payable amount is "+ (simpleInterest * principleAmount));
	        
	        sc.close();
		}

	}