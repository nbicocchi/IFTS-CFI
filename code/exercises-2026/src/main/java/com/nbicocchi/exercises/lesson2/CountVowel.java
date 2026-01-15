package com.nbicocchi.exercises.lesson2;

public class CountVowel {
    public static int countVowel(String s) {
        int n = 0;
        String sLower = s.toLowerCase();
        for (int i = 0; i < sLower.length(); i++) {
            if ((sLower.charAt(i) == 'a') ||
                    (sLower.charAt(i) == 'e') ||
                    (sLower.charAt(i) == 'i') ||
                    (sLower.charAt(i) == 'o') ||
                    (sLower.charAt(i) == 'u')){
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(countVowel("CIAO"));
    }
    

}
