package page23.q2239;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int sieve[] = new int[1025];
    Arrays.fill(sieve, 0);
    for(int i=2; i<sieve.length; i++) {
      if(sieve[i] == 0) {
        sieve[i] = 1;
        for(int j=2*i; j<sieve.length; j+=i) {
          sieve[j]++;
        }
      }
    }
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), mc = 0, mv = Integer.MAX_VALUE, c;
    while(n-- > 0) {
      c = in.nextInt();
      if((sieve[c] > mc) || (sieve[c] == mc && c < mv)) {
        mv = c;
        mc = sieve[c];
      }
    }
    System.out.println(mv);
  }
}
