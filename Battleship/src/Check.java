
public class Check {
	Setdot sd;
	public Check (Setdot sd_)
	{		sd = sd_;
	}
	
	public int nr=0;
	
public void check(int x)
{
	if(x==sd.z|| x==sd.y)
	{System.out.println("Hit!");
	nr++;
	}
	else
	{System.out.println("Miss!");
	}
	}
}
