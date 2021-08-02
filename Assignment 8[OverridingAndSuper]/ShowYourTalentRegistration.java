package OverridingAndSuper;

import java.util.Scanner;

class EventRegistration {
	String name;
	String nameOfEvent;
	double regFees;
	
	//Constructor
	/*EventRegistration(String name, String nameOfEvent){
		}*/
	
	//Getters and Setters for Super-Class ins-vars.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegFees() {
		return regFees;
	}
	public void setRegFees(double regFees) {
		this.regFees = regFees;
	}
	
	//Method
	void registerEvent(){
		
		}//Method Close
}//Class Close


class SingleEventRegistration extends EventRegistration {
	int participantNo;
	//int eventNo;
	String eventNotAllowed = "Actathon";
	String eventAllowed1 = "ShakeALeg";
	String eventAllowed2 = "PlayAway";
	String eventAllowed3 = "Sing&Win";
	
	/*SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name, nameOfEvent);
	}*///Constructor Close
		
		public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
	/*Thank You Jenny for your participation.Your registration fee is: 150.0
	You are participant no: 1*/
	/*Thank You Hudson for your participation.Your registration fee is: 130.0
	You are participant no: 2*/
	void registerEvent(){
		
			//In class SingleEventRegistration this method calculates the registration fee and displays the participant number. 
System.out.println("Thank You" + " " + getName() + " " + "for your participation." + " " + "Your Registration Fee is: " + " " + getRegFees() + ". " + "Your Participant No. is: " + getParticipantNo()); 
//System.out.println("Thank You" + " " + participant2.getName() + " " + "for your participation." + " " + "Your Registration Fee is: " + " " + participant2.getRegFees() + ". " + "Your Participant No. is: " + participant2.getParticipantNo());	 */   
System.out.println();	
	}
	
	void yourEvent(){
		System.out.println("Please enter your event name for Single Event Registration. Press the corresponding number for the event to get registered");
		/*System.out.println("ShakeALeg: " + "1");
		System.out.println();
		System.out.println("Sing&Win: " + "2");
		System.out.println();
		System.out.println("PlayAway: " + "3");
		System.out.println();*/
		
		Scanner sc = new Scanner(System.in);
		//eventNo =  sc.nextInt();
	while(true){	
		String nameInput = sc.next();
		/*if(eventNameInput  == eventNotAllowed){
			System.out.println("Please type a valid Event Name");
			}*/
		if(nameInput.equals(eventAllowed1)){
			System.out.println("Thank You for your Single Event Registration to ShakeALeg.");
			}
		else if(nameInput.equals(eventAllowed2)){
			System.out.println("Thank You for your Single Event Registration PlayAway.");
			}
		else if(nameInput.equals(eventAllowed3)){
			System.out.println("Thank You for your Single Event Registration Sing&Win.");
			}
		else if(nameInput.equals(eventNotAllowed)){
			System.out.println("Please type a valid Event Name Again");
			}
	}
	//Follow URL for the above Code.
	//https://stackoverflow.com/questions/27112685/how-do-i-make-a-if-else-statement-with-the-string-argument-that-is-a-string-in
		
		/*while(true)*//*if(eventNo == 1){
			System.out.println("Thank You for your Single Event Registration to ShakeALeg.");
			}
		else if(eventNo == 2){
			System.out.println("Thank You for your Single Event Registration to Sing&Win.");
			}
		else if(eventNo == 3){
			System.out.println("Thank You for your Single Event Registration to PlayAway.");
			}
		else{
			System.out.println("Please type a number corresponding to the Event Name from the table listed above");
		}
		/*else{
				System.out.println("Thank You for your Single Event Registration");
			}*/
	}
		
}




class TeamEventRegistration extends EventRegistration {
	int noOfParticipants;
	int teamNo;

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	/*TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
	}*///Constructor Close
	
	
	//Thank You Aura for your participation.Your registration fee is: 250.0. You are participant no: 1
	void registerEvent(){
		System.out.println("Thank You " + "" +getName() + " " + "for your participation.");
	    System.out.println("The Registration Fees for your Team is=  " + getRegFees() * getNoOfParticipants());
	    System.out.println("You are participant No. "+ " " + getTeamNo());
	    System.out.println();
	}


}//Class Close

