package day15_logicalops_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade='b';
        if(grade=='A' || grade=='a' || grade=='B' || grade=='b' || grade=='C' || grade=='c'){
            System.out.println("Pass the exam. With grade - "+grade);
        }else if(grade=='D'|| grade=='d'){
            System.out.println("qualify for retake. Grade - "+grade);
        }else if(grade=='E' || grade=='e'){
            System.out.println("Fail. Grade - "+grade);
        } else{
            System.out.println("invalid grade "+grade);
        }
    }
}
