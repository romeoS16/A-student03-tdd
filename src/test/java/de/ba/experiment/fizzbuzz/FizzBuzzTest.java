package de.ba.experiment.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    // TODO: weitere Tests schreiben
    @Test
    public void fizzBuzzOfThree_returnsArrayWithFizz(){
        String[] result = FizzBuzz.fizzBuzz(3);
        assertArrayEquals(new String[]{"Fizz"}, result);
    }

    @Test
    public void fizzBuzzOfFive_returnsArrayWithBuzz(){
        String[] result = FizzBuzz.fizzBuzz(5);
        assertArrayEquals(new String[]{"Buzz"}, result);
    }

    @Test
    public void fizzBuzzOfThreeTimesFive_returnsArrayWithFizzBuzz(){
        String[] result = FizzBuzz.fizzBuzz(15);
        assertArrayEquals(new String[]{"FizzBuzz"}, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fizzBuzzOfZero_returnsArrayWithZero(){
        String[] result = FizzBuzz.fizzBuzz(0);
        assertArrayEquals(new String[]{"0"}, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fizzBuzzOfNegativeNumber_returnsException(){
        String[] result = FizzBuzz.fizzBuzz(-1);
        assertArrayEquals(new String[]{"0"}, result);
    }

    @Test
    public void fizzBuzzOfFortyTwo_returnsArrayWithFizz(){
        String[] result = FizzBuzz.fizzBuzz(42);
        assertArrayEquals(new String[]{"Fizz"}, result);
    }
    
}
