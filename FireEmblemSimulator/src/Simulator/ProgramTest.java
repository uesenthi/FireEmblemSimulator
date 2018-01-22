package Simulator;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;
import Simulator.OrbSet;
import Simulator.Orb;
import Simulator.Rates;
import java.util.concurrent.ThreadLocalRandom;
public class ProgramTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		int type;
		int row;
		int count = 0;
		int totalorbs = 0;
		int sessioncount = 0;
		boolean activesession = true;
		boolean resetrate = false;
		
		Orb[] session = new Orb[5];
		Rates app_rate = new Rates();
		while (activesession)
		{
			if (resetrate)
			{
				app_rate.ResetRates();
				count = 0;
				resetrate = false;
			}
			if (count >= 5)
			{
				app_rate.IncreaseRates();
				count = 0;
			}
			System.out.println("Starting Summoning Simulation");
			for (int i = 0; i < 5; i++)
			{
				session[i] = new Orb(ThreadLocalRandom.current().nextInt(0,4));
			}
			sessioncount = 0;
		
			while (sessioncount < 5)
			{
				System.out.println("Summoning Rates: " + 
				app_rate.level3 + "% " + 
				(app_rate.level4-app_rate.level3) + "% "+ 
				(app_rate.level5-app_rate.level4) + "% " + 
				(app_rate.level5banner-app_rate.level5) + "% " );
				
				for (int i = 0; i < 5 ; i++)
				{
					System.out.println("Row " + i + ": " + session[i].name + " (" + session[i].level+")");
				}
				System.out.println();
				System.out.println("Total Orbs Spent: " + totalorbs);
				System.out.println("Select the Row number:");
			
				row = sc.nextInt();
				if (session[row] instanceof OrbSet)
				{
					System.out.println();
					System.out.println("Already Opened. Choose a different row");
					System.out.println();
					continue;
				}
				
				//Determine the level of the next summon
				type = ThreadLocalRandom.current().nextInt(1,101);
				if (type < app_rate.level3)
				{type = 0;}
				else if (type<app_rate.level4)
				{type = 1;}
				else if (type<app_rate.level5)
				{type = 2;}
				else 
				{type = 3;}
				
				//Create the set of possible heroes, based on orb colour
				if(session[row].id == 0)
				{
					session[row] = new RedOrbSet(session[row].id,type);
				}
				else if (session[row].id == 1)
				{
					session[row] = new BlueOrbSet(session[row].id,type);
				}
				else if (session[row].id == 2)
				{
					session[row] = new GreenOrbSet(session[row].id,type);
				}
				else
				{
					session[row] = new ColourlessOrbSet(session[row].id,type);
				}
				totalorbs = OrbCost(sessioncount, totalorbs);
				//If summoned level 5, reset appearance rate at the end of the session
				session[row].level = session[row].Rating(type);
				if (session[row].level == "5 stars")
				{
					resetrate = true;
				}
				session[row].Populate();
				session[row].name =session[row].SummonHero();
				
				System.out.println("Congratz! You got a " +session[row].level + " "+session[row].name+"!");
				count++;
				sessioncount++;
				System.out.println();
				System.out.println("Continue current session? Press 0 to quit");
				if (sc.nextInt() == 0)
				{
					break;
				}
			}
		}
	}
	
	public int OrbCost(int sessioncount, int Orbsum)
	{
		if (sessioncount == 0)
		{
			Orbsum = Orbsum + 5;
		}
		else if (sessioncount == 4)
		{
			Orbsum = Orbsum + 3;
		}
		else 
		{
			Orbsum = Orbsum + 4;
		}
		return Orbsum;
	}
}
