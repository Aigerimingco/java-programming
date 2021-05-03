package day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "209-234-1234";

        String[] student2 = {"1234", "Aigerim", "Ingco", "batch22", "352-229-0170"};
        System.out.println("student1 ID=" + student1[0]);
        System.out.println("student1 firstname=" + student1[1]);
        System.out.println("student data lenth:" + student1.length);
        System.out.println("student2 ID=" + student2[0]);
        System.out.println("student2 firstname = " + student2[1]);

        if (student1.length == 5) {
            System.out.println("data array has correct length");
        } else {
            System.out.println("data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }
        System.out.println(student1[1].toUpperCase()+" "+student1[2].toUpperCase());
    }
}
