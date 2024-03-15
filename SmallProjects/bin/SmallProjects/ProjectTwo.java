import java.util.Scanner;

public class ProjectTwo {
	static Scanner keyboard = new Scanner(System.in);
	static ProjectTwo projectTwo = new ProjectTwo();
	
	public void closeKeyboard() {
		keyboard.close();
	}
	
	public static String keyBoardInputs(String text) {
		System.out.println(text);
		String answer = keyboard.nextLine();
		return answer;
	}
	
	public class Book{
		String title;
		String author;
		int numberOfPages;
		
		public static void main(String[] args) {
			System.out.println("books");
			ProjectTwo.Book book = projectTwo.new Book();
			book.title = keyBoardInputs("Please enter the title of the book");
			book.author = keyBoardInputs("Please enter the author name");
			int numberPages = Integer.parseInt(keyBoardInputs("Please enter the number of pages"));
			while (numberPages <= 0) {
				numberPages = Integer.parseInt(keyBoardInputs("Please enter the number of pages"));
			}
			book.numberOfPages = numberPages;
			
			System.out.println(book.title + "\n" + book.author + "\n" + book.numberOfPages + "\n");
		}
	}
		
	public class Student {
		String firstname;
		String lastname;
		String studentID;
		
		public Student(String firstname, String lastname, String studentID) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.studentID = studentID;
		}
			
		public static void main(String[] args) {
			String firstname = keyBoardInputs("What is your first name: ");
			String lastname =  keyBoardInputs("What is your last name: ");
			String studentID = keyBoardInputs("What is your student ID: ");
				
			ProjectTwo.Student student;
			student = projectTwo.new Student(firstname, lastname, studentID);
			System.out.println(student.firstname + "\n"+ student.lastname + "\n" + student.studentID);
		}
	}
	
	public class Person {
		int age;
		double weight;
		boolean student;
		char gender;
		
		public Person(int age, double weight, boolean student, char gender) {
			this.age = age;
			this.weight = weight;
			this.student = student;
			this.gender = gender;
		}
		
		public boolean isStudent() {
			if(this.student == true) {
				return true;
			}
			return false;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public int computeDiscountPercent() {
			if (this.student == true) {
				return 50;
			}
			return 0;
		}

		public static void main(String[] args) {
			ProjectTwo.Person person;
			int age = Integer.parseInt(keyBoardInputs("what is your age: "));
			double weight = Double.parseDouble(keyBoardInputs("what is your weight: "));
			boolean student = Boolean.parseBoolean(keyBoardInputs("are you a student: "));
			char gender = keyBoardInputs("what is your gender").charAt(0);
			
			person = projectTwo.new Person(age, weight, student, gender);
			System.out.println("Person: age: "+ person.age +" weight: "+person.weight+
					" retired: "+person.student+" gender: " + person.gender);
		}
	}
	
	public class NitFlux{
		String email;
		int monthsOfSub;
		int amountPerMonth;
		
		public NitFlux(String email, int monthsOfSub, int amountPerMonth) {
			this.email = email;
			this.monthsOfSub = monthsOfSub;
			this.amountPerMonth = amountPerMonth;
		}
		
		public int computeCustomerPay() {
			return this.amountPerMonth * this.monthsOfSub;
		}
		
		public static void main(String[] args) {
			ProjectTwo.NitFlux nitFlux1 = projectTwo.new NitFlux("sfsfd@gmail.com",2,123);
			ProjectTwo.NitFlux nitFlux2 = projectTwo.new NitFlux("sfssdasf2334d@gmail.com",22,123);
			ProjectTwo.NitFlux nitFlux3 = projectTwo.new NitFlux("sf-----sfd@gmail.com",232,123);
			System.out.println(nitFlux1.computeCustomerPay());
			System.out.println(nitFlux2.computeCustomerPay());
			System.out.println(nitFlux3.computeCustomerPay());
			
		}
	}
	
	public class CartesianPoint{
		int x;
		int y;
		public CartesianPoint(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
