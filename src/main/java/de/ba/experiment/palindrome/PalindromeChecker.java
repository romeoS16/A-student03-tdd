package de.ba.experiment.palindrome;

public class PalindromeChecker {

    /**
     * Prüft, ob ein gegebener String ein Palindrom ist.
     * <p>
     * Ein Palindrom liest sich vorwärts und rückwärts gleich.
     * <p>
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param text der zu prüfende Text (kann null sein)
     * @return true, wenn der Text nach vorgegebener Definition ein Palindrom ist, sonst false
     */

    public static boolean isPalindrome(String text) {
        text = text.replaceAll(" +","");
        String lowerCaseString = text.toLowerCase();
        int length = lowerCaseString.length();

        if (length == 0) {
            return true;
        } else if (text == null) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (lowerCaseString.charAt(i) == lowerCaseString.charAt(length - 1)) {
                i++;
                continue;
            } else if (lowerCaseString.charAt(i) != lowerCaseString.charAt(length - 1)) {
                return false;
            }
            return true;
        }

        return false;
    }
}
