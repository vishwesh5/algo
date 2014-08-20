package page15.q1458;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if(n == 1)
      System.out.println(in.nextInt());
    else {
      LinkedList<Integer> ns = new LinkedList<Integer>();
      for (int i = 0; i < n; i++) ns.add(in.nextInt());
      ns.add(0, ns.remove(n / 2 - 1));
      ns.add(ns.remove(n / 2 + n % 2));

      StringBuilder sb = new StringBuilder();
      for (int i : ns) sb.append(' ').append(i);
      System.out.println(sb.substring(1));
    }
  }
}
