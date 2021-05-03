package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry=true;
        int bananas = 0;
        int counttoFull=3;
        while(isHungry){
            bananas++;
            System.out.println("eating a banana: \uD83C\uDF4C"+ bananas);
            if(bananas==counttoFull){
                isHungry=false;
            }
        }
        System.out.println("you ate "+bananas+ "\uD83C\uDF4C bananas");
    }
}
