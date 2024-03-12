package SmallProjects;

import java.util.Scanner;

public class SmallProjectTesting {

	public static void main(String[] args) {
		ProjectOneTests();
	}
	
	public static void ProjectOneTests() {
		ProjectOne projectOne = new ProjectOne();
		
		//ProjectOne.systemMsgs();
		
		//projectOne.ComputingUsedFuelAmount();
		
		//projectOne.ThreeNumberAverage();
		
		//projectOne.convertMilesToKilometers();
		
		//projectOne.Division();
		
		//projectOne.FahrenheitToCelsius();
		
		//projectOne.HowManySeconds();
		
		//projectOne.TimeDuration();
		
		//ProjectOne.PersonalData personalData = projectOne.new PersonalData();
		//personalDataOutput(personalData);
		
		projectOne.closeKeyboard();
	}
	
	public static void personalDataOutput(ProjectOne.PersonalData personalData) {
		personalData.name = "Robin Banks";
		personalData.birthDay = "July 12th";
		personalData.intrests = "Sports, Programming, Music";
		personalData.favBook = "The Life of Pi";
		personalData.favFilm = "Citizen Kane";
		
		System.out.println("Personal data\n");
		System.out.println("Name: " + personalData.name);
		System.out.println("Birthday: " + personalData.birthDay);
		System.out.println("Interests: " + personalData.intrests);
		System.out.println("Favorite book: " + personalData.favBook);
		System.out.println("Favorite film: " + personalData.favFilm + "\n");
	}
}
