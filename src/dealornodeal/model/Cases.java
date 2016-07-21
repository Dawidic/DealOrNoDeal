/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dealornodeal.model;


import dealornodeal.ui.DealornoDealJFrame;
import java.util.Random;

/**
 *
 * @author Sebastian & David
 * this class stores all the cases which have the values
 * it also has the getter and setter methods
 */
public class Cases  {
    int[] caseValues = { 1, 2, 5, 10, 20, 50, 100, 150, 200, 250, 500, 750, 1000, 2000, 3000, 4000, 5000, 10000, 20000, 25000, 50000, 75000, 100000, 200000, 250000, 500000};
        
        int index;
        Random rnd = new Random();
        private final DealornoDealJFrame menu;
public Cases(DealornoDealJFrame mainFrame) {
      menu = mainFrame;          
}
//http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
        //Fisher-Yates shuffle
        
/*// Random Sort allows use to Case array values so they are always difrent   */     
    public void randomSort(){
      
for (int i = caseValues.length -1; i > 0; i--)
    {
        index = rnd.nextInt(i + 1);
        if (index != i)
        {
            caseValues[index] ^= caseValues[i];
            caseValues[i] ^= caseValues[index];
            caseValues[index] ^= caseValues[i];
        } 
    }
 }
 
  // caseOpen allows us to clear the value from the specific case 
  public void caseOpen(int y){
     if (caseValues[y] <= 1000.00){// this if question allows us to determine which list to send too
         int x = caseValues[y];// creates a local varible which gets the value inside the case
       menu.moneyListUpdate(x, 1);// sends the upbdate to the main frame for procssesing.... (x,1) is (x is the value in the case,1 represnts the lower list)
     }
      if (caseValues[y] >= 2000.00){// this if question allows us to determine which list to send too
          int x = caseValues[y];// creates a local varible which gets the value inside the case
      menu.moneyListUpdate(x, 2);// sends the upbdate to the main frame for procssesing.... (x,1) is (x is the value in the case,2 represnts the higher list)
     }
    
   caseValues[y] = 0; // set chosen case to a value of 0 " so that when we can do the total value for the cases "   
  }
  //Totalcal allows us to add all the values remaining in the array. for the banker calculation 
  public float Totalcal(){
  float totalValue =0;
  for (int t =0; t< caseValues.length; t++) {// runs though all the Case Values
                 totalValue = totalValue + caseValues[t];// adds the  value of the cases to the total value
                }
  return totalValue;// returns the total value
  }
  //retCaseValue returns the specific case value 
   public float retCaseValue(int v){
     float Value;
      Value=caseValues[v];
     return  Value;       
   }
}
