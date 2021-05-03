package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds=0;
        while(seconds<=117){
            System.out.println("Watching YouTube video: \uD83D\uDC08 "+ seconds);
            seconds++;
            Thread.sleep(10);
        }
        System.out.println("Finished watching cat video, lets start another one");

       // int count=5;
       // while(count>=0){
       //     System.out.println("count= "+count);
        //    ++count;
       // }
        int unreadSMS=10;
        while(unreadSMS>0){
            System.out.println("message read \uD83D\uDC8C "+ unreadSMS);
            unreadSMS--;
        }
        System.out.println("zero unread messages \uD83D\uDE09 ");
    }
}
