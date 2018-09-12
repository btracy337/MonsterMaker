package controller;

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
	public void start()
	{
		System.out.println(myMonster);
	}
}
