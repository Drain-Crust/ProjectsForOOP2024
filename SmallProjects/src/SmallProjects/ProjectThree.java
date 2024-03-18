package SmallProjects;

import java.util.Scanner;

public class ProjectThree {
	static ProjectThree projectThree = new ProjectThree();
	static Scanner keyboard = new Scanner(System.in);
	
	public static void closeKeyboard() {
		keyboard.close();
	}
	
	public static String keyBoardInputs(String text) {
		System.out.println(text);
		String answer = keyboard.nextLine();
		return answer;
	}
	
	
/*------------------------------------------------------------------------------------------------------------*/
/*                                          Grade class                                                       */
/*------------------------------------------------------------------------------------------------------------*/
	
	public class Grade {
		private int percentage;//a value in the range 0..100.
		
		public Grade(int percentage){
			this.setPercentage(percentage);
		}
		
		public void setPercentage(int percentage) {
			this.percentage = percentage;
		}
		
		public int getPercentage() {
			return this.percentage;
		}
		
		public class UniversityGradeApplication{
			public static void main(String[] args) {
				ProjectThree.Grade p2 = projectThree.new Grade(75);//create a grade object
				p2.setPercentage(95);;
				
				System.out.println(p2.getPercentage() +"%\n");
			}
		}
	}
	
/*------------------------------------------------------------------------------------------------------------*/
/*                                          Student class                                                     */
/*------------------------------------------------------------------------------------------------------------*/
	
	public class Student{
		private String firstName;
		private String lastName;
		private int Id;
		
		public Student(String firstName, String lastName, int Id) {
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setId(Id);
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public void setId(int Id) {
			this.Id = Id;
		}
		
		public String getFirstName() {
			return this.firstName;
		}
		
		public String getLastName() {
			return this.lastName;
		}
		
		public int getId() {
			return this.Id;
		}
		
		@Override
		public String toString() {
			return  "\nFirst Name: " + this.firstName + "\nLast Name:" + this.lastName + "\nId:" + this.Id;
		}
		
		public class StudentApplication{
			public static void main(String[] args) {
				ProjectThree.Student aStudent = projectThree.new Student("Justin","Case",21234);
				System.out.println(aStudent);
			}
		}
	}
	
/*------------------------------------------------------------------------------------------------------------*/
/*                                           Dog class                                                        */
/*------------------------------------------------------------------------------------------------------------*/
	
	public class Dog{
		private String name;
		private int age;
		
		public Dog(String name, int age) {
			this.setName(name);
			this.setAge(age);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public int inPersonYears() {
			return this.age * 7;
		}
		
		@Override
		public String toString() {
			return "\nDog's Name:" + this.name + "\nDog's Age:" + this.age + "\n";
		}
		
		
		public class Kennel{
			public static void main(String[] args) {
				ProjectThree.Dog dog = projectThree.new Dog("kage", 1);
				System.out.println(dog);
			}
		}
	}
	
/*------------------------------------------------------------------------------------------------------------*/
/*                                           Box class                                                        */
/*------------------------------------------------------------------------------------------------------------*/
	
	public class Box{
		private int height;
		private int width;
		private int depth;
		
		public Box(int height, int width, int depth) {
			this.setHeight(height);
			this.setWidth(width);
			this.setDepth(depth);
		}
		
		public void setHeight(int height) {
			this.height = height;
		}
		
		public void setWidth(int width) {
			this.width = width;
		}
		
		public void setDepth(int depth) {
			this.depth = depth;
		}
		
		public int getHeight() {
			return this.height;
		}
		
		public int getWidth() {
			return this.width;
		}
		
		public int getDepth() {
			return this.depth;
		}
		
		public boolean fits(Box box) {
			if(this.height > box.getHeight()) {
				return false;
			}
			
			if(this.width > box.getWidth()) {
				return false;
			}
			
			if(this.depth > box.getDepth()) {
				return false;
			}
			return true;
		}
		
		public static boolean fits(Box box1,Box box2) {
			if(box2.getHeight() > box1.getHeight()) {
				return false;
			}
			
			if(box2.getWidth() > box1.getWidth()) {
				return false;
			}
			
			if(box2.getDepth() > box1.getDepth()) {
				return false;
			}
			return true;
		}
		
		@Override
		public String toString() {
			return "\nBox Height:" + this.width + "\nBox Width:" + this.height + "\nBox Depth" + this.depth + "\n";
		}
		