public class ShowYourTalentRegistration {

	public static void main(String[] args) {
		System.out.println("All events displayed below:");
		System.out.println("____________________________");
		System.out.println("|Events:  " + "  |" + "Base Fee in INR|");
		System.out.println("|-----------|---------------|");
		System.out.println("|ShakeALeg  " + "|" + "INR 100        |");
		System.out.println("|-----------|---------------|");
		System.out.println("|Sing&Win  " + " |" + "INR 150        |");
		System.out.println("|-----------|---------------|");
		System.out.println("|Actathon  " + " |" + "INR 70         |");
		System.out.println("|-----------|---------------|");
		System.out.println("|PlayAway  " + " |" + "INR 130        |");
		System.out.println("-----------------------------");
		
		System.out.println();
		
		System.out.println("Single events displayed below:");
		System.out.println("____________________________");
		System.out.println("|Events:  " + "  |" + "Base Fee in INR|");
		System.out.println("|-----------|---------------|");
		System.out.println("|ShakeALeg  " + "|" + "INR 100        |");
		System.out.println("|-----------|---------------|");
		System.out.println("|Sing&Win  " + " |" + "INR 150        |");
		System.out.println("|-----------|---------------|");
		System.out.println("|PlayAway  " + " |" + "INR 130        |");
		System.out.println("-----------------------------");
		
		System.out.println();
		
		System.out.println("Team events displayed below(Base Fee Per Person):");
		System.out.println("|Events:  " + "  |" + "Base Fee in INR|");
		System.out.println("|-----------|---------------|");
		System.out.println("|ShakeALeg  " + "|" + "INR 50         |");
		System.out.println("|-----------|---------------|");
		System.out.println("|Sing&Win  " + " |" + "INR 60         |");
		System.out.println("|-----------|---------------|");
		System.out.println("|Actathon  " + " |" + "INR 80         |");
		System.out.println("|-----------|---------------|");
		System.out.println("|PlayAway  " + " |" + "INR 100        |");
		System.out.println("-----------------------------");
		
		System.out.println();
		
		EventRegistration participant1 = new SingleEventRegistration();
		EventRegistration participant2 = new SingleEventRegistration();
		
		EventRegistration team1 = new TeamEventRegistration();
		
		//Input for Single Event participant:
		participant1.setName("Jenny");
		participant1.setNameOfEvent("Sing&Win");
		participant1.setRegFees(150);
		((SingleEventRegistration) participant1).setParticipantNo(1);//Notice this.
		participant2.setName("Hudson");
		participant2.setNameOfEvent("PlayAway");
		participant2.setRegFees(130);
		((SingleEventRegistration) participant2).setParticipantNo(2);//Notice this.
		
		//Calling Method:
		participant1.registerEvent();
		participant2.registerEvent();
		
		
		//Input for Team Event participants:
		team1.setName("Aura");
		team1.setNameOfEvent("ShakeALeg");
		team1.setRegFees(50);
		((TeamEventRegistration) team1).setTeamNo(1);
		((TeamEventRegistration) team1).setNoOfParticipants(5);//Notice this.
		
		//Calling Method:
		team1.registerEvent();
		System.out.println();
		
		SingleEventRegistration participant3 = new SingleEventRegistration();
		participant3.yourEvent();
		

		
		
		
		
		
	}

}

/*package userinfo;    
import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {    
        String name;
        String yes = "YES";
        String no = "NO";    
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = userInput.next();
        System.out.println("Please varify your name by typing YES or NO");

        while (true) {
            String input = userInput.next();
            if (input == yes) {
                System.out.println("Your name is: " + name);
            }
            if (input == no) {
                System.out.println("Enter your name again");

            } else {
                System.out.println("Invalid input! Enter value again:");
                break;
            }    
        }    
    } */   

//First thing of all, change == to .equals, programmers will cry if they see it (I cried while I was writing this comment)
//










































































