package com.ferhatelmas.eolimp.page9.q267;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(new BigInteger(in.nextLine())
        .subtract(new BigInteger(in.nextLine())));
  }
}
