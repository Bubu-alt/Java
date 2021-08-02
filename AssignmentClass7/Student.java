/*Create a class student that has three attributes (name, roll no & marks). 
Create an array of three students and perform following operations
=> Sort them according to roll no
=> Sort them according to marks
=> Print details of topper*/


package AssignmentClass7;
import java.util.Scanner;
public class Student {
	String name;
	int rollNo;
	float marks;
	
	/*static void rollSort(){
		if(std[0].rollNo > 
	}*/

		public static void main(String[] args) {
			//create an array of Student references
					Student std[] = new Student[3];
					
					//assign object to each reference: poor way
					//prr[0] = new Product();
					//prr[1] = new Product();
					//prr[2] = new Product();
					
					//better way
					for(int i = 0; i < std.length; i++) {
						std[i] = new Student();
					}
					
					//code to take input
					Scanner sc = new Scanner(System.in);
					
					for(int i = 0; i < std.length; i++) {
						System.out.println("Please enter Student Name, RollNo and Marks");
						std[i].name = sc.next();
						std[i].rollNo = sc.nextInt();
						std[i].marks = sc.nextFloat();
						System.out.println("Student" + " " + std[i].name + "'s" + "  " + "Roll No. and Marks are = " + std[i].rollNo + ", " + "  " + std[i].marks); 
					}
	//System.out.println("Student" + " " + std[i].name + "'s" + "Roll No. and Marks are = " + std[i].rollNo + " " + std[i].marks);				
               //Student sort = new Student();
               //sort.rollSort();
				if(std[0].marks > std[1].marks && std[1].marks > std[2].marks ){
					System.out.println("Student Names according to higher to lower of Marks is " + std[0].name + std[1].name + std[2].name);
					System.out.println("Topper" + "  " + std[0].name + "'s" + "  " + "Marks and RollNo are = " + "  " + std[0].marks + "  " + std[0].rollNo);
				}
				else if(std[0].marks > std[2].marks && std[2].marks > std[1].marks ){
					System.out.println("Student Names according to higher to lower of Marks is " + std[0].name + std[2].name + std[1].name);
					System.out.println("Topper" + "  " + std[0].name + "'s" + "  " + "Marks and RollNo are = " + "  " + std[0].marks + "  " + std[0].rollNo);
				}
				else if(std[1].marks > std[2].marks && std[2].marks > std[0].marks ){
					System.out.println("Student Names according to higher to lower of Marks is  " + std[1].name + std[2].name + std[0].name);
					System.out.println("Topper" + "  " + std[1].name + "'s" + "  " + "Marks and RollNo are = " + "  " + std[1].marks + "  " + std[1].rollNo);
				}
				else if(std[1].marks > std[0].marks && std[0].marks > std[2].marks ){
					System.out.println("Student Names according to higher to lower of Marks is  " + std[1].name + std[0].name + std[2].name);
					System.out.println("Topper" + "  " + std[1].name + "'s" + "  " + "Marks and RollNo are = " + "  " + std[1].marks + "  " + std[1].rollNo);
				}
				else if(std[2].marks > std[1].marks && std[1].marks > std[0].marks ){
					System.out.println("Student Names according to higher to lower of Marks is " + std[2].name + std[1].name + std[0].name);
					System.out.println("Topper" + "  " + std[2].name + "'s" + "  " + "Marks and RollNo are = " + "  " + std[2].marks + "  " + std[2].rollNo);
				}
				else if(std[2].marks > std[0].marks && std[0].marks > std[1].marks ){
					System.out.println("Student Names according to higher to lower of Marks is " + std[2].name + std[0].name + std[1].name);
					System.out.println("Topper" + "  " + std[2].name + "'s" + "  " + "Marks and RollNo are = " + "  " + std[2].marks + "  " + std[2].rollNo);
				}
                /*for(int x=0; x<std.length; x++){
                	for(int y=0; y<std[i].length; y++){*/
				if(std[0].rollNo > std[1].rollNo && std[1].rollNo > std[2].rollNo ){
					System.out.println("Student Names according to higher to lower of RollNo is " + std[0].name + std[1].name + std[2].name);
				}
				else if(std[0].rollNo > std[2].rollNo && std[2].rollNo > std[1].rollNo ){
					System.out.println("Student Names according to higher to lower of RollNo is " + std[0].name + std[2].name + std[1].name);
				}
				else if(std[1].rollNo > std[2].rollNo && std[2].rollNo > std[0].rollNo ){
					System.out.println("Student Names according to higher to lower of RollNo is " + std[1].name + std[2].name + std[0].name);
				}
				else if(std[1].rollNo > std[0].rollNo && std[0].rollNo > std[2].rollNo ){
					System.out.println("Student Names according to higher to lower of RollNo is " + std[1].name + std[0].name + std[2].name);
				}
				else if(std[2].rollNo > std[1].rollNo && std[1].rollNo > std[0].rollNo ){
					System.out.println("Student Names according to higher to lower of RollNo is" + std[2].name + std[1].name + std[0].name);
				}
				else if(std[2].rollNo > std[0].rollNo && std[0].rollNo > std[1].rollNo ){
					System.out.println("Student Names according to higher to lower of RollNo is" + std[2].name + std[0].name + std[1].name);
				}
                		
                	}
                
					
					
		}

	


/*------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Product {
	String productName;
	float price;		//price is in rupees
	float taxes;		//taxes in percentage
	
	float getSellingPrice() {
		float sellingPrice = price + price*taxes/100;
		return sellingPrice;
	}
	
	public static void main(String[] args) {
		//create an array of references
		Product prr[] = new Product[3];
		
		//assign object to each reference: poor way
		//prr[0] = new Product();
		//prr[1] = new Product();
		//prr[2] = new Product();
		
		//better way
		for(int i = 0; i < prr.length; i++) {
			prr[i] = new Product();
		}
		
		//code to take input
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < prr.length; i++) {
			System.out.println("Please enter product-name, price and taxes");
			prr[i].productName = sc.next();
			prr[i].price = sc.nextFloat();
			prr[i].taxes = sc.nextFloat();
			
			System.out.println("The selling price of product " + prr[i].productName + " is " + prr[i].getSellingPrice());
		}
	}
}

	Please enter product-name, price and taxes
	Cream 52 10.5
	The selling price of product Cream is 57.46
	Please enter product-name, price and taxes
	Mobile
	15000 5.5
	The selling price of product Mobile is 15825.0
	Please enter product-name, price and taxes
	Umbrella
	450
	10
	The selling price of product Umbrella is 495.0*/
