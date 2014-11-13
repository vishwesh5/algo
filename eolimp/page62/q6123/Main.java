package page62.q6123;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> s = new ArrayList<Integer>();
    int c = 0;

    while(in.hasNext()) {
      String cmd = in.next();

      if("push".equals(cmd)) {
        s.add(in.nextInt());
        c++;
        System.out.println("ok");
      } else if("pop".equals(cmd)) {
        if(c == 0) System.out.println("error");
        else {
          System.out.println(s.remove(--c));
        }
      } else if("back".equals(cmd)) {
        if(c == 0) System.out.println("error");
        else System.out.println(s.get(c-1));
      } else if("size".equals(cmd))
        System.out.println(c);
      else if("clear".equals(cmd)) {
        s.clear();
        c = 0;
        System.out.println("ok");
      }
      else {
        System.out.println("bye");
        break;
      }
    }

  }
}
