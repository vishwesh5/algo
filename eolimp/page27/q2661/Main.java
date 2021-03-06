package page27.q2661;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TreeSet<Integer> t = new TreeSet<Integer>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    for(int i=0, j=in.nextInt(); i<j; i++) t.add(in.nextInt());
    for(int i=0, j=in.nextInt(); i<j; i++) t.add(in.nextInt());
    StringBuilder sb = new StringBuilder();
    for(int i : t.descendingSet()) sb.append(" ").append(i);
    System.out.println(sb.substring(1));
  }
}
