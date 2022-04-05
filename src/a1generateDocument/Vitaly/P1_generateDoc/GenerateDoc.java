package a1generateDocument.Vitaly.P1_generateDoc;



import java.util.HashMap;



public class GenerateDoc {

    public static void stringToMap (HashMap<Character,Integer> map, String givenString){
        char [] charArr = givenString.toCharArray();
        //+1 for every character in the map
        for (int i = 0; i< charArr.length; i++){
            if(map.containsKey(charArr[i])) map.put(charArr[i],map.get(charArr[i])+1);
            else map.put(charArr[i],1);
        }
    }
    public static boolean canGenerateDoc (String document, HashMap<Character,Integer> map){
        if (document.equals("")) return true;
        else {
            char[] charArr = document.toCharArray();
            for (Character each : charArr){
                if (!map.containsKey(each)||map.get(each)==0) return false;
                map.put(each, map.get(each)-1);
            }
        }
        return true;
    }
}

