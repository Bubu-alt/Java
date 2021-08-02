package Example;
import java.util.Scanner;
public class Ass45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int math;
		int sci;
		int ssci;
		int eng;
		

		System.out.print("Enter math marks");
		math = sc.nextInt();
		System.out.print("Enter sc marks");
		sci = sc.nextInt();
		System.out.print("Enter ssc marks");
		ssci = sc.nextInt();
		System.out.print("Enter eng marks");
		eng = sc.nextInt();
		
		int perc = ((math/100)+(sci/100)+(ssci/100)+(eng/100));
		
		if(perc >= 75){
			System.out.println("Distiction");
		} else if(perc >= 60 & perc <= 75){
			System.out.println("First division");
		} else if(perc >= 50 & perc <= 60){
			System.out.println("Second division");
		} else if(perc >= 40 & perc <= 50){
			System.out.println("Third division");
		} else{System.out.println("Failed"); 
		}
        
        sc.close();

	}

}
