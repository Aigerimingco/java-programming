package OfficeHours.Practice_03_02_2021;

public class quiz1Questions {
    public static void main(String[] args) {
        int students=50; //teachers;
        students=100;
        System.out.println(students);
        int num1=50;
        int num2=200;
        num2=num1;
        System.out.println(num1);
        System.out.println(num2);

        long a=30l;
        long b=(short)a;
        System.out.println(b);
 float a1= 100.987_6543f;
 short b1=(byte)a1;
 byte c=(byte)b1;
        System.out.println(c);
        long a2=3_000l;
        double b2=(float)a2;
        System.out.println(b2);

        System.out.println("Result A"+0+1);
        System.out.println("Result B"+(1)+(2));

        int x=10;
        int y=x++;
        System.out.println(y++ + " " + x++ + ""+y);
         int score =0;
         if(score==0){
             score +=50;
         }
         if(score !=0){
             score +=50;
         }
        System.out.println(score);
    }
}
