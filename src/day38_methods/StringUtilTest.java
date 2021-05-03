package day38_methods;
import static day38_methods.StringUtils.*;
public class StringUtilTest {

    public static void main(String[] args) {

        String userName = "";

        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail: Username can not be null or empty");

            System.out.println("civic = "+StringUtils.isPalindrome("civic"));
            System.out.println("kayak = "+StringUtils.isPalindrome("kayak"));
            System.out.println("cybertek "+isPalindrome("cybertek"));
            System.out.println(reverse("aigerim"));
        }
    }


    }

