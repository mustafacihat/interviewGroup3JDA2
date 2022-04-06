package a1generateDocument.bahrom;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
    public static void main(String[] args) {
//        String characters = "!veDJaCyd vaeo perelo xw";
//        String document = "Cydeo Java Developer!";
//        System.out.println(genDoc2(characters, document));
        System.out.println(genDoc2("!veDJaCyd vaeo perelo xw", "Cydeo Java Developer!"));
    }

    public static boolean genDoc2(String ch, String doc) {

        Map<Character, Integer> hashMap = new HashMap<>();
        int count;

        for (int i = 0; i < ch.length(); i++) {
            if (hashMap.containsKey(ch.charAt(i))) {
                count = hashMap.get(ch.charAt(i));
                count++;
                hashMap.replace(ch.charAt(i), count);
            } else {
                hashMap.put(ch.charAt(i), 1);
            }
        }
        for (int j = 0; j < doc.length(); j++) {
            if (!hashMap.containsKey(doc.charAt(j)) || hashMap.get(doc.charAt(j)) == 0) {
                return false;
            } else {
                count = hashMap.get(doc.charAt(j));
                count--;
                hashMap.put(doc.charAt(j), count);
            }
        }
        return true;
    }
}
