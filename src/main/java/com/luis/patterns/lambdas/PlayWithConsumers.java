package com.luis.patterns.lambdas;

import com.luis.patterns.lambdas.function.Consumer;

public class PlayWithConsumers
{
  public static void main(String[] args) {

    Consumer<String> c1 = s -> System.out.println("c1 = " + s);
    Consumer<String> c2 = s -> System.out.println("c2 = " + s);

    //Chainning consumers c1 and c2 in an awkward way:
    //Consumer<String> c3 = s -> {
    //  c1.accept(s);
    //  c2.accept(s);
    //};

    //But there is a better way:
    Consumer<String> c4 = c1.andThen(c2);

    //c3.accept("Hello");
    c4.accept("Hello");
    System.out.println("Exiting main");

  }
}
