package epam.codeclean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;



public class AppTest 
{
	  public void testApp() throws IOException
	    {
	    	compoundinterest test = new compoundinterest();
	    	simpleinterest simple =new simpleinterest();
	        Double Compound_result=test.Compound_interest(1500, 4.3, 6, 4);
	        assertEquals(Compound_result,1938.8368221341054);
	        Double Simple_result=simple.Simple_interest(50000, 8, 1);
	        assertEquals(Simple_result,4000.0);
	    }
}
