package AssignmentClass8;


class Employee{
	private int point;

	public int getPoint() {
		return point;
	}
    public void setPoint(int point) {
		this.point = point;
	}
    
    
}//class close


 class PerformanceRating{
	 private int outstanding = 5;
	 private int good = 4;
	 private int average = 3;
	 private int poor = 2;
	 
	 static void calculatePerformaceE1(Employee e1){
			
		      if(e1.getPoint()>=80){
		    	  System.out.println("e1 has an performance rating outstanding:  5");
		       }
		       else if(e1.getPoint()>=60 && e1.getPoint() <=79){
		    	   System.out.println("e1 has an performance rating of good:  4");
		       }
		       else if(e1.getPoint()>=50 && e1.getPoint() <=59){
		    	   System.out.println("e1 has an performance rating of average:  3");
		       }
		       else if(e1.getPoint()>=1 && e1.getPoint() <=49){
		    	   System.out.println("e1 has an performance rating of poor:  2");
		       }
	    
	    }//method close
	 static void calculatePerformaceE2(Employee e2){
			
	      if(e2.getPoint()>=80){
	    	  System.out.println("e1 has an performance rating of outstanding:  5");
	       }
	       else if(e2.getPoint()>=60 && e2.getPoint() <=79){
	    	   System.out.println("e1 has an performance rating of good:  4");
	       }
	       else if(e2.getPoint()>=50 && e2.getPoint() <=59){
	    	   System.out.println("e1 has an performance rating of average:  3");
	       }
	       else if(e2.getPoint()>=1 && e2.getPoint() <=49){
	    	   System.out.println("e1 has an performance rating of poor:  2");
	       }
   
   }//method close
	 
	 static void calculatePerformaceE3(Employee e3){
			
	      if(e3.getPoint()>=80){
	    	  System.out.println("e1 has an performance rating of outstanding:  5");
	       }
	       else if(e3.getPoint()>=60 && e3.getPoint() <=79){
	    	   System.out.println("e1 has an performance rating of good:  4");
	       }
	       else if(e3.getPoint()>=50 && e3.getPoint() <=59){
	    	   System.out.println("e1 has an performance rating of average:  3");
	       }
	       else if(e3.getPoint()>=1 && e3.getPoint() <=49){
	    	   System.out.println("e1 has an performance rating of poor:  2");
	       }
  
  }//method close
}//Class close



public class PerformanceCalculator{

	public static void main(String[] args) {
		
		
	//PerformanceCalculator p = new PerformanceCalculator();
	PerformanceRating p = new PerformanceRating();
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = new Employee();
	
	System.out.println("For year 2020");
	e1.setPoint(55);
	e2.setPoint(65);
	e3.setPoint(85);
	System.out.println("The employee points are:"+ "\n" + "employee e1: " + e1.getPoint() + "\n" + "Employee e2: " + e2.getPoint() + "\n" + "Employee e3: " + e3.getPoint());
	System.out.println("The employee performance ratings are respectively");
	p.calculatePerformaceE1(e1);
	p.calculatePerformaceE2(e2);
	p.calculatePerformaceE3(e3);
	
	System.out.println("For year 2021");
	e1.setPoint(85);
	e2.setPoint(55);
	e3.setPoint(65);
	System.out.println("The employee points are:"+ "\n" + "employee e1: " + e1.getPoint() + "\n" + "Employee e2: " + e2.getPoint() + "\n" + "Employee e3: " + e3.getPoint());
	System.out.println("The employee performance ratings are respectively");
	p.calculatePerformaceE1(e1);
	p.calculatePerformaceE2(e2);
	p.calculatePerformaceE3(e3);
	}

}








/*Problem Description: Let us create a performance rating system to calculate the performance of each
employee. 

Create an Employee class with an instance variable point: int with private access modifier.
Generate getter and setter method of the instance variable.

Create a class called "PerformanceRating" keep four class variables with constant value and private access
modifier: Outstanding: int, Good: int, Average: int and Poor: int
Outstanding=5
Good=4
Average=3
Poor=2

Create a static method to calculate the performance of each employee.
static int calculatePerformace (Employee employee){ }

Calculate the performance of each employee based on some business rules:
Note: The point of each employee should be less than 100.
If the point in between 80 -100 give outstanding rating.
If the point in between 60- 79 give good rating.
If the point in between 50- 59 give average rating.
If the point in between 1- 49 give poor rating.

Develop a main class "PerformanceCalculator". Create 3 employee objects, set their point and calculate
their performance rating based on the point they have achieved and print their respective rating on the
console.*/