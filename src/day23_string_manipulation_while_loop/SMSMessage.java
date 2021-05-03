package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message= "Sender: [Saim] from number <352229-0170>{hello, lets code java}";
        int start= message.indexOf("[");
        int end=message.indexOf("]");
        System.out.println(message.substring(start +1, end));
        String sender=(message.substring(start+1, end));

        System.out.println("sender ="+sender);
        
        String mobile=message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text= message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Fikret ".trim());

        String word="   s q l  ";
        System.out.println(word.trim());
        word=word.trim();
        System.out.println(word);

        word=word.replace(" ","");
        System.out.println(word);


    }
}
