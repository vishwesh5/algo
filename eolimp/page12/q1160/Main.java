package page12.q1160;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int max = Integer.MIN_VALUE, j = -1;

    for(int i=1, t=in.nextInt(); i<=t; i++) {
      int n = in.nextInt();
      if(in.nextInt() == 1 && n > max) {
        max = n;
        j = i;
      }
    }
    System.out.println(j);
  }
}
