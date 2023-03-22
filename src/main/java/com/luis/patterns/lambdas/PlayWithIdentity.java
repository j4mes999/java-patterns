package com.luis.patterns.lambdas;

import com.luis.patterns.lambdas.function.Function;

public class PlayWithIdentity
{
  public static void main(String[] args) {
    Function<String, String> identity = Function.identity();
  }
}
