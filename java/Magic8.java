//import math to use random tool
import java.lang.Math;

public class Magic8 {

    /**
     * @param args the command line arguments
     */
   static int rand= (int)(Math.random() * 8);
   
    public static void main(String[] args) {
        // TODO code application logic here
        // run the code in main and print out the randomly decided fortune-telling
    switch(rand) {
      
      case 0:
      System.out.println("I am so lonely...");
      break;
      case 1:
      System.out.println("Expect good fortune~");
      break;
      case 2:
      System.out.println("Business downfall; bad work vibes");
      break;
      case 3:
      System.out.println("Luck in stocks!");
      break;
      case 4:
      System.out.println("Take extra care in health");
      break;
      case 5:
      System.out.println("Rise and fall, be wary of incidents");
      break;
      case 6:
      System.out.println("Overcome your challenges; success awaits. ");
      break;
      case 7:
      System.out.println("Gain a partner; lose a partner");
      break;
      default: 
      System.out.println("Something went wrong");
      break;
    }
    }
    
}
