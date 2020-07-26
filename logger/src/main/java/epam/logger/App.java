package epam.logger;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	constructionset test= new constructionset();
        Scanner in=new Scanner(System.in);
        int choice_of_material=in.nextInt();
        double Area = in.nextDouble();
        double final_amt=test.cost(choice_of_material,Area);
            }
}
