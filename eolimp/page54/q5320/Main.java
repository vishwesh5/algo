package page54.q5320;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = Integer.toBinaryString(in.nextInt());
    int k = in.nextInt(), l = s.length();
    if(l > k)
      System.out.println(s.substring(0, 1) + s.substring(l-k+1));
    else {
      String ss = "";
      for(int i=k-l; i>0; i--) ss += "0";
      System.out.println(ss + s);
    }
  }
}
