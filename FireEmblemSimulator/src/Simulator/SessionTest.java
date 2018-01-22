package Simulator;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import Simulator.Session;
public class SessionTest {

	@Test
	public void test() {
		Session summon = new Session();

		int cost = summon.SearchForHero(3, "Takumi");
		
		System.out.println("Total Orbs spent: "+cost);
		System.out.println("Total Summons: "+summon.totalsummons);
		for (String hero : summon.Heroes)
		{
			System.out.println(hero);
		}
	}

}
 