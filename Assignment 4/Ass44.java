package Example;
import java.util.Scanner;
public class Ass44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		

		System.out.print("Enter num1");
		num1 = sc.nextInt();
		System.out.print("Enter num2");
		num2 = sc.nextInt();
		System.out.print("Enter num3");
		num3 = sc.nextInt();
		System.out.print("Enter num4");
		num4 = sc.nextInt();
		
		//num1 and num4
		if(num1 > num2 & (num2 > num3 & num3 > num4)){
			System.out.println("num1 is maximum and num4 is minimum");
		}else if(num1 > num3 & (num3 > num2 & num2 > num4)){
			System.out.println("num1 is maximum and num4 is minimum");
		}  
		
		//num1 and num3
		else if(num1 > num2 & (num2 > num4 & num4 > num3)){
			System.out.println("num1 is maximum and num3 is minimum");
		} else if(num1 > num4 & (num4 > num2 & num2 > num3)){
			System.out.println("num1 is maximum and num3 is minimum");
		} 
		
		//num1 and num2
		else if(num1 >num3 & (num3 > num4 & num4 > num2)){
			System.out.println("num1 is maximum and num2 is minimum");
		} else if(num1 >num4 & (num4 > num3 & num3 > num2)){
			System.out.println("num1 is maximum and num2 is minimum");
		} 
		
		
		//num2 and num1
		else if (num2 > num3 & (num3 > num4 & num4 > num1)){
			System.out.println("num2 is maximum and num1 is minimum");
		} else if (num2 > num4 & (num4 > num3 & num3 > num1)){
			System.out.println("num2 is maximum and num1 is minimum");
		} 
		
		//num2 and num3
		else if(num2 > num4 & (num4 > num1 & num1 > num3)){
			System.out.println("num2 is maximum and num3 is minimum");
		} else if(num2 > num1 & (num1 > num4 & num4 > num3)){
			System.out.println("num2 is maximum and num3 is minimum");
		}
		
		//num2 and num4
		else if(num2 > num1 & (num1 > num3 & num3 > num4)){
			System.out.println("num2 is maximum and num4 is minimum");
		} else if(num2 > num3 & (num3 > num1 & num1 > num4)){
			System.out.println("num2 is maximum and num4 is minimum");
		}
		
		
		//num3 and num1
		else if (num3 > num4 & (num4 > num2 & num2 > num1)){
			System.out.println("num3 is maximum and num1 is minimum");
		} else if (num3 > num2 & (num2> num4 & num4 > num1)){
			System.out.println("num3 is maximum and num1 is minimum");
		} 
		
		//num3 and num4
		else if(num3 > num2 & (num2 > num1 & num1 > num4)){
			System.out.println("num3 is maximum and num4 is minimum");
		} else if(num3 > num1 & (num1 > num2 & num2 > num4)){
			System.out.println("num3 is maximum and num4 is minimum");
		} 
		
		//num3 and num2
		else if(num3 > num1 & (num1 > num4 & num4 > num2)){
			System.out.println("num3 is maximum and num2 is minimum");
		} else if(num3 > num4 & (num4 > num1 & num1 > num2)){
			System.out.println("num3 is maximum and num2 is minimum");
		}
		
		
		
		//num4 and num3
		else if (num4 > num1 & (num1 > num2 & num2 > num3)){
			System.out.println("num4 is maximum and num3 is minimum");
	    } else if (num4 > num2 & (num2 > num1 & num1 > num3)){
			System.out.println("num4 is maximum and num3 is minimum");
	    } 
		//num4 and num1
		else if(num4 > num2 & (num2 > num3 & num3 > num1)){
			System.out.println("num4 is maximum and num1 is minimum");
		} else if(num4 > num3 & (num3 > num2 & num2 > num1)){
			System.out.println("num4 is maximum and num1 is minimum");
		}
		//num4 and num2
		else if(num4 > num1 & (num1 > num3 & num3 > num2)){
			System.out.println("num4 is maximum and num2 is minimum");
		} else if(num4 > num3 & (num3 > num1 & num1 > num2)){
			System.out.println("num4 is maximum and num2 is minimum");
		} 
		
		else{System.out.println("Invalid Input"); }  //AND[&] because only the truest statement will get printed.
        
        sc.close();

	}

}
