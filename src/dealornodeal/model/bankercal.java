
package dealornodeal.model;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author Sebastian & David
 * // this method has three inputs and returns one floating point number
 *   // it allows us to get a percentage of the total amount that is left in the cases
 *  // times by (the round number/ 9 rounds)
 * 
 */
public class bankercal {
  Scanner scanner = new Scanner(System.in);
    private Float bankOffer;
    private float mainround;
    private float cases;
    private float totalValue;
   
 // Calculates the banker offer by taking three floats returns a float   
public float bankercal(float a,float b,float c){ 
     totalValue = a;
     mainround = b;
     cases = c;
     totalValue = (totalValue/cases);
     float finalCases = (float) mainround/ 9;
      bankOffer = finalCases*totalValue;
      String roundOff = String.format("%.2f", bankOffer);
      bankOffer = Float.parseFloat(roundOff);
      System.out.println(bankOffer);
       return bankOffer;           
   }   
}