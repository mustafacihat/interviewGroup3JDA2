package a1generateDocument.math;

public class WordGenerator {
    public static void main(String[] args) {
        String characters = "!veDJaCyd vaeo perelo xw";
        String document = "Cydeo Java Developer Jun!";

        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter first characters");
        String characters = input.next();
        System.out.println("Please enter document");
        String document = input.next();*/

        generateWithString(characters,document);
        //generateRecursive(characters,document);
        //generateWithMyHashMap(characters,document);
        //System.out.println(generateDocumentWithHashMap(characters, document));
    }

    private static void generateWithString(String characters, String document) {

        String result = "we can generate this document with these characters";

        for (int i = 0; i < document.length(); i++) {

            if(characters.indexOf(document.charAt(i)) != -1) {
                characters = characters.replaceFirst("" + document.charAt(i), "");
            } else {
                result = "we can`t genarate this string with these characters";
                break;
            }
        }

        System.out.println(result);
    }

}
