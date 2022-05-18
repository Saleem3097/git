package saleem;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "please enter the number 1" );
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println( "please enter the number 2" );
        int num2 = sc.nextInt();

         System.out.println( "your "+num1+" + "+num2+" is" + (num1+num2) );
    }
}
