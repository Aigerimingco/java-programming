package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = "+ (true || true));
        System.out.println("true || false = "+ (true || false));
        System.out.println("false || true = "+ (false || true));
        System.out.println("false || false = "+ (false || false));


        int apples=5;
        int kiwis=10;
        System.out.println(apples>1 || kiwis<20);
        System.out.println(apples>1 || kiwis==20);
        System.out.println(apples>10 ||kiwis==10);
        System.out.println(apples !=5 || kiwis!=10);
        if(apples>3 || kiwis>4){
            System.out.println("no need to buy any fruit today");
        }else{
            System.out.println("need to get some fruit");
        }
    }

}
