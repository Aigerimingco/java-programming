package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int apples=0;
        do{
          System.out.println("apples "+apples);
            apples+=300;
        }while(apples<=1000);{
            System.out.println("apples = " + apples);
        }
    }
}
