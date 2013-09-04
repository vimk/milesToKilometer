//opgave 2.5 (2.6 i 7. udgave, side 137
package milestokilometer;
import java.util.Scanner;

/**
 *
 * @author Kim Vammen
 */
public class MilesToKilometer
{
    public static void main(String[] args)
    {
        final double conversionValue = 1.60935;
        double km;
        String miles;
        
        System.out.println("Enter the number og miles to be converted: ");
        
        Scanner scan = new Scanner (System.in);
        miles = scan.nextLine();
        int cmiles = Integer.parseInt(miles);
        
        System.out.println(cmiles + " miles will be converted to kilometers.");
        
        km = cmiles * conversionValue;
        
        System.out.println(cmiles + " miles er " + km + ".");
    }
}
