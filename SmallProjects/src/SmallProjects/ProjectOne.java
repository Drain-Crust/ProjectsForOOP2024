package SmallProjects;

import java.util.Scanner;

public class ProjectOne {
	static Scanner keyboard = new Scanner(System.in);
	
	public void closeKeyboard() {
		keyboard.close();
	}
	
	private int KeyBoardInputs(String text) {
		System.out.println(text);
		int firstNums = keyboard.nextInt();
		return firstNums;
	}
	
	public static void systemMsgs() {
		System.out.println("Print a message\n");
		System.out.println("Hello World");
		System.out.println("Football");
	}
	
	public void ThreeNumberAverage() {
		System.out.println("Three number average\n");
		int firstNums = KeyBoardInputs("Enter the first number: ");
		int secondNums = KeyBoardInputs("Enter the second number: ");
		int thirdNums = KeyBoardInputs("Enter the third number: ");
		
		float average = (firstNums + secondNums + thirdNums)/3;
		System.out.println("The average of the numbers is: " + average + "\n");
	}
	
	public class PersonalData {
		String name;
		String birthDay;
		String intrests;
		String favBook;
		String favFilm;
		
		public static void main(String[] args) {
			ProjectOne projectOne = new ProjectOne();
			ProjectOne.PersonalData data = projectOne.new PersonalData();
			
			data.name = "Robin Banks";
			data.birthDay = "July 12th";
			data.intrests = "Sports, Programming, Music";
			data.favBook = "The Life of Pi";
			data.favFilm = "Citizen Kane";
			
			System.out.println("Personal data\n");
			System.out.println("Name: " + data.name);
			System.out.println("Birthday: " + data.birthDay);
			System.out.println("Interests: " + data.intrests);
			System.out.println("Favorite book: " + data.favBook);
			System.out.println("Favorite film: " + data.favFilm + "\n");
		}
		
	}
	
	public void Division() {
		System.out.println("Division\n");
		int firstNum = KeyBoardInputs("Enter the first numerator: ");
		int secondNum = KeyBoardInputs("Enter the second denominator: ");
		float fractionValue = (float)firstNum/(float)secondNum;
		String stringFractionValue = (firstNum == 0 || secondNum == 0) ? (stringFractionValue = "is undefined") : (stringFractionValue = String.valueOf(fractionValue));
		System.out.println("The input fraction is: "+ firstNum + "/" + secondNum);
		System.out.println("The decimal equivalence is: " + stringFractionValue + "\n");
	}
	
	public void convertMilesToKilometers() {
		System.out.println("Convert miles to kilometers\n");
		int firstNum = KeyBoardInputs("Enter the number of miles: ");
		if (firstNum < 0) {
			System.out.println("Please enter a value greater than 0!");
		} else {
			float kiloMeters = (float)firstNum * (float)1.60935;
			System.out.println("The number of kms is: "+ kiloMeters + "\n");
		}
	}
	
	public void ComputingUsedFuelAmount() {
		System.out.println("Computing the amount of fuel used\n");
		int firstNum = KeyBoardInputs("Enter the number of miles: ");
		int secondNum = KeyBoardInputs("Enter the gallons of fuel used: ");
		float fractionValue = (float) firstNum/(float)secondNum;
		String stringFractionValue = (firstNum == 0 || secondNum == 0) ? (stringFractionValue = "is undefined") : (stringFractionValue = String.valueOf(fractionValue));
		System.out.println("Miles Per Gallon: " + stringFractionValue + "\n");
	}
	
	public void TimeDuration() {
		System.out.println("Time duration\n");
		int firstNum = KeyBoardInputs("Enter the number of hours: ");
		int secondNum = KeyBoardInputs("Enter the number of minutes: ");
		int thirdNum = KeyBoardInputs("Enter the number of seconds: ");
		
		System.out.println("The total number of seconds is " + (firstNum*3600 + secondNum*60 + thirdNum));
	}
	
	public void HowManySeconds() {
		System.out.println("How many seconds?\n");
		int seconds = KeyBoardInputs("Enter the number of seconds: ");
		int secondsInput = seconds;
		
		int hours = Math.floorDiv(seconds, 3600);
		seconds = seconds - hours*3600;
		
		int minutes = Math.floorDiv(seconds,60);
		seconds = seconds - minutes*60;
		
		System.out.println(secondsInput + " seconds is equivalent to \n" + hours + " hours\n" + minutes + " minutes\n" + seconds + " seconds\n");
	}
	
	public void FahrenheitToCelsius() {
		System.out.println("Fahrenheit to Celsius\n");
		int tempF = KeyBoardInputs("Please enter the temperature in Fahrenheit: ");
		
		double tempC = (double)tempF/(double)2.12;
		System.out.println("the temperature " + tempF + " is " + tempC);
	}
}
