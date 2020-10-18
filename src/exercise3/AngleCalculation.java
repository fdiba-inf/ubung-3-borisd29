package exercise3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        char t = input.next().charAt(0);
        double result = 0;
        do {
            if (t == 'r') {
                result = a*180/Math.PI;
                System.out.println("Angle: " + (new DecimalFormat("0.00").format(result)) + "d");
            }
          else if (t == 'd') {
                 result = a*Math.PI/180;
                System.out.println("Angle: " + (new DecimalFormat("0.00").format(result)) + "r");
            }
        }
        while (t == 'r' && t == 'd');
    }

}
