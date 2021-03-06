package page9.q838;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), ns[][] = new int[n][n], i = -1;

    in.nextLine();
    while(++i < n) {
      int j = 0;
      for(char c : in.nextLine().toCharArray())
        ns[i][j++] = c - '0';
    }

    for(i=0; i<n; i++)
      for(int j=0; j<n; j++)
        ns[i][j] += min(ns, i, j);

    char c[][] = new char[n][n];
    for(i=0; i<n; i++)
      Arrays.fill(c[i], '.');

    int j = n-1;
    i = j;
    while(Math.min(i, j) > -1) {
      c[i][j] = '#';
      if(i > 0 && j > 0) {
        if(ns[i-1][j] < ns[i][j-1]) i--;
        else j--;
      } else if(i > 0) i--;
      else j--;
    }

    for(i=0; i<n; i++)
      System.out.println(new String(c[i]));
  }

  private static int min(int ns[][], int i, int j) {
    if(i == 0 && j == 0) return 0;
    if(i == 0) return ns[i][j-1];
    if(j == 0) return ns[i-1][j];
    return Math.min(ns[i-1][j], ns[i][j-1]);
  }
}
