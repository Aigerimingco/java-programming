package day29_nestedloops_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num=10;//single variable
        int[] nums= new int[3]; //array variable
        nums[0]=5;
        nums[1]=10;
        nums[2]=7;
        System.out.print(nums[0]+"\t");
        System.out.print(nums[1]+"\t");
        System.out.println(nums[2]+"\t");

        int i=0;
        System.out.println(nums[i]);

        System.out.println("number of elements"+nums.length);
        int len= nums.length;
        System.out.println("len = " + len);

        nums[0]=100;
        nums[1]=300;
        nums[2]=nums[1];
        System.out.println("nums[0] = "+ nums[0]);
        System.out.println("nums[1] = "+ nums[1]);
        System.out.println("nums[2] = "+ nums[2]);
    }
}
