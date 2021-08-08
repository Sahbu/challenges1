package com.technoElevate.challenges;

import java.util.Scanner;

/*
 Challenge5:
Write a method called printNumberInWord.The method has one parameter number which is the whole number. 
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER"
 if the int parameter number is 0, 1, 2, .... 9 or 
 otherfor any other number including negative numbers.
  You can use if-else statement or switch statement whatever is easier for you.
 */
public class Challenge5 {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a Number and print in String word Form");
        int number = sc.nextInt();
        printNumberIntWord(number);
        printNumberInWord1(number);
    }
    
    private static void printNumberIntWord(int number)
    {
        String numberStr = null;
        if (0 == number) {
            numberStr = "ZERO";
        } else if (1 == number) {
            numberStr = "ONE";
        } else if (2 == number) {
            numberStr = "TWO";
        } else if (3 == number) {
            numberStr = "THREE";
        } else if (4 == number) {
            numberStr = "FOUR";
        } else if (5 == number) {
            numberStr = "FIVE";
        } else if (6 == number) {
            numberStr = "SEX";
        } else if (7 == number) {
            numberStr = "SEVEN";
        } else if (8 == number) {
            numberStr = "EIGHT";
        } else if (9 == number) {
            numberStr = "NINE";
        } else {
            numberStr = "OTHER";
        }
        System.out.println("By using Nested-if statement: " + numberStr);
    }
    
    private static void printNumberInWord1(int number)
    {
        String numberStr = null;
        switch (number) {
            case 0:  numberStr = "ZERO";  break;
            case 1:  numberStr = "ONE";   break;
            case 2:  numberStr = "TWO";   break;
            case 3:  numberStr = "THREE"; break;
            case 4:  numberStr = "FOUR";  break;
            case 5:  numberStr = "FIVE";  break;
            case 6:  numberStr = "SEX";   break;
            case 7:  numberStr = "SEVEN"; break;
            case 8:  numberStr = "EIGHT"; break;
            case 9:  numberStr = "NINE";  break;
            default: numberStr = "OTHER"; break;
        }
        System.out.println("By Using Switch statement: "+numberStr);
    
    }
}

