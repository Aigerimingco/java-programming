package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("I"));
        System.out.println(word.startsWith("intellij"));
        System.out.println("java".startsWith("j"));
        System.out.println(word.endsWith("ea"));
        System.out.println(word.endsWith("idea"));

        String firstName = "Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("married women");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("single women");
        } else {
            System.out.println("normal name");
        }

        String url = "alibaba.com";
        if (url.endsWith(".com")) {
            System.out.println("commercial website");
        }
        int z=11;
        switch(z){
            case 11:
                System.out.println("m");
            default:
                System.out.println("l");
        }
    }
}
