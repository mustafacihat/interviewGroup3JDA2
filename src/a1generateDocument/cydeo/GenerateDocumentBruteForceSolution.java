package a1generateDocument.cydeo;


public class GenerateDocumentBruteForceSolution {

    public static void main(String[] args) {
        String characters = "abcccdd";
        String document = "abc";

        System.out.println((generateDocumentBruteForce(characters, document)));
    }

    public static boolean generateDocumentBruteForce(String ch, String doc) {
        for (int i = 0; i < doc.length(); i++) {
            char character = doc.charAt(i);
            int documentFrequency = countCharacterFrequency(character, doc);
            int charactersFrequency = countCharacterFrequency(character, ch);
            if (documentFrequency > charactersFrequency) {
                return false;
            }
        }
        return true;
    }

    public static int countCharacterFrequency(char character, String target) {
        int frequency = 0;
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (c == character) {
                frequency += 1;
            }
        }
        return frequency;
    }

}