package com.alejandro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        returnTotalAnagrams(word);
        scanner.close();
    }   

    public static int returnTotalAnagrams(String word) {
        if (!word.isEmpty() && word != null) {
            
            List<List<String>> words = new ArrayList<>();

            for (int i = 0; i < word.length(); i++) {
                words.add(createWord((i + 1), word));
            }

            List<String> anagrams = new ArrayList<>();
            for (List<String> l : words) {
                anagrams.addAll(findAnagrams(l));
            }

            if (anagrams.size() > 1) {
                System.out.println(anagrams.size() / 2);
                return anagrams.size() / 2;
            } else {
                System.out.println(anagrams.size());
                return anagrams.size();
            }
        }

        return 0;
    }

    private static int sum(String s) {
        int characteres = 0;
        for (char character : s.toCharArray()) {
            characteres = characteres + character;
        }

        return characteres;
    }

    private static List<String> findAnagrams(List<String> list) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int firstSum = sum(list.get(i));
            int secondSum = 0;

            for (int x = 0; x < list.size(); x++) {
                if (x != i) {
                    secondSum = sum(list.get(x));

                    if (firstSum == secondSum) {
                        result.add(list.get(i));
                    }
                }
            }
        }
        return result;
    }

    private static List<String> createWord(int position, String word) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            int character = i + position;

            if (character <= word.length()) {
                String sub = word.substring(i, character);
                if (sub.length() > 0) result.add(sub);
            }
        }

        return result;
    }
}
