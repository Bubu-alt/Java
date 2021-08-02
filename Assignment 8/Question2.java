package AssignmentClass8;



class Author{
	String name, emailID; char gender;




	public Author(String name, String emailID, char gender) {
		this.name = name;
		this.emailID = emailID;
		this.gender = gender;
		//System.out.println("Author Details: " + "\n" + "Name: " + this.name);
	}




	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getEmailID() {
		return emailID;
	}
    public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
    public char getGender() {
		return gender;
	}
    public void setGender(char gender) {
		this.gender = gender;
	}
 }       
	
class Book{
	String name; Author author; double price; int quantity;
	
	public Book(String name, Author author, double price, int quantity) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Author getAuthor() {
		return author;
	}*/
	public void displayAuthorDetails(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	
	}
}



public class Question2 {

	public static void main(String[] args) {
	Author author1 = new Author(null, null, '\u0000');
	author1.setName("x");
	author1.setEmailID("x@gmail.com");
	author1.setGender('M');
	System.out.println("The Author Details Are: " + "\n" + "Name: " + author1.getName() + "\n" + "EmailID: " + author1.getEmailID() + "\n" + "Gender: " + author1.getGender());
	//Author author1 =  new Author("x","x@gmail.com", 'M');//author1.setName("x");
	Book book1 = new Book(null, null, 0.0d, 0);
	book1.setName("aa");
	book1.setPrice(25.26);
	book1.setQuantity(56);
	System.out.println("The Book Details Are: " + "\n" + "Name: " + book1.getName() + "\n" + "Author: " + author1.getName() + "\n" +"Price: " + book1.getPrice() + "\n" + "Quantity: " + book1.getQuantity());
	
	
	

	}

}
