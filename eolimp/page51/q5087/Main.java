package page51.q5087;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt(), i = 0;

    ArrayList<Integer> s = new ArrayList<Integer>();
    while(t-- > 0) {
      int op = in.nextInt();
      if(op == 1) {
        s.add(in.nextInt());
        i++;
      } else
        System.out.println(s.remove(--i));
    }
  }
}
