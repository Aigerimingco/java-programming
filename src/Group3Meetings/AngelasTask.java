package Group3Meetings;

public class AngelasTask {
    public static void main(String[] args) {
        //double p=13.142;
        // int whole= p<20 ? 20 :10;
        int num = 2;
        boolean b = true;
        switch (num) {
            case 0:
                b = false;
            case 1:
                System.out.println(1);
                case2:
                if (b) {
                    System.out.println(2);
                } else {
                    b = false;
                }
                case3:
                if (b) {
                    System.out.println(3);
                    b = false;
                } else {
                    break;
                }
            case 4:
                System.out.println(4);
        }
    }
}