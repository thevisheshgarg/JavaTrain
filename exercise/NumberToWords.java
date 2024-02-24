/**
 * till 6 digits
 
	i/p: 34567
	o/p: Thirty four Thousand Five Hunderad and Sixty Seven Only
 
	i/p: 345
	o/p: Three Hundred and Fourty Five only
	
	@author vishe
 */

package com.exercise;

public class NumberToWords {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int number = 3445678; 

        String result = convertToWords(number);
        System.out.println("In words: " + result);
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }
        return convert(number);
    }

    private static String convert(int number) {
        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + " " + convert(number % 10);
        } else if (number < 1000) {
            return units[number / 100] + " Hundred " + convert(number % 100);
        } else if (number < 100000) {
            return convert(number / 1000) + " Thousand " + convert(number % 1000);
        } else if (number < 10000000) {
            return convert(number / 100000) + " Lakh " + convert(number % 100000);
        }
        return "Number out of range";
    }
}
