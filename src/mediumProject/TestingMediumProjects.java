package mediumProject;

public class TestingMediumProjects {
	
	public static void main(String[] args) {
		topSecretTests();
		
		
		
	}
	
	public static void personalDataTests() {
		PersonalData person1 = new PersonalData("asfs","fdsfdsf",123);
		PersonalData person2 = new PersonalData("a222fs","fdasdasd243234fdsf",123);
		PersonalData person3;
		person1.setFirstName("fsffsfsffss");
		System.out.println(person1);
		person3 = person1.oldestPerson(person2);
		System.out.println(person3);
		person2.setAge(200);
		person3 = person1.oldestPerson(person2);
		System.out.println(person3);
	}
	
	public static void bankAccountTests() {
		
	}
	
	public static void topSecretTests() {
		TopSecret n = new TopSecret("The secret tomato sauce ingredients are: onions, carrots,\r\n"
				+ "garlic, whole tomatoes, salt, tomato paste and olive oil.");
		TopSecret s = n.redact(new String[]{"tomato","secret","ol","a"});
		System.out.println(s);
	}
}
