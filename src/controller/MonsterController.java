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
	JOptionPane.showMessageDialog(null, "Hi how are ya?");
	//use this instead of system.out.println
	//System.out.println(myMonster);
	myMonster.setarmCount(9999);
	MarshmallowMonster userMonster;
	JOptionPane.showMessageDialog(null,"my monster has this many arms: " + myMonster.getarmCount());
	JOptionPane.showMessageDialog(null,"Okay now we are going to have you create a monster!");
	Scanner in = new Scanner(System.in);
	JOptionPane.showMessageDialog(null,"What is your monsters name?");
	String name = in.nextLine();
	JOptionPane.showMessageDialog(null,"How many legs does your monster have: Please enter a double.");
	double legs = in.nextDouble();
	JOptionPane.showMessageDialog(null,"Does your monster have noses true or false?");
	boolean noses = in.nextBoolean();
	JOptionPane.showMessageDialog(null,"How many arms does your monster have?");
	int arms = in.nextInt();
	JOptionPane.showMessageDialog(null,"How many eyes does your monster have?");
	int eyes = in.nextInt();
	JOptionPane.showMessageDialog(null,"Your monster name is " + name + " and has " + legs + " legs " + "and " + arms + " arms and " + eyes + " eyes.");
	if (noses) {JOptionPane.showMessageDialog(null,"Your monster also has noses."); }
	else {JOptionPane.showMessageDialog(null,"Also, your monster does not have noses.");}
	in.close();	
	}
}
