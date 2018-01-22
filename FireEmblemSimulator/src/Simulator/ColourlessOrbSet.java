package Simulator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ColourlessOrbSet extends OrbSet{
	public ColourlessOrbSet(int colour,int type) {
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
    		names.add("Gordin");
    		names.add("Setsuna");
    		names.add("Niles");
    		names.add("Virion");
    		names.add("Gaius");
    		names.add("Saizu");
    		names.add("Felicia");
    		names.add("Matthew");
    		names.add("Azama");
    		names.add("Clarine");
    		names.add("Serra");
    		names.add("Lissa");
    		names.add("Wrys");
    	}
    	else if (this.type == 1)
    	{
    		names.add("Klein");
    		names.add("Gordin");
    		names.add("Jeorge");
    		names.add("Setsuna");
    		names.add("Niles");
    		names.add("Rebecca");
    		names.add("Virion");
    		names.add("Kagero");
    		names.add("Gaius");
    		names.add("Saizo");
    		names.add("Jakob");
    		names.add("Felicia");
    		names.add("Matthew");
    		names.add("Azama");
    		names.add("Clarine");
    		names.add("Sakura");
    		names.add("Serra");
    		names.add("Priscilla");
    		names.add("Maria");
    		names.add("Lachesis");
    		names.add("Lissa");
    		names.add("Wrys");
    		names.add("Lucius");

    	}
    	else if (this.type == 2)
    	{
    		names.add("Faye");
    		names.add("Klein");
    		names.add("Jeorge");
    		names.add("Takumi");
    		names.add("Rebecca");
    		names.add("Kagero");
    		names.add("Jaffar");
    		names.add("Jakob");
    		names.add("Elise");
    		names.add("Sakura");
    		names.add("Priscilla");
    		names.add("Maria");
    		names.add("Lachesis");
    		names.add("Lucius");
    	}
    	else 
    	{
    		names.add("Mist");
    	}
    	
        for (String hero : names)
            {
	            this.charlist.put(key, hero);
	            key++;

        }
        return this.charlist;
    }
}
