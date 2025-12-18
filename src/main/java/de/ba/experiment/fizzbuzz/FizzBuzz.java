package de.ba.experiment.fizzbuzz;

public class FizzBuzz {

    /**
     * Gibt für die Zahlen von 1 bis n jeweils einen String zurück.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param n die größe des Arrays
     * @return ein String-Array der Länge n mit den FizzBuzz-Werten
     */

    public static String[] fizzBuzz(int n) {
        if(n % 3 == 0 && n % 5 != 0){
            return new String[]{"Fizz"};
        } else if (n <= 0) {
            throw new IllegalArgumentException("Not allowed");
        } else if (n % 5 == 0 && n % 3 != 0) {
            return new String[]{"Buzz"};
        } else if (n % 5 == 0 && n % 3 == 0) {
            return new String[]{"FizzBuzz"};
        }
        return new String[]{String.valueOf(n)};
    }
}
