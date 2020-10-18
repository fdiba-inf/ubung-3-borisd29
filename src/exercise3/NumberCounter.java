package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int positiveCount = 0;
      int negativeCount = 0;  
      int sum = 0;  
      int n = input.nextInt();  
        while (n != 0) {
          if (n > 0) {
            positiveCount++;
          }
          else {
            negativeCount++;
          }
          sum = sum+n;
        n = input.nextInt();
        }
        System.out.println("Positive numbers: "+positiveCount);
        System.out.println("Negative numbers: "+negativeCount);
        System.out.println("Sum: "+ sum);
        double avg = sum/(positiveCount+negativeCount);
        System.out.println("Average: "+ sum/(positiveCount+negativeCount));
        
    }

}
