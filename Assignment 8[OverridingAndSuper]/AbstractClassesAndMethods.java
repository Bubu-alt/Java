package OverridingAndSuper;

import java.util.Scanner;

abstract class RRPaymentServices{
	double balance;//amount to be paid by the user
	int customerID;
	
	public RRPaymentServices(double balance, int customerID) {
		//super();
		this.balance = balance;
		this.customerID = customerID;
	}//Construtor Close

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerID() {
		return customerID;
	}

	/*public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}*/
	
	abstract void payBill(double amount);
	

}//Class Close

 class ShoppingPayment extends RRPaymentServices{
	static int counter; //To set the PaymentID
    String getPaymentID;
    
	public String getGetPaymentID() {
		return getPaymentID;
	}

	public void setGetPaymentID(String getPaymentID) {
		this.getPaymentID = getPaymentID;
	}

	public ShoppingPayment(double balance, int customerID) {
		super(balance, customerID);
	}//Construtor Close
	
	void payBill(double Amount){
/*For shopping bill payment, the payment id should start with 'S' followed by a four digit integer number.
If the user enters an amount not equal to the balance which is due, an appropriate error message should be 
displayed and the id should get generated only for valid payments.*/
		if(getBalance() > 5000.00){
			System.out.println("Please enter exact, not excess amount");
		}
		else if(getBalance() < 5000.00){
			System.out.println("Please enter exact, not less amount");
		}
		else if(getBalance() == 5000.00){
			System.out.println("Thank You for transaction of Amount: INR " + Amount);
			System.out.println("Payment ID: " + getGetPaymentID());
		}
	}//Method Close
	
}//Class Close

   class CreditCardPayment extends RRPaymentServices{
	static int counter = 5001; //To set the Customer ID
	String paymentID; //= "C1001"; //To set the Payment ID
	double cashBack;
	double balanceDue;
	double remainingDue;
	
	public double getRemainingDue() {
		return remainingDue;
	}

	public void setRemainingDue(double remainingDue) {
		this.remainingDue = remainingDue;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}

	public static int getCounter() {
		return counter;
	}

	public CreditCardPayment(double balance, int customerID) {
		super(balance, customerID);
		}//Construtor Close

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public double getCashBack() {
		return cashBack;
	}

	public double getBalanceDue() {
		return balanceDue;
	}
	
/*For credit card bill payment, if a user enters an amount more than amount to be paid, the excess amount 
should be stored as cashBack. The payBill method is used to pay the bill and generate the transaction id. 
The id should start with 'C' followed by a four-digit integer number. In case the user enters an amount 
less than the amount to be paid, then the remaining amount should be stored in the instance variable 
balanceDue of class CreditCardPayment. Use a Tester class to test your code and display the payment information.
The balanceDue after the payment should be communicated to the user.*/
	void payBill(double Amount/*double remainingDue*/){
		//System.out.println("The Amount to be paid is: INR " + Amount);
		System.out.println("Previous balance due is: INR " + getRemainingDue());
		
		 
		cashBack = balance - Amount; //Amount: 15000.00; balance: 10000.00; remaining Due: 5000.00
		balanceDue = getRemainingDue() + Amount - balance;
		
		System.out.println("Customer ID : " + " " + getCounter());
		System.out.println();
		System.out.println("Payment ID : " + " " + getPaymentID());
		System.out.println();
		
         if(balance > Amount){
			/*System.out.println("Current Balance  Due : INR 0.0");
			System.out.println();*/
			System.out.println("Total Balance Due : INR " + getRemainingDue());
            System.out.println();
			System.out.println("Cashback : INR " + cashBack);
			System.out.println();
			}
         
		else if(balance == Amount){
			/*System.out.println("Current Balance Due : INR 0.0");
			System.out.println();*/
			System.out.println("Total Balance Due :" + getRemainingDue());
			System.out.println();
			System.out.println("Cashback : INR " + cashBack);
			System.out.println();
		}
         
		else if(balance < Amount){//Amount: 15000.00; balance: 10000.00; remaining Due: 5000.00
			/*System.out.println("Current Balance Due : INR " + );
			System.out.println();*/
			System.out.println("Total Balance Due : INR " + balanceDue);
			System.out.println();
			System.out.println("Cashback : INR 0.0");
			System.out.println();
		}
         System.out.println("Your transaction of INR " + balance + " " + "is successful"); 
         System.out.println();
	}//Method Close

/*@Override
void payBill(double amount) {
	
	
}*/
	
}//Class Close

public class AbstractClassesAndMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CreditCardPayment C1 = new CreditCardPayment(0.0, 0);
		//C1.billAmount = sc.nextDouble(); //14500
		//C1.balanceDue = sc.nextDouble(); //10000.23;
		//C1.customerID = sc.nextInt(); //5001;
		//C1.paymentID = sc.next(); //"C1001";
		
	
		//First Transaction:
		System.out.println("The bill amount is: INR 10000.0");
		System.out.println("Enter amount for bill payment");
		C1.balance = sc.nextDouble();
		System.out.println("Please hold, while we generate your bill and previous transactions");
		C1.setPaymentID("C1001");
		C1.setRemainingDue(5000.00);//Contains previous due
		C1.payBill(10000.00);//Contains amount to be paid
		
		System.out.println();
		
		//Second Transaction:
		System.out.println("The bill amount is: INR 20000.0");
		System.out.println("Enter amount for bill payment");
		C1.setPaymentID("C1002");
		C1.balance = sc.nextDouble();
		C1.setRemainingDue(2000.00);//Contains previous due
		C1.payBill(20000.00);//Contains amount to be paid
		//C1.balance = sc.nextDouble(); //15000.0; Amount that he pays
		//C1.payBill(22000.00);//Contains amount to be paid
	
		
		ShoppingPayment S1 =  new ShoppingPayment(0, 0);
		System.out.println("The bill amount is: INR 5000.0");
		System.out.println("Enter amount for bill payment");
		S1.balance = sc.nextDouble();
		S1.setGetPaymentID("C1001");
		S1.payBill(5000.0);
		/*if(S1.getBalance() > 5000){
			System.out.println("Please enter exact, not excess amount");
		}*/
		
		

	}//Main Method Close

}//Main Class Close
