public class TestContactList
{
	public static void main(String [] args)
	{
		System.out.println("Program test begins\n");
		ContactList cList = new ContactList();
		
		//make a contact and add to list
		Contact ct1 = new Contact("jsmith@faceTwit.ca");
		ct1.setName("John", "E.", "Smith");
		cList.addContact(ct1);
		
		//make another contact
		Contact ct2 = new Contact("jdoe@faceTwit.ca","Jane", "T.", "Doe");
		cList.addContact(ct2);
		
		//make another contact
		Contact ct3 = new Contact("nubee@faceTwit.ca");
		cList.addContact(ct3);
		
		//print contactList
		System.out.println(cList); 
		
		System.out.println("\"nubee@faceTwit.ca\" is in list?"); 
		System.out.println(cList.find("nubee@faceTwit.ca"));
		
		System.out.println("\"tobee@faceTwit.ca\" is in list?"); 
		System.out.println(cList.find("tobee@faceTwit.ca"));
	}
}// end TestContactList
