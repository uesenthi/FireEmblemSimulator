package Simulator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class GreenOrbSet extends OrbSet{
	public GreenOrbSet(int colour,int type) {
		super(colour,type);
		this.type = type;
        this.charlist = new Hashtable();
        this.active = true;
        this.level = "Empty";
	}
	
	@Override
    public Hashtable Populate()
    {
    	int key = 0;
    	List<String> names = new ArrayList<String>();
    	if (this.type == 0)
    	{
    		names.add("Gunter");
    		names.add("Cherche");
    		names.add("Arthur");
    		names.add("Bartre");
    		names.add("Barst");
    		names.add("Frederick");
    		names.add("Beruka");
    		names.add("Cecilia");
    		names.add("Nino");
    		
    	}
    	else if (this.type == 1)
    	{
    		names.add("Camilla");
    		names.add("Gunter");
    		names.add("Sheena");
    		names.add("Cherche");
    		names.add("Arthur");
    		names.add("Batre");
    		names.add("Barst");
    		names.add("Frederick");
    		names.add("Beruka");
    		names.add("Hawkeye");
    		names.add("Raven");
    		names.add("Fae");
    		names.add("Cecilia");
    		names.add("Nino");
    		names.add("Merric");
    	}
    	else if (this.type == 2)
    	{
    		names.add("Camilla");
    		names.add("Sheena");
    		names.add("Hector");
    		names.add("Hawkeye");
    		names.add("Minerva");
    		names.add("Raven");
    		names.add("Fae");
    		names.add("Merric");
    		names.add("Julia");
    	}
    	else 
    	{
    		names.add("Soren");
    		names.add("Titania");
    	}
    	
        for (String hero : names)
            {
	            this.charlist.put(key, hero);
	            key++;

        }
        return this.charlist;
    }
}
