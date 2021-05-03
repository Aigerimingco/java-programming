package day19_class_vs_object_strings;


public class StringCaseConversion {
    public static void main(String[] args) {
        String word= "CyberTek";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("CyberTEk".toLowerCase());

        word= word.toLowerCase();
        System.out.println(word+ " word");

        String company ="Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company=company.toUpperCase();
        System.out.println("company = " + company);

    }
}
