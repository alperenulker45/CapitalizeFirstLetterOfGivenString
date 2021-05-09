package _3_;

import java.util.Scanner;

public class CapitalizeFirstLetters {
    public static void main(String[] args) {
        //Write a Java program to capitalize the first letter of each word in a sentence

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = sc.nextLine();
        System.out.println(capitalizeFirstLetters(sentence));
    }

    public static String capitalizeFirstLetters (String s) {
        String [] arr = s.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String y : arr) {
            Character first = y.charAt(0);
            if (Character.isLowerCase(first))
                first=Character.toUpperCase(first);

            capitalized.append(first).append(y.substring(1)).append(" ");
        }
        return capitalized.toString();
    }
}
