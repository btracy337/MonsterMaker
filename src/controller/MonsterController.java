package controller;

import model.MarshmallowMonster;

public class MonsterController

{
	// Data member section
	private MarshmallowMonster myMonster;

	// Constructor section
	public MonsterController()

	{
		myMonster = new MarshmallowMonster();
	}

	// Method secion
	public void start()
	{
		System.out.println(myMonster);
	}
}
