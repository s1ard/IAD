package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class NumbersMain implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new NumbersMain(), 1280, 800);
    }

    public void run() {
        printTest("Reverse number of 12345", 54321, reverse(12345));
        printTest("Reverse number of 884135", 531488, reverse(884135));

        printTest("Palindrome test of 1234321", true, isPalindrome(1234321));
        printTest("Palindrome test of 1244321", false, isPalindrome(1244321));

        printTest("Prime test of 17", true, isPrime(17));
        printTest("Prime test of 18", false, isPrime(18));
        printTest("Prime test of 876543211", true, isPrime(876543211));

        SaxionApp.printLine("Prime numbers < 100");
        SaxionApp.printLine("Expected: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97");
        SaxionApp.print("Actual  : ");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                SaxionApp.print(i + " ");
            }
        }
        SaxionApp.printLine();

    }

    private void printTest(String title, Object expected, Object actual) {
        SaxionApp.printLine(title);
        SaxionApp.printLine("Expected: " + expected);
        SaxionApp.printLine("Actual  : " + actual);
        SaxionApp.printLine();
    }

    /**
     * Reverses the digits of a given number.
     *
     * @param number the number (int) to reverse
     * @return the reversed number as an integer
     */
    public int reverse(int number) {
        //TODO: implement

    }

    /**
     * Checks if a given number is a 'palindrome' — its digits in reverse order form the same number.
     *
     * @param number the number (int) to check
     * @return true if the number is a palindrom, false otherwise
     */
    public boolean isPalindrome(int number) {
        //TODO: implement

    }

    /**
     * Checks if a given number is 'prime' — a number divisible only by 1 and itself.
     *
     * @param number the number (int) to check
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int number) {
        //TODO: implement

    }
}
