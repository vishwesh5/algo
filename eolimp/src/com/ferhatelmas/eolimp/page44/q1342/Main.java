package com.ferhatelmas.eolimp.page44.q1342;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);

    boolean flag;
    int n = in.nextInt(), i, j, len, min;
    int[] res = new int[n];

    String s, sub;
    String[] ss;

    for(i=0; i<n; i++) {
      s = in.next();
      len = s.length();
      for(j=1; j<=len; j++) {
        flag=true;
        sub=s.substring(0, j);
        ss=s.split(sub);
        for(String sss : ss) {
          if(!sub.equals(sss)) {
            flag=false;
            break;
          }
        }

        if(flag){
          res[i]=j;
          break;
        }

      }

    }
    for(i=0; i<n-1; i++)
      System.out.println(res[i] + "\n");
    System.out.println(res[n-1]);
  }

}