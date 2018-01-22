package Simulator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class RedOrbSet extends OrbSet{
	public RedOrbSet(int colour,int type) {
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
    		names.add("Eliwood");
    		names.add("Olivia");
    		names.add("Hana");
    		names.add("Stahl");
    		names.add("Draug");
    		names.add("Palla");
    		names.add("Hinata");
    		names.add("Fir");
    		names.add("Laslow");
    		names.add("Selena");
    		names.add("Lonque");
    		names.add("Adult Tiki");
    		names.add("Sophia");
    		names.add("Henry");
    		names.add("Raigh");
    		
    	}
    	else if (this.type == 1)
    	{
    		names.add("Eliwood");
    		names.add("Olivia");
    		names.add("Hana");
    		names.add("Stahl");
    		names.add("Draug");
    		names.add("Palla");
    		names.add("Hinata");
    		names.add("Fir");
    		names.add("Laslow");
    		names.add("Selena");
    		names.add("Lonque");
    		names.add("Adult Tiki");
    		names.add("Sophia");
    		names.add("Henry");
    		names.add("Raigh");
    		names.add("Eirika");
    		names.add("Ogma");
    		names.add("Cain");
    		names.add("Corrin");
    		names.add("Chrom");
    		names.add("Caeda");
    		names.add("Seliph");
    		names.add("Marth");
    		names.add("Roy");
    		names.add("Tharja");
    		names.add("Lilina");
    	}
    	else if (this.type == 2)
    	{
    		names.add("Eirika");
    		names.add("Ogma");
    		names.add("Cain");
    		names.add("Corrin");
    		names.add("Chrom");
    		names.add("Caeda");
    		names.add("Seliph");
    		names.add("Marth");
    		names.add("Roy");
    		names.add("Tharja");
    		names.add("Lilina");
    		names.add("Karel");
    		names.add("Alm");
    		names.add("Eldigan");
    		names.add("Lyn");
    		names.add("Ryoma");
    		names.add("Lucina");
    		names.add("Young Tiki");
    		names.add("Sanaki");
    		names.add("Leo");
    	}
    	else 
    	{
    		names.add("Ike");
    	}
    	
        for (String hero : names)
            {
	            this.charlist.put(key, hero);
	            key++;

        }
        return this.charlist;
    }
}
