package com.example;

public class App {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        // Remove spaces and convert to lowercase for accurate checking
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }
}
