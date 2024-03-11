package mediumProject;

public class TestingMediumProjects {
	
	public static void main(String[] args) {
		wordCounterTests();
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
		PersonalData person1 = new PersonalData("asfs","fdsfdsf",123);
		PersonalData person2 = new PersonalData("a222fs","fdasdasd243234fdsf",123);
		BankAccount bankAccount1 = new BankAccount(person1);
		BankAccount bankAccount2 = new BankAccount(person2);
		
		bankAccount1.deposit(100);
		bankAccount2.setAccountBalance(1000);
		bankAccount2.withdraw(20);
		System.out.println(bankAccount1);
		System.out.println(bankAccount2);
		
		bankAccount2.transfer(bankAccount1, 520);
		System.out.println(bankAccount1);
	}
	
	public static void topSecretTests() {
		TopSecret n = new TopSecret("The secret tomato sauce ingredients are: onions, carrots,\r\n"
				+ "garlic, whole tomatoes, salt, tomato paste and olive oil.");
		TopSecret s = n.redact(new String[]{"tomato", "secret", "ol", "a"});
		System.out.println(s);
	}
	
	public static void wordCounterTests() {
		WordCounter wordCounter;
		wordCounter = new WordCounter("The lazy fox jumped over the quick quick brown lazy cat");
		System.out.println(wordCounter);
	}
}
