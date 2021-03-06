package page17.q1611;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int i = in.nextInt(), j = in.nextInt();
    System.out.println(convert(s, i, j));
  }

  private static String convert(String s, int i, int j) {
    String mid = new StringBuilder(s.substring(i-1, j)).reverse().toString();
    return s.substring(0, i-1) + mid + s.substring(j);
  }
}
