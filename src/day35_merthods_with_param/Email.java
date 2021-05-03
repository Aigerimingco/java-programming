package day35_merthods_with_param;

public class Email {
    public static void main(String[] args) {
      buildEmail1("aikish20", "@yahoo.com");
      buildEmail1("Jon Ward", "@verizon.com");
    }
    public static void buildEmail1(String name, String domain){
        name=name.replace(" ","").toLowerCase();
        System.out.println("email: "+name+domain);
        System.out.println("Go to buildEmail1 method to find out my email");

    }

}
