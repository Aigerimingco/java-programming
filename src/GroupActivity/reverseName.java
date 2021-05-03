package GroupActivity;

public class reverseName {
    public static void main(String[] args) {
        System.out.println(Reverse("Aigerim"));
    }

    public static String Reverse(String name) {
        String str = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            str += name.charAt(i);


        }

        return str;
    }
}