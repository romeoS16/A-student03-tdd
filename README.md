# TDD-Übung – Gruppe A (ohne KI)

Dieses Repository gehört **dir** und wird im Rahmen einer Bachelorarbeits-Studie verwendet.  
Du bearbeitest hier drei kleine Programmieraufgaben mit **Test-Driven Development (TDD)**.

Bitte arbeite nach dem Zyklus **Red → Green → Refactor** und verwende **keine KI-Tools** (z. B. ChatGPT, Copilot) für diese Aufgaben.

---

## 1. Technisches Setup

- Projekt-Typ: **Maven**, Java (z. B. **JDK 17**)
- Testframework: **JUnit** (wird über Maven eingebunden)
- Tests ausführen:
  - in IntelliJ: Rechtsklick auf die Testklasse → `Run '…Test'`
  - oder im Terminal: mvn test

---

## 2. Allgemeine Arbeitsweise (TDD)

Für alle Aufgaben gilt derselbe Ablauf:

(1) **RED** – Test schreiben
- Schreibe zuerst einen neuen Test (z. B. für einen einfachen Fall).
- Führe die Tests aus – der neue Test soll fehlschlagen.

(2) **GREEN** – minimalen Code implementieren
- Implementiere nur so viel Code, dass der neue Test grün wird.
- Führe die Tests erneut aus.

(3) **REFACTOR** – Code aufräumen
- Verbessere bei Bedarf deinen Code (Lesbarkeit, Duplikate, bessere Namen …),
ohne das Verhalten zu ändern.
- Alle Tests müssen danach weiterhin grün sein.

(4) Weitere Tests ergänzen
- Füge neue Tests hinzu und wiederhole den Zyklus.  

---

## 3. Aufgabe 1 – FizzBuzz

Implementieren Sie in der Klasse [FizzBuzz](src/main/java/de/ba/experiment/fizzbuzz/FizzBuzz.java) die Methode

```java
public static String[] fizzBuzz(int n){}
```  

Die Methode soll ein String-Array der Länge n zurückgeben. Für jede Zahl von 1 bis n gilt:
- "Fizz" bei Vielfachen von 3
- "Buzz" bei Vielfachen von 5
- "FizzBuzz" bei Vielfachen von 3 und 5
- sonst die Zahl selbst als String

Beispiel:
- fizzBuzz(5) → ["1", "2", "Fizz", "4", "Buzz"]

Für n <= 0 kann ein leeres String-Array zurückgegeben werden (oder alternativ eine IllegalArgumentException geworfen werden).  

Schreiben Sie Tests in der [FizzBuzzTest](src/test/java/de/ba/experiment/fizzbuzz/FizzBuzzTest.java) Klasse.

---

## 4. Aufgabe 2 – Palindrom  

Implementieren Sie in der Klasse [PalindromeChecker](src/main/java/de/ba/experiment/palindrome/PalindromeChecker.java) die Methode

```java
public static boolean isPalindrome(String text){}
```

Die Methode soll true zurückgeben, wenn text ein Palindrom ist, sonst false.

Für diese Aufgabe gilt:
- Ein Palindrom liest sich vorwärts und rückwärts gleich.
- Groß-/Kleinschreibung wird ignoriert.
- Leerzeichen werden ignoriert.
- Alle anderen Zeichen (Buchstaben, Ziffern, Satzzeichen) werden normal berücksichtigt.
- Ein leerer String ("") gilt als Palindrom.
- null gilt nicht als Palindrom (false).

Schreiben Sie Tests in der [PalindromeCheckerTest](src/test/java/de/ba/experiment/palindrome/PalindromeCheckerTest.java) Klasse.

---

## 5. Aufgabe 3 – PasswordStrengthEvaluator  

Implementieren Sie in der Klasse [PasswordStrengthEvaluator](src/main/java/de/ba/experiment/password/PasswordStrengthEvaluator.java) die Methode

```java
public static String evaluateStrength(String password){}
```

Die Methode soll entweder "WEAK", "MEDIUM" oder "STRONG" als String zurückgeben.

**Für diese Aufgabe gilt:**  
(1) Ungültiges Passwort
- Wenn das passwort null, leer oder ein Leerzeichen enthält, soll direkt der String "WEAK" zurückgegeben werden.

(2) Basisanforderung an die Länge
- Wenn die Länge < 6 entspricht, soll ebenfalls der String "WEAK" zurückgegeben werden.

(3) Kriterien für Stärke
Es werden folgende Eigenschaften geprüft:
- hat mindestens einen Kleinbuchstaben [a-z]
- hat mindestens einen Großbuchstaben [A-Z]
- hat mindestens eine Ziffer [0-9]
- hat mindestens ein Sonderzeichen (nicht Buchstabe und nicht Ziffer)
- hat Länge >= 10

Für jede erfüllte Eigenschaft gibt es 1 Punkt.

(4) Auswertung
- Punkte <= 2  -> "WEAK"
- Punkte == 3  -> "MEDIUM"
- Punkte >= 4  -> "STRONG"

(5) Beispiele
- ab1 -> "WEAK"
- Abc123 -> "MEDIUM"
- aaaAAAbbb!223j -> "STRONG"


Schreiben Sie Tests in der [PasswordStrengthEvaluatorTest](src/test/java/de/ba/experiment/password/PasswordStrengthEvaluatorTest.java) Klasse.


---

## 6. Rahmenbedingungen  
- Verwende keine KI-Tools (z. B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgaben.
- Halte dich an die vorgegebenen Methodensignaturen.
- Schreibe konsequent Tests zuerst und lass dich von ihnen durch die Implementierung führen.
- Committe und pushe regelmäßig.
