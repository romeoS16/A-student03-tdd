package de.ba.experiment.password;

public class PasswordStrengthEvaluator {

    /**
     * Bewertet die Stärke eines Passworts.
     * <p>
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param password das zu prüfende Passwort
     * @return "WEAK", "MEDIUM" oder "STRONG" nach Definition
     */

    public static String evaluateStrength(String password) {
        int points = 0;
        int length = password.length();

        if (length == 0 || password == null || password.contains(" ") || length < 6) {
            return "WEAK";
        } else {
            if (password.matches("[a-z]+")) {
                points++;
            } else if (password.matches("[A-Z]+")) {
                points++;
            } else if (password.matches("[0-9]+")) {
                points++;
            } else if (password.matches("[\\W]")) {
                points++;
            } else if (length >= 10) {
                points++;

            }
        }
        if (points <= 2) {
            return "WEAK";
        } else if (points == 3) {
            return "MEDIUM";
        } else if (points >= 4) {
            return "STRONG";
        }
        return "WEAK";
    }
}
