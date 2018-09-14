package controller;

import java.util.Scanner;
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
		MarshmallowMonster userMonster;
		// JOptionPane.showMessageDialog(null,"my monster has this many arms: " +
		// myMonster.getarmCount());
		JOptionPane.showMessageDialog(null, "Okay now we are going to have you create a monster!");
		// Scanner in = new Scanner(System.in);
		String name = JOptionPane.showMessageDialog(null, "What is your monsters name?");
		// String name = in.nextLine();
		double legs = JOptionPane.showMessageDialog(null, "How many legs does your monster have: Please enter a double.");
		if (validDouble(legs))
		{
			double legs = Double.parseDouble(legs);
			userMonster.setlegCount(legs);
		}
		// double legs = in.nextDouble();
		boolean noses = JOptionPane.showMessageDialog(null, "Does your monster have noses true or false?");
		if (validBoolean(noses))
		{
			boolean noses = Boolean.parseBoolean(noses);
			userMonster.sethasNoses(noses);
		}
		// boolean noses = in.nextBoolean();
		int arms = JOptionPane.showMessageDialog(null, "How many arms does your monster have?");
		if (validInt(arms))
		{
			int arms = Integer.parseInt(arms);
			userMonster.setarmCount(arms);
		}
		// int arms = in.nextInt();
		int eyes = JOptionPane.showMessageDialog(null, "How many eyes does your monster have?");
		if (validInt(eyes))
		{
			int eyes = Integer.parseInt(eyes);
			userMonster.seteyeCount(eyes);
		}
		// int eyes = in.nextInt();
		JOptionPane.showMessageDialog(null, "Your monster name is " + name + " and has " + legs + " legs " + "and " + arms + " arms and " + eyes + " eyes.");
		if (noses)
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
