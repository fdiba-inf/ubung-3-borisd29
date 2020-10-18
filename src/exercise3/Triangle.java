package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0)
        {System.exit(1);}
        if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
        {System.exit(1);};
        if(a==b && b==c) {
        double s = (a+b+c)/2;
            System.out.println("Area: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
            System.out.println("Triangle: equilateral");
        }
        else if(a!=b && b!=c && c!=a)
        {
            double s = (a+b+c)/2;
            System.out.println("Area: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
            System.out.println("Triangle: scalene");
        }
        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
        {
            double s = (a+b+c)/2;
            System.out.println("Area: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
            System.out.println("Triangle: isosceles");
        }
    }
}
