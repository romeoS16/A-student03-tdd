package de.ba.experiment.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }

    @Test
    public void simpleLowercasePalindrome_returnsFasle() {
        boolean result = PalindromeChecker.isPalindrome("anlöna");
        assertFalse(result);
    }

    @Test
    public void camelCasePalindrome_returnsTrue(){
        boolean result = PalindromeChecker.isPalindrome("AkLöLKa");
        assertTrue(result);
    }

    @Test
    public void spacesIgnoredPalindrome_returnsTrue(){
        boolean result = PalindromeChecker.isPalindrome("kjh kjh  hjk    hjk");
        assertTrue(result);
    }

    @Test
    public void differentSignsPalindrome_returnsTrue(){
        boolean result = PalindromeChecker.isPalindrome("asd789!==!987dsa");
        assertTrue(result);
    }

    @Test
    public void differentSignsPalindrome_returnsFalse(){
        boolean result = PalindromeChecker.isPalindrome("asd789=!987dsa");
        assertFalse(result);
    }

    @Test
    public void emptyStringPalindrome_returnsTrue(){
        boolean result = PalindromeChecker.isPalindrome("");
        assertTrue(result);
    }

    @Test(expected = NullPointerException.class)
    public void nullPalindrome_returnsFalse(){
        boolean result = PalindromeChecker.isPalindrome(null);
        assertFalse(result);
    }

}
