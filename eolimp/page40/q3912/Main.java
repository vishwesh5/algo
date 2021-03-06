package page40.q3912;

import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    Stack<String> s = new Stack<String>();
    while(n-- > 0)
      s.push(in.next());

    StringBuilder sb = new StringBuilder();
    while(!s.isEmpty())
      sb.append(s.pop());

    System.out.println(sb.toString());
  }
}
