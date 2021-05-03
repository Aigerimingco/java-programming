package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry=true;
        if(isHungry) {
            System.out.println("I am hungry I will get something to eat\nThen code java");
        }else{
            System.out.println("I am not hungry. Let's keep coding java");
        }
        boolean isRemoteJob=false;
        if(!isRemoteJob) {
            System.out.println("Sorry i am not interested");

        }else{
            System.out.println("sure I am interested, what is the interview process?");

        }
    }
}
