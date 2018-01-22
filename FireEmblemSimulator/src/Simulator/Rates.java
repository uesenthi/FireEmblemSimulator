package Simulator;

public class Rates {
	int increase;
	double level3;
	double level4;
	double level5;
	double level5banner;
	
	public Rates()
	{
		int increase = 0;
		this.level3 = 58;
		this.level4 = 94;
		this.level5 = 97;
		this.level5banner = 100;
	}
	
	public void IncreaseRates()
	{
		this.increase++;
		this.level3 = 58-0.31*increase;
		this.level4 = 94-0.5*increase;
		this.level5 = 97-0.25*increase;
	}
	public void ResetRates()
	{
		int increase = 0;
		this.level3 = 58;
		this.level4 = 94;
		this.level5 = 97;
	}
}
