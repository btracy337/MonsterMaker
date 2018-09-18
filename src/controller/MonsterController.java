package controller;

//import java.util.Scanner;
import model.MarshmallowMonster;
import javax.swing.JOptionPane;

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
		// JOptionPane.showMessageDialog(null, "Hi how are ya?");
		// use this instead of system.out.println
		// System.out.println(myMonster);
		// myMonster.setarmCount(9999);
		MarshmallowMonster userMonster = new MarshmallowMonster("", 0, 0, false, 0);
		// JOptionPane.showMessageDialog(null,"my monster has this many arms: " +
		// myMonster.getarmCount());
		JOptionPane.showMessageDialog(null, "Okay now we are going to have you create a monster!");
		// Scanner in = new Scanner(System.in);
		String name = JOptionPane.showInputDialog(null, "What is your monsters name?");
		// String name = in.nextLine();
		String legs = JOptionPane.showInputDialog(null, "How many legs does your monster have: Please enter a double."); 
		double legCount = 0;
		if (validDouble(legs))
		{
		    legCount = Double.parseDouble(legs);
			userMonster.setlegCount(legCount);
		}
		// double legs = in.nextDouble();
		String noses = JOptionPane.showInputDialog(null, "Does your monster have noses true or false?");
		boolean hasNose = false;
		int armCount = 0;
		int eyeCount = 0;
		
		if (validBoolean(noses))
		{
			hasNose = Boolean.parseBoolean(noses);
			userMonster.sethasNoses(hasNose);
		}
		// boolean noses = in.nextBoolean();
		String arms = JOptionPane.showInputDialog(null, "How many arms does your monster have?");
		if (validInt(arms))
		{
		    armCount = Integer.parseInt(arms);
			userMonster.setarmCount(armCount);
		}
		// int arms = in.nextInt();
		String eyes = JOptionPane.showInputDialog(null, "How many eyes does your monster have?");
		if (validInt(eyes))
		{
		    eyeCount = Integer.parseInt(eyes);
			userMonster.seteyeCount(eyeCount);
		}
		// int eyes = in.nextInt();
		JOptionPane.showMessageDialog(null, "Your monster name is " + name + " and has " + legs + " legs " + "and " + arms + " arms and " + eyes + " eyes.");
		if (hasNose)
		{
			JOptionPane.showMessageDialog(null, "Your monster also has noses.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Also, your monster does not have noses.");
		}
		// in.close();
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an integer value like 12345.");
		}

		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requirese a double value human!");
		}
		return isValid;
	}

	public boolean validBoolean(String maybeBoolean)
	{
		boolean isValid = false;
		try
		{
			Boolean.parseBoolean(maybeBoolean);
			isValid = true;
		}	
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Enter a valid true/false.");
		}
		return isValid;
	}
}
