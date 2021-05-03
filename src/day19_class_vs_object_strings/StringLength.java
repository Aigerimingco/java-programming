package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String password="kanday jakshy";
        System.out.println(password.length());
        
        String firstName= "Aigerim";
        int count=firstName.length();
        System.out.println("count = " + count);

        String password1="abcd123";
        if(password1.length() >=6){
            System.out.println("valid amazon password");
        }else{
            System.out.println("passwords must be at least 6 characters");
        }

        String countryCode="usa";
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println(countryCode);
        }
    }
}
