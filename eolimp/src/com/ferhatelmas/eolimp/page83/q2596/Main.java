package com.ferhatelmas.eolimp.page83.q2596;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int m = in.nextInt(), n = in.nextInt(), t = in.nextInt();
    int[] xs = new int[2*m], ys = new int[2*n];
    Arrays.fill(xs, n); Arrays.fill(ys, m);
    for(int i=0; i<t; i++){
      int x = in.nextInt()-1, y = in.nextInt()-1;
      xs[x] = Math.min(n-y-1, xs[x]);
      xs[x+m] = Math.min(y, xs[x+m]);
      ys[y] = Math.min(m-x-1, ys[y]);
      ys[y+n] = Math.min(x, ys[y+n]);
    }

    System.out.println(Math.max(sum(xs), sum(ys)));
  }

  private static int sum(int[] d) {
    int a = 0, b = 0, l = d.length/2;
    for(int i=0; i<l; i++) {
      a += d[i]; b += d[i+l];
    }
    return Math.max(a, b);
  }
}
