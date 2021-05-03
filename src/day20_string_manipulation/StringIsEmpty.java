package day20_string_manipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringIsEmpty {
    public static void main(String[] args) {
        String word="";
        System.out.println(word.isEmpty());
        System.out.println(word.length()==0);
        System.out.println(word.equals(""));

        String veggie="tomatoes";
        if(!veggie.isEmpty()){
            System.out.println("we have " +veggie);
        }
        String word2="manty";
        System.out.println(word2.isEmpty());
    }
}
