//this program takes in weight lbs and conveters it to kg for earth, a planet of 
//the users choice and 2 planets from a text file, then outputs it in a table.

import sheffield.*;
public class Assignment1{
	public static void main(String[] args){
		final double LBS_TO_KG=0.45359237;
		EasyReader keyboard = new EasyReader();
		//take lbs in as input
		int weightInPounds=keyboard.readInt("Please type in an integer number of pounds ");
		//work out weight in Kg and output it to 3 d.p
		double weightInKg = weightInPounds* LBS_TO_KG;
		EasyWriter screen = new EasyWriter();
		screen.print(weightInPounds+" pounds is ");
		screen.print(weightInKg, 3);
		screen.println(" kilograms on Earth");
		//get planet name and gravity
		String planet = keyboard.readString("What planet are you on? ");
		double planetGravity = keyboard.readDouble("What is its gravity? ");
		//work out the weight in kg on that planet and output it to 3 d.p
		screen.print(weightInPounds+" pounds is ");
		screen.print(weightInKg*planetGravity,3);
		screen.println(" kilograms on "+planet);
		screen.println();
		//outputs table of results
		screen.println("Pounds   Kilograms   Planet");
		screen.print(weightInPounds,6);
		screen.print(weightInKg,4,12);
		screen.println("   EARTH");
		//row for users input planet
		screen.print(weightInPounds,6);
		screen.print(weightInKg*planetGravity,4,12);
		screen.println("   "+planet.toUpperCase());
		//row for the first planet on the file
		EasyReader fileInput = new EasyReader("planets.txt");
		String filePlanet = fileInput.readString();
		double fileGravity = fileInput.readDouble();
		screen.print(weightInPounds,6);
		screen.print(weightInKg*fileGravity,4,12);
		screen.println("   "+filePlanet.toUpperCase());
		//row for the planet from the sentance in the file
		String fileSentance = (fileInput.readString()).substring(15);
		int isIndex = fileSentance.indexOf(" is ");
		String nameFromSentance=(fileSentance.substring(0,isIndex)).toUpperCase();
		double gravityFromSentance=Double.valueOf(fileSentance.substring(isIndex+4));
		screen.print(weightInPounds,6);
		screen.print(weightInKg*gravityFromSentance,4,12);
		screen.println("   "+nameFromSentance);
}}