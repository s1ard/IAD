package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class RomanMain implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new RomanMain(), 1280, 800);
    }

    public void run() {
        // Arabic to Roman tests
        SaxionApp.printLine("Test 1: translating Arabic numbers 1 - 15 to Roman");
        SaxionApp.printLine("Expected: I II III IV V VI VII VIII IX X XI XII XIII XIV XV");
        SaxionApp.print("Real    : ");
        for (int i = 1; i <= 15; i++) {
            SaxionApp.print(arabicToRoman(i) + " ");
        }
        SaxionApp.printLine();
        SaxionApp.printLine();
        int[] numbers = {444, 999, 2449, 3888, 3997, 3998, 3999};
        SaxionApp.printLine("Test 2: translating Arabic numbers 444, 999, 2449,3888, 3997, 3998, 3999 to Roman");
        SaxionApp.printLine("Expected: CDXLIV CMXCIX MMCDXLIX MMMDCCCLXXXVIII MMMCMXCVII MMMCMXCVIII MMMCMXCIX");
        SaxionApp.print("Real    : ");
        for (int num : numbers) {
            SaxionApp.print(arabicToRoman(num) + " ");
        }
        SaxionApp.printLine();

        // Roman to Arabic tests
        SaxionApp.printLine();
        SaxionApp.printLine("Test 3: translating Roman numbers I II III IV V VI VII VIII IX X XI XII XIII XIV XV to Arabic");
        String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV"};
        SaxionApp.printLine("Expected: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ");
        SaxionApp.print("Real    : ");
        for (String rom : romans) {
            SaxionApp.print(romanToArabic(rom) + " ");
        }
        SaxionApp.printLine();
        SaxionApp.printLine();
        romans = new String[]{"CDXLIV", "CMXCIX", "M", "MMCDXLIX", "MMMDCCCLXXXVIII", "MMMCMXCVII", "MMMCMXCVIII", "MMMCMXCIX"};
        SaxionApp.printLine("Test 4: translating Roman numbers CDXLIV, CMXCIX, M, MMCDXLIX, MMMDCCCLXXXVIII, MMMCMXCVII, MMMCMXCVIII, MMMCMXCIX to Arabic");
        SaxionApp.printLine("Expected: 444 999 1000 2449 3888 3997 3998 3999");
        SaxionApp.print("Real    : ");
        for (String rom : romans) {
            SaxionApp.print(romanToArabic(rom) + " ");
        }
        SaxionApp.printLine();
    }

    /**
     * Convert a number in arabic (normal) notation to a Roman notation
     *
     * @param arabic an integer num,ber to convert
     * @return the Roman representation
     */
    private String arabicToRoman(int arabic) {
        //TODO: implement

    }

    /**
     * Convert a Roman number into the (arabic) numerical value
     *
     * @param roman a number in Roman notation
     * @return the integer (arabic) value of the number
     */
    public int romanToArabic(String roman) {
        //TODO: implement

    }

}
