package Example;
import java.util.Scanner;
public class Ass43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float foot;
		float inches;
		
        System.out.print("please provide dimension as foot");
        foot= sc.nextFloat();
        System.out.print("please provide dimension as inches");
        inches= sc.nextFloat();
        
        float inches2 = (foot*12);
        System.out.println("Added Dimension in Inches is" + (inches + inches2));
        
        sc.close();
	}

	}