		public class BoxTest{
			public static void main(String[] args) {
				ProjectThree.Box box1 = projectThree.new Box(123,23,54);
				ProjectThree.Box box2 = projectThree.new Box(3,23,5);
				ProjectThree.Box box3 = projectThree.new Box(123,3,9);
				
				System.out.println(Box.fits(box1, box2));
				System.out.println(Box.fits(box3, box2));
				
				System.out.println(box1);
				System.out.println(box2);
				System.out.println(box3);
			}
		}
	}
	
	
	/*------------------------------------------------------------------------------------------------------------*/
	/*                                           Sphere class                                                     */
	/*------------------------------------------------------------------------------------------------------------*/
	
	public class Sphere{
		private double  diameter;
		
		public Sphere(double diamter) {
			this.setDiameter(diamter);
		}
		
		public void setDiameter(double diameter) {
			this.diameter = diameter;
		}
		
		public double getDiameter() {
			return this.diameter;
		}
		
		public double radius() {
			return this.diameter/2;
		}
		
		public double volume() {
			return (4/3)*Math.PI*Math.pow(radius(),3);
		}
		
		public double surfaceArea() {
			return 4*Math.PI*Math.pow(radius(), 2);
		}
		
		public String toString() {
			return "Diameter of Circle: "+ this.diameter + "\nRadius of Circle: " + radius() + "\nVolume of Circle: "+ volume() + "\nSurface Area of Circle: "+ surfaceArea();
		}
		
		public class MultiSphere{
			public static void main(String[] args) {
				ProjectThree.Sphere sphere = projectThree.new Sphere(2);
				System.out.println(sphere);
			}
		}
	}
	
/*------------------------------------------------------------------------------------------------------------*/
/*                                           Sphere class                                                     */
/*------------------------------------------------------------------------------------------------------------*/

	public class CoinChanger{
		private int ten;
		private int twenty;
		private int fifty;
		private int oneDollar;
		private int twoDollar;
		
		public CoinChanger(int ten, int twenty, int fifty, int oneDollar, int twoDollar) {
			this.setTen(ten);
			this.setTwenty(twenty);
			this.setFifty(fifty);
			this.setOneDollar(oneDollar);
			this.setTwoDollar(twoDollar);
		}

		public int getTen() {
			return ten;
		}

		public void setTen(int ten) {
			this.ten = ten;
		}

		public int getTwenty() {
			return twenty;
		}

		public void setTwenty(int twenty) {
			this.twenty = twenty;
		}

		public int getFifty() {
			return fifty;
		}

		public void setFifty(int fifty) {
			this.fifty = fifty;
		}

		public int getOneDollar() {
			return oneDollar;
		}

		public void setOneDollar(int oneDollar) {
			this.oneDollar = oneDollar;
		}

		public int getTwoDollar() {
			return twoDollar;
		}

		public void setTwoDollar(int twoDollar) {
			this.twoDollar = twoDollar;
		}
		
		public int coinsAsCents() {
			return this.ten * 10 + this.twenty * 20 + this.fifty * 50 + this.oneDollar * 100 + this.twoDollar * 200;
		}
		
		public int dollars() {
			return coinsAsCents()/100;
		}
		
		public int cents() {
			return coinsAsCents() % 100;
		}
		
		public class CoinChangerApplication {
			public static void main(String[] args) {
				boolean toExit = false;
				
				do {
					System.out.println("Welcome to the Coin Changer Machine. Please input your coins:");
					
					int tens = Integer.parseInt(keyBoardInputs("Number of 10c coins:"));
					int twenty = Integer.parseInt(keyBoardInputs("Number of 20c coins:"));
					int fifty = Integer.parseInt(keyBoardInputs("Number of 50c coins:"));
					int oneDollar = Integer.parseInt(keyBoardInputs("Number of dollar coins:"));
					int twoDollar = Integer.parseInt(keyBoardInputs("Number of two dollar coins:"));
					
					ProjectThree.CoinChanger coins = projectThree.new CoinChanger(tens, twenty, fifty, oneDollar, twoDollar);
					
					System.out.println("The total value of the coin collection is: $" + coins.dollars() + "." + coins.cents());
					String userInput = keyBoardInputs("Would you like to continue? (Y?)");
					if ("y".equalsIgnoreCase(userInput) == false) {
						toExit = true;
					}
				} while (toExit == false);
			}
		}
	}
}
