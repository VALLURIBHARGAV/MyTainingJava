package maven.SampleMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        Calculator obj = new Calculator();
        System.out.println(obj.addNumber(34, 40));
    }
}
