package epam.codeclean;

/**
 * Hello world!
 *
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;




public class App 
{
	private static System LogManager;
	private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) throws IOException
    {
        simpleinterest test= new simpleinterest();
        Scanner in=new Scanner(System.in);
        double noof_times,principle_amt,rate_of_interest,time;
        noof_times=in.nextDouble();
        principle_amt=in.nextDouble();
        rate_of_interest=in.nextDouble();
        if(rate_of_interest==0)
		{
			((Object) LOGGER).error("Arithmetic Exception found \n Program Terminated");
			return;
		}
        time=in.nextDouble();
        double Sfinal_amt=simpleinterest.Simple_interest(principle_amt,rate_of_interest,time);
        compoundinterest test1= new compoundinterest();
        double Cfinal_amt=test1.Compound_interest(principle_amt,rate_of_interest,time,noof_times);
    }
}
