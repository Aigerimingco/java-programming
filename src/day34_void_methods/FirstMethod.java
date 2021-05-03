package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();
        displayMessage();
        displayMessage();
        differentdisplay();
        Icallitagain();
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "-");
            displayMessage();
        }
    }

    public static void displayMessage() {
        System.out.println("Hello B22 Friends");
    }

    public static void differentdisplay() {
        System.out.println("Hello world");
    }

    public static void Icallitagain() {
        System.out.println("It's nice outside");
    }
}