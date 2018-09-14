package model;

public class MarshmallowMonster

{
	// ------data member section-----------//
	// always private
	private String name;
	private double legCount;
	private boolean hasNoses;
	private int armCount;
	private int eyeCount;

	public MarshmallowMonster()
	{
		// default values are zero, null, or false.
	}

	public MarshmallowMonster(String name)
	{
		this.name = name;
		
	}
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount) 
	{
		this.legCount = legCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		this.eyeCount = eyeCount;
		this.name = name;
	
		
	}
		//Getters
	public String getName()
	{
		//return is automatic exit point of a method.
		return name;
	}
	public double getlegCount()
	{
		return legCount;
	}
	public boolean gethasNoses()
	{
		return hasNoses;
	}
	public int getarmCount()
	{
		return armCount;
	}
	public int geteyeCount()
	{
		return eyeCount;
	}
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setlegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void seteyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void sethasNoses(boolean noses)
	{
		this.hasNoses = noses;
	}
	
	public void setarmCount(int arms)
	{
		this.armCount = arms;
	}
	
	public String toString()
	{
		String description = "My monster's name is " + name + " he has " + legCount + " legs" + eyeCount + " eyes" + armCount + " arms";

		return description;
	}
}
