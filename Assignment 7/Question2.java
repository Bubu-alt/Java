/*Write a program to find how an amount can be using Indian currencies starts from 1000 notes and move downward.
e.g. 9788 [1000*9, 500*1, 100*2, 50*1, 20*1, 10*1, 5*1, 2*1, 1*1]*/

package AssignmentClass7;
import java.util.Scanner;
public class Question2 {
	
	public static void main(String[] args) {
	int x, thousand, fivehundred, hundred, fifty, twenty, ten, five, two, one;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Print any 4 digit number that you want to withdraw");
	
	//code to take input
	x =  sc.nextInt(); //9788[1000*9, 500*1, 100*2, 50*1, 20*1, 10*1, 5*1, 2*1, 1*1]
	System.out.println("The available denominations of thousands, fivehundreds, hundreds, fiftys, twentys, tens, fives, twos, ones in input amount are;");
	int a = x/1000; 
	int b = (x - 1000*a)/500; 
	int c = (x - 1000*a - 500*b)/100; 
	int d = (x - 1000*a - 500*b - 100*c)/50;
	int e = (x - 1000*a - 500*b - 100*c - 50*d)/20;
	int f = (x - 1000*a - 500*b - 100*c - 50*d - 20*e)/10;
	int g = (x - 1000*a - 500*b - 100*c - 50*d - 20*e - 10*f)/5;
	int h = (x - 1000*a - 500*b - 100*c - 50*d - 20*e - 10*f - 5*g)/2;
	int i = (x - 1000*a - 500*b - 100*c - 50*d - 20*e - 10*f - 5*g - 2*h)/1;
	
	
	System.out.println("1000*" + a + " " + "500*" + b + " " + "100*" + c + " " + "50*" + d + " " + "20*" + e + " " + "10*" + f + " " + "5*" + g + " " + "2*" + h + " " + "1*" + + i);
	
	//sc.close();
    }
}
