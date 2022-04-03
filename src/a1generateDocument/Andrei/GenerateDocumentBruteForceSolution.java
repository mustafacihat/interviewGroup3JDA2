package a1generateDocument.Andrei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateDocumentBruteForceSolution {

    public static void main(String[] args) {
        System.out.println(genDocs("!veDJaCyd vaeo perelo xw", "Cydeo Java Developer!"));
    }

    public static boolean genDocs(String characters, String document){
        List<String> chS = new ArrayList<>(Arrays.asList(characters.split("")));
        for (String s : document.split("")) {
            if (chS.contains(s)) chS.remove(s);
            else return false;
        }
        return true;
    }
}
