package day29_nestedloops_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "Hello World";
        for (int i = 0; i < word.length(); i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(word.charAt(k));
            }
            System.out.println();
        }

//reverse
        for (int i = 0; i < word.length(); i++) {
            for (int k = i; k < word.length(); k++) {
                System.out.print(word.charAt(k));
            }
            System.out.println();
        }


            }
        }

