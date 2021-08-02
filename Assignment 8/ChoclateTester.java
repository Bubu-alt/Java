package AssignmentClass8;

class Choclate{
	String name; int barCode; double weight, cost;
	
	//Default Constructor
	/*Choclate(){
		/*barCode = 101;
		name =  "Cadbury";
		weight = 12;
		cost = 10;
	}*/
	
	//Parameterised Constructor
	Choclate(int barCode, String name, double weight, double cost){
	    this.barCode = 101;
     	this.name = "Cadbury";
		this.weight = 12;
		this.cost = 10;	
	}

	public void getValues(){
    	System.out.println("The Choclate attributes are as follows: " + " " + "BarCode= " + this.barCode + " " + "Name= " + this.name + " " + "Weight= " + this.weight + " " + "Cost= " + this.cost);
    }
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBarCode() {
		return barCode;
	}


	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
}

public class ChoclateTester {

	public static void main(String[] args) {
		Choclate ch = new Choclate(0, null, 0, 0);
        //Calling the default valued with a user defined getter function 
		ch.getValues();
		
		//Changing the attributes using setter method
        ch.setBarCode(102);
        ch.setName("Hershey's");
        ch.setWeight(24);
        ch.setCost(50);
        
        //Calling bthe modified values using getter method;
        System.out.println("The Modified Values Are: " + "\n" + "BarCode: " + ch.getBarCode() + "\n" + "Name: " + ch.getName() + "\n" + "Weight: " + ch.getWeight() + "\n" + "Cost: " + ch.getName());
	}

}
