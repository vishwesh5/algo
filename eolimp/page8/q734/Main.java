package page8.q734;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt(), q = in.nextInt();
    System.out.println(new BigInteger(in.next(), p).toString(q).toUpperCase());
  }
}
