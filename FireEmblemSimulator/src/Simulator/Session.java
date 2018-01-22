package Simulator;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Simulator.OrbSet;
import Simulator.Orb;
import Simulator.Rates;
import java.util.concurrent.ThreadLocalRandom;
public class Session {


		Scanner sc = new Scanner(System.in);
		int type;
		int row;
		List<String> Heroes;
		int count;
		int totalsummons;
		int totalorbs;
		int sessioncount;
		boolean activesession;
		boolean resetrate;
		
		public Session()
		{
			this.sc = new Scanner(System.in);
			this.Heroes = new ArrayList<String>();
			this.count = 0;
			this.totalsummons = 0;
			this.totalorbs = 0;
			this.sessioncount = 0;
			this.activesession = true;
			this.resetrate = false;
		}
		
		public int SearchForHero(int colour, String Name)
		{
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
			
			//System.out.println("Starting Summoning Simulation");
			for (int i = 0; i < 5; i++)
			{
				session[i] = new Orb(ThreadLocalRandom.current().nextInt(0,4));
			}
			sessioncount = 0;
		
			for (Orb orb : session)
			{
				if (orb.id == colour)
				{
					OrbSet Hero;
					type = ThreadLocalRandom.current().nextInt(1,101);
					if (type < app_rate.level3)
					{type = 0;}
					else if (type<app_rate.level4)
					{type = 1;}
					else if (type<app_rate.level5)
					{type = 2;}
					else 
					{type = 3;}
					
					if (colour == 0)
					{Hero = new RedOrbSet(colour,type);}
					else if (colour == 1)
					{Hero = new BlueOrbSet(colour,type);}
					else if(colour == 2)
					{Hero = new GreenOrbSet(colour,type);}
					else
					{Hero = new ColourlessOrbSet(colour,type);}
				
					totalorbs = OrbCost(sessioncount, totalorbs);
					Hero.level = Hero.Rating(type);

					Hero.Populate();
					Hero.name = Hero.SummonHero();
					if (Hero.level == "5 stars")
					{
						resetrate = true;
						Heroes.add(Hero.name);
					}
					count++;
					totalsummons++;
					sessioncount++;
					if (Hero.name == Name)
					{
						activesession = false;
						break;
					}

				}	//If orb is of colour
				else
				{
					continue;
				}
			}
			
		}
		return totalorbs;
	}
		public List<String> Lvl5Summons()
		{
			return Heroes;
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
