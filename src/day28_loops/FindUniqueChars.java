package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "aigerIm";
        String unique = "";
        for (int i = 0; i < word.length(); i++) {
            if (!unique.contains(word.charAt(i) + "")) {
                unique += word.charAt(i);

            }
        }
        System.out.print(unique);
    }
}