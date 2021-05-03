package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
addNumbers(5,6,1,8,9,4,12,34,89,100,56,78,34,45,12345);
    }
    public static void addNumbers(int... nums){
        int sum=0;
        for(int n:nums){
            sum+=n;

        }
        System.out.println("sum= "+sum);
    }
}
