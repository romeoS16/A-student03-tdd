package de.ba.experiment.password;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordStrengthEvaluatorTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void nullPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab1");
        assertEquals("WEAK", result);
    }

    @Test (expected = NullPointerException.class)
    public void null1Password_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength(null);
        assertEquals("WEAK", result);
    }

    @Test
    public void emptyStringPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("");
        assertEquals("WEAK", result);
    }

    @Test
    public void spacePassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength(" ");
        assertEquals("WEAK", result);
    }

    @Test
    public void shortFiveCharsPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("45!21");
        assertEquals("WEAK", result);
    }

    @Test
    public void oneFromEverythingAndElevenCharsPassword_isStrong() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aA11aA11aA11a");
        assertEquals("STRONG", result);
    }

    @Test
    public void oneUpperCasePassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("Aaaaaaaa");
        assertEquals("WEAK", result);
    }

    @Test
    public void oneLowerCasePassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aAAAAAAAA");
        assertEquals("WEAK", result);
    }

    @Test
    public void oneNumberPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aaaa1aaaa");
        assertEquals("WEAK", result);
    }

    @Test
    public void oneNumberAndTenCharsPassword_isStrong() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aaaa1aaaaa");
        assertEquals("STRONG", result);
    }

    @Test
    public void oneSpecialThingPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aaa!aaa");
        assertEquals("WEAK", result);
    }

    @Test
    public void tenLowerCasePassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aaaaaa");
        assertEquals("WEAK", result);
    }

    @Test
    public void noLowerCasePassword_isStrong() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ASD456QW!!!456");
        assertEquals("STRONG", result);
    }

    @Test
    public void perfectPassword_isStrong() {
        String result = PasswordStrengthEvaluator.evaluateStrength("asdQEW!$???456");
        assertEquals("STRONG", result);
    }
}
