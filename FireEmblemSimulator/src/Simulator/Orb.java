package Simulator;

import java.util.Hashtable;

public class Orb {

	int id;
	String name;
	String level = "";
	Hashtable charlist;
	boolean active;
	
	public Orb(int i)
	{
		this.id = i;
		if (i == 0)
			this.name = "red";
		else if (i == 1)
		{
			this.name = "blue";
		}
		else if (i == 2)
		{
			this.name = "green";
		}
		else 
		{
			this.name = "colourless";
		}
	}
	 public Hashtable Populate(){ return this.charlist;}
	 
	 public String SummonHero()
	 {return "none";}
	 
	 public String Rating(int type)
	 {return "Empty";}
}
