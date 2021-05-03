package Practivce_04_14_2021;

public class SwitchWithArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        for (int each : arr) {
            switch (each) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("Three");

            }
        }
    }
}
