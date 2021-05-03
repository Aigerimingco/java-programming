package day35_merthods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        count(7);
        count(15);
        int num=999;
        count(num);
        String word="wooden spoon";
        count(word.length());
        int year=1986;

        printAge(year);
    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age=2021-year;
        System.out.println("Birth year "+year+". Age doesn't matter");
        System.out.println("Scratch to find out my age");
        System.out.println("#########################");
    }
}