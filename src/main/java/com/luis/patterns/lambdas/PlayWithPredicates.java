package com.luis.patterns.lambdas;

import com.luis.patterns.lambdas.function.Predicate;

public class PlayWithPredicates
{
  public static void main(String[] args) {

    Predicate<String> p1 = s -> s != null;
    Predicate<String> p2 = s -> s.isEmpty();

    Predicate<String> notP2 = p2.negate();
    Predicate<String> p3 = p1.and(p2.negate());

    System.out.println("test for null: " + p3.test(null));
    System.out.println("test for empty: " + p3.test(""));
    System.out.println("test for non empty: " + p3.test("Hello"));

  }
}
