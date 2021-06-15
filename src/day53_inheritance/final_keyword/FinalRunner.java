package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        System.out.println(TestData.ADMIN_PASSWORD);
        //TestData.ADMIN_USERNAME="change";
        final int SSN= 436577899;
       // SSN=1234566777; ERROR, variable is final

    }
}
