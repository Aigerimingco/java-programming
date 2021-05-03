package day20_string_manipulation;

public class ContainsStringMethod {
    public static void main(String[] args) {
        String word = "Java is an interesting language";
        System.out.println(word.contains("an"));
        System.out.println(word.contains("int"));
        System.out.println(word.contains("IS"));
        System.out.println(word.contains("v"));
        System.out.println(word.contains("s an"));
        System.out.println(word.contains(" "));

        String etsyTitle = "wooden spoon | Etsy";
        if (etsyTitle.contains("|")) {
            System.out.println("title pass");
        }

        String firstName = "Aigerim";
        if (firstName.toLowerCase().contains("a") && firstName.contains("e")) {
            System.out.println("both are content ");
        }else{
            System.out.println("incorrect");
        }

    }
}
