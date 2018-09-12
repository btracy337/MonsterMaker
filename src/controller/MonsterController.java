package controller;
import java.util.Scanner;
import model.MarshmallowMonster;

public class MonsterController

{
	// Data member section
	private MarshmallowMonster myMonster;

	// Constructor section
	public MonsterController()

	{
		myMonster = new MarshmallowMonster("Bryan", 2, 1, true, 2);
	}

	// Method secion
	public void userMonster()
	{
		
	}
	public void start()
	{
		//System.out.println(myMonster);
		//myMonster.setarmCount(9999);
		//MarshmallowMonster userMonster;
		//System.out.println("my monster has this many arms: " + myMonster.getarmCount());
		System.out.println("Okay now we are going to have you create a monster!");
		Scanner in = new Scanner(System.in);
		System.out.println("What is your monsters name?");
		String name = in.nextLine();
		System.out.println("How many legs does your monster have: Please enter a double.");
		double legs = in.nextDouble();
		System.out.println("Does your monster have noses true or false?");
		boolean noses = in.nextBoolean();
		System.out.println("How many arms does your monster have?");
		int arms = in.nextInt();
		System.out.println("How many eyes does your monster have?");
		int eyes = in.nextInt();
		System.out.println("Your monster name is " + name + " and has " + legs + " legs " + "and " + arms + " arms and " + eyes + " eyes.");
		if (noses) {System.out.println("Your monster also has noses."); }
		else {System.out.println("Also, your monster does not have noses.");}
		in.close();
		
		
	}
}
