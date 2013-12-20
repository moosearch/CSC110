/* A Contact is a firstname, a lastname, an initial and an email address.
In this simple form we assume that the contacts are email contacts.
A contact cannot be created without an email address since there is no
constructor that will permit that.
*/

public class Contact
{
	private String fName = "";
	private String lName = "";
	private String initial = "";
	private String email = "";
	private String kind = "email";
	
	public Contact(String email)
	{
		this.email = email;
	}
	
	public Contact(String email, String first, String init, String last)
	{
		this.email = email;
		this.fName = first;
		this.initial = init;
		this.lName = last;
	}
	
	public void setName(String first, String initial, String last)
	{
		this.fName = first;
		this.initial = initial;
		this.lName = last;
	}
	
	//set name fields back to blank
	public void privatizeName()
	{
		this.fName = "";
		this.initial = "";
		this.lName = "";
	}
		
	public String getName()
	{
		return "Name: " + this.fName + " " + this.initial + " "+ this.lName + "\n";
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void changeEmail(String newEmail)
	{
		this.email = newEmail;
	}
		
}//end class Contact
