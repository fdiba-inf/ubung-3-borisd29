package exercise3;

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
                System.out.println("Angle: " + result + " d");
            }
          else if (t == 'd') {
                 result = a*Math.PI/180;
                System.out.println("Angle: " + result + " r");
            }
        }
        while (t == 'r' && t == 'd');
    }

}
