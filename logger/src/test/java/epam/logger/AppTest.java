package epam.logger;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void testApp()
    {
        constructionset test=new constructionset();
        double result=test.cost(3,450);
        assertEquals(result,810000.0);
    }
}