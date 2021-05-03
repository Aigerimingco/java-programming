package GroupActivity;

public class MergeStrings {
    public static void main(String[] args) {
        String one="abcdef";
        String two="zzz";
        for (int i = 0, j=0; i < one.length() || j<two.length(); i++, j++) {
             {
                System.out.print(one.charAt(i)+"" +two.charAt(j));
                break;

            }

        }




    }
}
