
package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location="Honolulu";
        double Salary =120_000.0;
        boolean isremote =true, Isbenefits=true;
        if(location.equals("Honolulu") && Salary >=120_000.0 && isremote && Isbenefits){
            System.out.println("accept this offer");
        }else{
            System.out.println("let's consider another offer or negotiate");
        }


    }
}
