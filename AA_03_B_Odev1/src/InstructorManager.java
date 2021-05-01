
public class InstructorManager extends AddUser {
	
	
	
	@Override
	public void addNewUser(String ID, String firstname, String lastname, String certificates) {
		System.out.println("Added instroctor.");
		System.out.println(ID + "- Name ==> " + firstname + " | LastName ==> " + lastname + " | Certifications ==> " + certificates);
	}
}
