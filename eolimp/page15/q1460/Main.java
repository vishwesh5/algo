package page15.q1460;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(),
        c = in.nextInt(), d = in.nextInt();

    LinkedList<Integer> ls = new LinkedList<Integer>();
    for(int i=1; i<=n; i++) ls.add(i);

    for(int i=0; i<b-a; i++)
      ls.add(a - 1 + i, ls.remove(b - 1));

    for(int i=0; i<d-c; i++)
      ls.add(c - 1 + i, ls.remove(d - 1));

    StringBuilder sb = new StringBuilder();
    for(int i : ls) sb.append(' ').append(i);
    System.out.println(sb.substring(1));
  }
}
