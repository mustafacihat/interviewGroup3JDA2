package a1generateDocument.Vitaly.DSA.P1_generateDoc;

import java.util.HashMap;

public class genDocMain {
    public static void main(String[] args) {
        String givenString = "bbbb cccc dddd eeee aaaa";
        String docToGenerate = "abcccccde";
        HashMap<Character,Integer> map = new HashMap<>();
        GenerateDoc.stringToMap(map,givenString);
        System.out.println(map);
        System.out.println(GenerateDoc.canGenerateDoc(docToGenerate,map));

    }
}
