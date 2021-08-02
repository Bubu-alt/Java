/*Write a class that has a class Measurement which has two attributes (kgs and gms). 
Create two objects that has own values of kgs and gms. Create a static method “add” in that class that adds
kgs and gms of both objects and assign result in third object.
Like for object m1 [kgs:5 gms:500]
Like for object m2 [kgs:7 gms:800]
Then addition will be stored in m3 [kgs:13 gms:300]*/



package AssignmentClass7;
import java.util.Scanner;
class Measurements{
	int kgs;
	int gms;
	}

public class Question3 {
	static int x, y;
	
	static void getCombined(Measurements m3){
		//m3.kgs = x;//Or directly m3.kgs = m1.kgs + m2.kgs;
		if(y>1000){
			m3.kgs = x + (y/1000);
			m3.gms = y - 1000;
			System.out.println("The combined value of addition of Kgs and Gms of objects m1 and m2 are, m3 = " + m3.kgs + "Kgs" + " " + "and" + " " + m3.gms + "Gms");
		}
		else if(y == 1000){
			m3.kgs = x + 1;
			m3.gms = 0;
			System.out.println("The combined value of addition of Kgs and Gms of objects m1 and m2 are, m3 = " + m3.kgs + "Kgs" + " " + "and" + " " + m3.gms + "Gms");
		}
		else if(y<1000){
			m3.kgs = x;
			m3.gms = y;
			System.out.println("The combined value of addition of Kgs and Gms of objects m1 and m2 are, m3 = " + m3.kgs + "Kgs" + " " + "and" + " " + m3.gms + "Gms");
		}
		/*m3.gms = y -((y/1000)*100);//Or directly m3.gms = m1.gms + m2.gms;*/
		
		//System.out.println("The combined value of addition of Kgs and Gms of objects m1 and m2 are, m3 = " + m3.kgs + "Kgs" + " " + "and" + " " + m3.gms + "Gms");	
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating object m1
		Measurements m1 = new Measurements();
		
		//Assigning values Kgs and Gms to object m1
		//Code to take input for Kgs and Gms for object m1
		System.out.println("Please provide values for Kgs and Gms for object m1");
		m1.kgs = sc.nextInt(); //5;
		m1.gms = sc.nextInt(); //500;
		//int x = m1.kgs + m1.gms;
		System.out.println("Object m1 has Kgs and Gms as = " + m1.kgs + "Kgs" + " " + "and" + " " + m1.gms + "Gms");
		
		//Creating object m2
		Measurements m2 = new Measurements();
		
		//Assigning values Kgs and Gms to object m2
		//Code to take input for Kgs and Gms for object m2
		System.out.println("Please provide values for Kgs and Gms for object m2");
		m2.kgs = sc.nextInt(); //7;
		m2.gms = sc.nextInt(); //800;
		//int x = m2.kgs + m2.gms;

		//printing final statement
System.out.println("Object m2 has Kgs and Gms as = " + m2.kgs + "Kgs" + " " + "and" + " " + m2.gms + "Gms");
		
		x = m1.kgs + m2.kgs;
		y = m1.gms + m2.gms;
		//System.out.println(x + " " + y);
		
		//Creating object m3 for storing values Kgs and Gms for objects m1 and m2
		Measurements m3 = new Measurements();
		
		//Creating object of class Question3 to call method getCombined()
		Question3 call =  new Question3();
		
		//Calling method getCombined()
		Question3.getCombined(m3);
		
//System.out.println("The combined value of addition of Kgs and Gms of objects m1 and m2 are, m3 = " + m3.kgs + "Kgs" + " " + "and" + " " + m3.gms + "Gms");		
		sc.close();
	}

}


/*-------------------------------------------------------------------------------------------------------------------
 * 
 * package fs_batch_week_2;

class Circle{
	float radius;
}

class Rectangle{
	float width;
	float height;
}

public class ParameterPassingDemo {
	
	
	void changeValue(int a) {//a is copy of variable x
		System.out.println("Inside changeValue, a = " + a);
		a = a + 10;
	}//variable 'a' will be destroyed here
	
	void changeArray(int arr[]) {
		System.out.println("Inside changeArray");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 5; 
		}
	}
	
	void changeRadius(Circle circle) {
		System.out.println("Inside changeRadius");
		circle.radius = circle.radius + 10;
	}
	
	Rectangle getObject() {
		//creating new object of Rectangle
		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 8;
		return rectangle;
	}

	public static void main(String[] args) {
		int x = 100;
		ParameterPassingDemo ppd = new ParameterPassingDemo();
		System.out.println("Inside main, x = " + x);
		ppd.changeValue(x);
		System.out.println("Inside main again, x = " + x);
		
		System.out.println("[][][][][][][][][][][][][][][][][][]");
		
		int arr[] = {10,20,30,40,50};
		System.out.println("Inside main, array is-");
		for(int a: arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		
		ppd.changeArray(arr);
		System.out.println("Inside main again, array is-");
		for(int a: arr) {
			System.out.print(a + " ");
		}
		
		System.out.println("\n[][][][][][][][][][][][][][][][][][]");
		
		Circle circle = new Circle();
		circle.radius = 7.0f;
		System.out.println("Inside main, the radius of circle is " + circle.radius);
		
		ppd.changeRadius(circle);
		
		System.out.println("Inside main again, the radius of circle is " + circle.radius);
		
		System.out.println("[][][][][][][][][][][][][][][][][][]");
		
		Rectangle rect = ppd.getObject();
		System.out.println("The width is " + rect.width + " and the height is " + rect.height);
	}
}

The output is-
Inside main, x = 100
Inside changeValue, a = 100
Inside main again, x = 100
[][][][][][][][][][][][][][][][][][]
Inside main, array is-
10 20 30 40 50 
Inside changeArray
Inside main again, array is-
15 25 35 45 55 
[][][][][][][][][][][][][][][][][][]
Inside main, the radius of circle is 7.0
Inside changeRadius
Inside main again, the radius of circle is 17.0
[][][][][][][][][][][][][][][][][][]
The width is 10.0 and the height is 8.0*/





