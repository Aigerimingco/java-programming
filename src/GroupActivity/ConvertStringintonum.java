package GroupActivity;

public class ConvertStringintonum {
    public static void main(String[] args) {
        String total="123abcd12";
        String num="";
        for (int i = 0; i < total.length(); i++) {
            if(Character.isDigit(total.charAt(i))){
                num+=total.charAt(i);

            }

        }
        System.out.println(num);
        int count=Integer.parseInt(num);
        System.out.println(count);


       // int count=Integer.parseInt(total);
      //  System.out.println(count);
    }
}
