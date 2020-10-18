package exercise3;

import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {
        int d1 = 5;
        int d2 = 6;
        int count = 0;
        for (int n = 100; n < 1000; n++) {
          if (n%d1 == 0 && n%d2 == 0) {
            System.out.print(n + " ");
          count++;
          }
          if (count == 10) {
          System.out.println();
          count = 0;
          }
    }

}
}