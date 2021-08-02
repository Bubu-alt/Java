package Example;
import java.util.Scanner;
public class Ass46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		
		System.out.print("Enter year");
		year = sc.nextInt();
		
		if(year%400 == 0){
			System.out.println("Leap Year");
		} else if(year%4 == 0){
			System.out.println("Leap Year");
		} else{System.out.println("Not A Leap Year");
		}
        
        sc.close();

	}

}
