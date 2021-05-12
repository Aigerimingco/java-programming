package day44_custom_classses;

public class AppObjects {
    public static void main(String[] args) {
        App app1= new App();
        app1.name="US Bank";
        app1.version=5.6;
        app1.open();

        app1.version= 4;


        App app2= new App();
        app2.name= "Facebook";
        app2.version= 7.9;
        app2.open();
    }
}
