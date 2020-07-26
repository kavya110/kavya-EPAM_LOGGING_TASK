package epam.logger;
import java.lang.System.LoggerFinder;
import java.util.logging.Logger;


interface consta
{
	public double cost (int choice, double Area_of_house );
}
public class constructionset implements consta {
	private static final Logger LOGGER = java.util.logging.Logger.getLogger(App.class);

	public double cost(int choice, double Area_of_house) 
	{
		double cost = 0;
		switch(choice)
		{
		case 1:
			cost=Area_of_house*1200;
		case 2 :
			cost=Area_of_house*1500;
		case 3:
			cost=Area_of_house*1800;
		case 4:
			cost=Area_of_house*2500;
		default :
			LoggerFinder.error("Due to incorrect choice program terminated");
		}
		return cost;
	}
}



