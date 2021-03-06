package page12.q1116;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n;
    while(in.hasNextInt()) {
      n = in.nextInt();
      System.out.println(n == 0 ? 10 : solve(n));
    }
  }

  private static String solve(int n) {
    if(n < 10) return String.valueOf(n);
    StringBuilder sb = new StringBuilder();
    boolean isDivisible;
    while(n > 1) {
      isDivisible = false;
      for(int i=9; i>1; i--) {
        if(n%i == 0) {
          n /= i;
          sb.append(i);
          isDivisible = true;
          break;
        }
      }
      if(!isDivisible) return "-1";
    }
    return sb.reverse().toString();
  }
}
