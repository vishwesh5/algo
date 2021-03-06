package page10.q972;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static class Key implements Comparable {
    int h, m, s;

    public Key(int h, int m, int s) {
      this.h = h;
      this.m = m;
      this.s = s;
    }

    public void print() {
      System.out.println(h + " " + m + " " + s);
    }

    @Override
    public int compareTo(Object o) {
      Key k = (Key)o;
      if(h < k.h) return -1;
      else if(h > k.h) return 1;

      if(m < k.m) return -1;
      else if(m > k.m) return 1;

      return s - k.s;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Key ks[] = new Key[n];

    while(--n > -1) {
      ks[n] = new Key(in.nextInt(), in.nextInt(), in.nextInt());
    }

    Arrays.sort(ks);
    for(Key k : ks)
      k.print();
  }
}
