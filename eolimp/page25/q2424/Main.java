package page25.q2424;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt();
    System.out.println(new BigInteger(in.next(), p)
        .mod(BigInteger.valueOf(p-1)).toString(p));
  }
}
