package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i=1;
        System.out.println("i = "+1);
        i++;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        i++;
        i++;
        i++;
        i++;
        System.out.println("i = " + i);
        int linesofCode=15;
        System.out.println("lines of code = "+linesofCode);
        linesofCode++;
        ++linesofCode;
        linesofCode+=1;
        linesofCode=linesofCode+1;
        System.out.println("linesofCode = " + linesofCode);
        //type 4 differen ways
        // odd decreasing by 1
        linesofCode--;
        --linesofCode;
        linesofCode-=1;
        linesofCode=linesofCode-1;
        System.out.println("linesofCode = " + linesofCode);
        char letter='a';
        System.out.println("letter = "+letter);
        letter++;
        letter++;
        letter++;
        letter++;
        letter--;
        letter--;
        letter--;
        letter--;
        letter--;
        letter--;
        letter--;
        System.out.println("letter = " + letter);
        long a=30l;
        long b=(short)a;
        System.out.println(b);
     //   float a=100.8888;
     //   short b=(byte)a;
     //   byte c=(byte)b;
     //   System.out.println(c);
       // long a=3_000l;
//double b=(float) a;
   //     System.out.println(b);

    }
}
