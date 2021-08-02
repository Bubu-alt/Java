/*WAP to implement insertion sort on an array? */

package AssignmentClass7;
import java.util.Scanner;
public class Question1 {
	public static void main(String[] args) {
		//create an array of 3 x 3 order
		int arr[][] = new int[3][3];

		System.out.println("The total one-D arrays in two-D array are " + arr.length);
		System.out.println("The total elements in every one-D arrays is " + arr[0].length);
		System.out.println("The total elements in two-D arrays is " + arr.length*arr[0].length);

		//code to take input

		System.out.println("Please enter " + arr.length*arr[0].length + " elements- ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = sc.nextInt();
			   }
			
			}

		   
		

		//code to print the result
		/*for(int i = 0; i < arr.length; i++) {
		for(int j = 0; 4 < arr[i].length; j++) 
			System.out.print(arr[i][j] + " ");
		    
		    System.out.println();
		}*/
		for(int brr[]: arr){
		for(int a:brr) {
		System.out.print(a + " ");
		   }
		 System.out.println();
		}

		//close the scanner object
		sc.close();
		    }

}
		
		/*int m, n, i, j;   
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		//taking row as input  
		m = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		//taking column as input  
		n = sc.nextInt();   
		// Declaring the two-dimensional matrix   
		int array[][] = new int[m][n];   
		// Read the matrix values   
		System.out.println("Enter the elements of the array: "); 
		  
		//loop for row  
		for (i = 0; i < m; i++)   
		//inner for loop for column  
		for (j = 0; j < n; j++)   
		array[i][j] = sc.nextInt();   
		
		//accessing array elements   
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < m; i++)   
		{   
		for (j = 0; j < n; j++)   
		//prints the array elements  
		System.out.print(array[i][j] + " ");   
		//throws the cursor to the next line  
		System.out.println();   
		}
	}
}*/



