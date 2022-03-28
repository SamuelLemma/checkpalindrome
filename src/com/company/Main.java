package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the string:"));
        String s1 = sc.nextLine();
        String s2= new
                StringBuilder(s1).reverse().toString();

        if (s1.equals(s2)){
            System.out.println("The string is palindrome.");

        }else {
            System.out.println("The string is not palindrome");
        }
    }
}
