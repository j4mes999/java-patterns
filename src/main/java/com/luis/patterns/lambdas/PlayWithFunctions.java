package com.luis.patterns.lambdas;

import com.luis.patterns.lambdas.function.Function;
import com.luis.patterns.lambdas.model.Meteo;

public class PlayWithFunctions
{
  public static void main(String[] args) {
    Meteo meteo = new Meteo(10);

    Function<Meteo, Integer> readCelsius = m -> m.getTemperature();
    Function<Integer, Double> celsiusToFarenheit = t -> t*9d/5d + 32d;

    Function<Meteo, Double> readFarenheit = readCelsius.andThen(celsiusToFarenheit);

    //Using composition:
    readFarenheit = celsiusToFarenheit.compose(readCelsius);

    System.out.println("Meteo is F " + readFarenheit.apply(meteo));

  }
}
