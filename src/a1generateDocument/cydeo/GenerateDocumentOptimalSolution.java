package a1generateDocument.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GenerateDocumentOptimalSolution {

    public static void main(String[] args) {
        String characters = "veDJaCyd vaeo perelo xw!xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String document = "Cydeo Java Developer!";

        long start = System.currentTimeMillis();
        System.out.println((generateDocumentOptimal(characters, document)));
        long end = System.currentTimeMillis();
        System.out.println("execution time : " + (end-start) + " ms");
    }

    public static boolean generateDocumentOptimal(String characters, String document) {

        // O(n + m) time | O(c) space - where n is the number of characters, m is
        // the length of the document, and c is the number of unique characters in the
        // characters string

        if (document.equals("")) return true;
        if (characters.length() < document.length()) return false;


        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        for (int i = 0; i < characters.length(); i++) {
            char character = characters.charAt(i);

//            characterCounts.putIfAbsent(character,0);
//            characterCounts.put(character,characterCounts.get(character)+1);
//            if (characterCounts.containsKey(character)) {
//                characterCounts.put(character, characterCounts.get(character) + 1);
//            } else {
//                characterCounts.put(character, 1);
//            }
            characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
        }
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            if (!characterCounts.containsKey(character) || characterCounts.get(character) == 0){
                return false;
            }
            characterCounts.put(character, characterCounts.get(character) - 1);
        }
        return true;


    }

}
