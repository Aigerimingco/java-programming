package day31_arrays;

import javax.lang.model.SourceVersion;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char each : letters) {
            System.out.print(each + " ");
        }
        System.out.println();
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("itemArray.length " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitsStr = "";
        for (String each : fruits) {
            System.out.print("-"+each);
            fruitsStr += each + "-";
        }
        System.out.println("\nfruitsStr = " + fruitsStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("|", languages));
        String joinedLanguages = String.join(" <> ", languages);
        System.out.println(joinedLanguages);
    }
}
