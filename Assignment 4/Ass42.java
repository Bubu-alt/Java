package Example;
import java.util.Scanner;
public class Ass42 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float basicSalary;
		float hra;
		float da;
		float ta;
		float pf;
		
        System.out.print("please provide basicSalary in INR");
        basicSalary= sc.nextFloat();
        System.out.print("please provide hra in %");
        hra= sc.nextFloat();
        System.out.print("please provide da in %");
        da= sc.nextFloat();
        System.out.print("please provide ta in %");
        ta= sc.nextFloat();
        System.out.print("please provide pf in %");
        pf= sc.nextFloat();
        
        float grossSalary = (basicSalary + (hra*100) + (da*100) + (ta*100) + (pf*100));
        System.out.println("GrossSalary" + grossSalary);
        
        sc.close();
	}
}
