package Simulator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class BlueOrbSet extends OrbSet{
	public BlueOrbSet(int colour,int type) {
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
    		names.add("Gwendolyn");
    		names.add("Est");
    		names.add("Oboro");
    		names.add("Shanna");
    		names.add("Jagen");
    		names.add("Sully");
    		names.add("Subaki");
    		names.add("Donnel");
    		names.add("Florina");
    		names.add("Corrin(f)");
    		names.add("Odin");
    		names.add("Robin");

    		
    	}
    	else if (this.type == 1)
    	{
    		names.add("Abel");
    		names.add("Gwendolyn");
    		names.add("Est");
    		names.add("Effie");
    		names.add("Oboro");
    		names.add("Catria");
    		names.add("Shanna");
    		names.add("Clair");
    		names.add("Jagen");
    		names.add("Sully");
    		names.add("Subaki");
    		names.add("Cordelia");
    		names.add("Donnel");
    		names.add("Peri");
    		names.add("Florina");
    		names.add("Lukas");
    		names.add("Corrin(f)");
    		names.add("Nowi");
    		names.add("Odin");
    		names.add("Reinhardt");
    		names.add("Robin");
    	}
    	else
    	{
    		names.add("Azura");
    		names.add("Abel");
    		names.add("Ephraim");
    		names.add("Effie");
    		names.add("Catria");
    		names.add("Claire");
    		names.add("Cordelia");
    		names.add("Hinoka");
    		names.add("Peri");
    		names.add("Lukas");
    		names.add("Ninian");
    		names.add("Nowi");
    		names.add("Olwen");
    		names.add("Reinhardt");
    		names.add("Linde");
    	}
    	
        for (String hero : names)
            {
	            this.charlist.put(key, hero);
	            key++;

        }
        return this.charlist;
    }
}
