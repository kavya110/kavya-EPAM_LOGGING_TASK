package epam.codeclean;

import java.io.IOException;

public class compoundinterest {
	public double Compound_interest(double principle_amt,double rate_of_interest,double time,double noof_times) throws IOException
    {
		
		double final_amt;
		
		final_amt=principle_amt*Math.pow((1+((rate_of_interest/100)/noof_times)),noof_times*time);
    	
    	return final_amt;
    }
}
