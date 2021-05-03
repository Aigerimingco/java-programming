package repl.it;


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();

        //your code here
        double burgerPrice=10.0;
        double ChickenPrice=10.0;
        double soda=2.0;
        double friesPrice=3.5;
        if(burgerPrice==10.0 || ChickenPrice==10){
            System.out.println(burgerPrice);
        }else if(soda==2.0){
            System.out.println(soda);

        }else{
            System.out.println(friesPrice);
        }





    }
}