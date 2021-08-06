package Assignments;
import java.util.Scanner;
interface RoomBillComponent{
	double TAX = 0.12; //12%
	double EXTRA_PERSON_CHARGE = 500.00;
    double FOOD_CHARGE = 800.00;
    
    float calculateBill();
}

class RoomDetails implements RoomBillComponent{
	int billld;
	String customerName;
	String typeOFRoom;
	int noOfExtraPersons;
	int noOfDaysOfStay;
	static int counter; //Auto-generate the billId starting from 101
	//(Hint: Use the static variable "counter" appropriately for the auto-generation purpose)
	
	//Room Types Bill:
	/*int standard = 2500;
	int Deluxe = 3500;
	int cottage = 5500;*/
	
	
	public RoomDetails(int billld, String customerName, String typeOFRoom, int noOfExtraPersons, int noOfDaysOfStay) {
		super();
		this.billld = billld;
		this.customerName = customerName;
		this.typeOFRoom = typeOFRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDaysOfStay = noOfDaysOfStay;
	}//Constructor Close
	public int getBillld() {
		return billld;
	}
    public void setBillld(int billld) {
		this.billld = billld;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setTypeOFRoom(String typeOFRoom) {
		this.typeOFRoom = typeOFRoom;
	}
	public void setNoOfExtraPersons(int noOfExtraPersons) {
		this.noOfExtraPersons = noOfExtraPersons;
	}
	public void setNoOfDaysOfStay(int noOfDaysOfStay) {
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	public String getCustomerName() {
		return customerName;
	}
    public String getTypeOFRoom() {
		return typeOFRoom;
	}
    public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}
    public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}
    
   public boolean validateNoOfExtraPerson(){
	   if(noOfExtraPersons > 2){
			  System.out.println("Can select only 0-2 extra persons");
			  return true;
		  } 
	   else System.out.println("No Of Extra Persons: " + getNoOfExtraPersons());
	return true;   
}//Method Close
   
   public boolean validateTypeOfRoom(){
	  if(typeOFRoom == "Standard" | typeOFRoom == "Deluxe" | typeOFRoom == "Cottage"){
		  System.out.println("Type Of Room Selected: " + getTypeOFRoom());
		  return true;
	  }
	  else System.out.println("Invalid Room Selection");
	return true;
	 }//Method Close
   
   public boolean validateNoOfDaysOfStay(){
	   if(noOfDaysOfStay == 0){
			  System.out.println("Cannot Select zero days for staying");
			  return true;
		  } 
	   else System.out.println("No Of Days Of Stay: " + getNoOfDaysOfStay());
	return true;   
   }//Method Close
 
   
    public float calculateBill() {
    	Scanner sc =  new Scanner(System.in);
    	//int baseRoomFare = sc.nextInt();
    	double totalBill = 1;
    	if(noOfDaysOfStay == 0 | noOfExtraPersons > 2){
    		System.out.println("Cannot Generate bill for invalid selections");
    	}
    	else if(typeOFRoom == "Standard"){
    	totalBill = (noOfDaysOfStay*2500.00) +noOfDaysOfStay *( FOOD_CHARGE) + (EXTRA_PERSON_CHARGE* noOfExtraPersons);
    	totalBill = totalBill + TAX*totalBill;
    	System.out.println("Total Bill: " + " " + totalBill);
    	//return (float) totalBill; //Downcasting: double to float.	
    	}
    	else if(typeOFRoom == "Deluxe"){
        totalBill = (noOfDaysOfStay*3500.00) +noOfDaysOfStay *( FOOD_CHARGE) + (EXTRA_PERSON_CHARGE* noOfExtraPersons);
        totalBill = totalBill + TAX*totalBill;
        //return (float) totalBill; //Downcasting: double to float.	
        System.out.println("Total Bill: " + " " + totalBill);
        }
    	else if(typeOFRoom == "Cottage"){
        totalBill = (noOfDaysOfStay*5500.00) +noOfDaysOfStay *( FOOD_CHARGE) + (EXTRA_PERSON_CHARGE* noOfExtraPersons);
        totalBill = totalBill + TAX*totalBill;
        //return (float) totalBill; //Downcasting: double to float.
        System.out.println("Total Bill: " + " " + totalBill);
        }
    	/*return (float)*/ //System.out.println("total Bill: " + totalBill);
    	return (float) totalBill;
	}//Method Close
	
}//Class Close

public class Thirteen {

	public static void main(String[] args) {
		RoomDetails c1 =  new RoomDetails(101, "Jacob", "Del", 2, 5);
		
		//c1.setBillld(101);
		//c1.setCustomerName("Jacob");
		//c1.setNoOfDaysOfStay(5);
		//c1.setNoOfExtraPersons(1);
		
		/*System.out.println("Standard: INR 2500.00");
		System.out.println("Deluxe: INR 3500.00");
		System.out.println("Cottage: INR 5500.00");*/
		
		//c1.validateTypeOfRoom();
		
		System.out.println("Bill ID: " + c1.getBillld());
		System.out.println("Customer Name: " + c1.getCustomerName());
		//System.out.println("No Of Extra Persons: " + c1.getNoOfExtraPersons());
		//System.out.println("No Of Days Of Stay: " + c1.getNoOfDaysOfStay());
		/*System.out.println("Type Of Room Selected: " + c1.getTypeOFRoom() + " " + c1.validateTypeOfRoom());*/
		c1.validateTypeOfRoom();
		c1.validateNoOfExtraPerson();
		c1.validateNoOfDaysOfStay();
		c1.calculateBill();
		
		
		
       
	}

}
