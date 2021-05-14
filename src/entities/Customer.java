package entities;
import Abstract.IEntity;


public class Customer implements IEntity {
	public int Id;
	public String FirstName;
	public String LastName;
	//public Date DateOfBirth;
	private int DateOfBirth;
	public String NationalityId_TC;
	

	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId_TC) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId_TC = nationalityId_TC;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId_TC() {
		return NationalityId_TC;
	}
	public void setNationalityId_TC(String nationalityId_TC) {
		NationalityId_TC = nationalityId_TC;
	}
	
	
}
