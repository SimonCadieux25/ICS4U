 package cadieux;

public class Student {

	private int Grade, StudentNumber;
	private String  PhoneNumber, FirstName, LastName, PostalCode, EMail, StreetAddress, MiddleInitials, Province, City;
		
	public int getStudentNumber() {
		return StudentNumber;
	}
	
	public void setStudentNumber(int StudentNumber) {
		this.StudentNumber = StudentNumber;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirtsName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String getMiddleInitials() {
		return MiddleInitials;
	}
	
	public void setMiddleInitials(String MiddleInitials) {
		this.MiddleInitials = MiddleInitials;
	}
	
	public int getGrade() {
		return Grade;
	}
	
	public void setGrade(int Grade) {
		this.Grade = Grade;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	
	public String getEmail() {
		return EMail;
	}
	
	public void setEMail(String EMail) {
		this.EMail = EMail;
	}
	
	public String getStreetAddress() {
		return StreetAddress;
	}
	
	public void setStreetAddress(String StreetAddress) {
		this.StreetAddress = StreetAddress;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String City) {
		this.City = City;
	}
	
	public String getProvince() {
		return Province;
	}
	
	public void setProvince(String Province) {
		this.Province = Province;
	}
	
	public String getPostalCode() {
		return PostalCode;
	}
	
	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}	
}
