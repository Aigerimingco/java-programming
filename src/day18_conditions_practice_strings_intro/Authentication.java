package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int explast4SSN=4098;
        int exppinCode=1111;

        int last4SSN=4198;
        int pinCode=1191;
        if(last4SSN==explast4SSN && pinCode==exppinCode){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication unsuccessful");
            if(last4SSN != explast4SSN){
                System.out.println("Last 4 SSN number is incorrect");
            }if(exppinCode!= pinCode){
                System.out.println("Pin Code is incorrect");
            }
        }
    }
}
