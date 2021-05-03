package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 45, 78, 67, 34};
        for (int each : data) {
            System.out.println(each);
        }
        for (int i = 0; i < data.length; i += 2) {
            System.out.println(data[i]);
        }
        System.out.println(data[data.length - 1]);

        for (int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(", data[idx] = " + data[idx]);
        }
    }
}
