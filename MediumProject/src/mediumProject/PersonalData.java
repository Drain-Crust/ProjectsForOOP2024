package mediumProject;

public class PersonalData {
	private String firstName;
	private String lastName;
	private int age;
	
	public PersonalData(String firstName, String lastName, int age) {
		this.setAge(age);
		this.setLastName(lastName);
		this.setFirstName(firstName);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
		
	}public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public PersonalData oldestPerson(PersonalData person2) {
		if (this.getAge() >= person2.getAge()) {
			return this;
		} else {
			return person2;
		}
	}
	
	public String toString() {
		String s = this.getFirstName() + "\n" + this.getLastName() + "\n" + this.getAge() + "\n";
		return s;
	}
}
