package day42_arraylist;
import java.util.*;
import java.util.concurrent.Callable;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters= new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = "+letters);

        System.out.println(Collections.frequency(letters, 'a'));
        int vcount=Collections.frequency(letters,'v');
        System.out.println("vcount = " + vcount);

        System.out.println("Max char = "+Collections.max(letters));
        System.out.println("Min char = "+Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters,'a','u');
        System.out.println("after replace all= "+letters);
        Collections.sort(letters);
        System.out.println("sorted  = " + letters);

        List<Integer> nums= Arrays.asList(34,65,12, 8,12,98,12, 53,2,12,-9,0);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = "+nums);
        
        int max= Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = "+max);
        System.out.println("min = " + min);
        
        int countoftwelve= Collections.frequency(nums, 12);
        System.out.println("count of 12 = " + countoftwelve);
        
        int countofone= Collections.frequency(nums,1);
        System.out.println("countofone = " + countofone);

        Collections.replaceAll(nums, 12, 50);
        System.out.println("replace all = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);
        Collections.shuffle(nums);
        System.out.println("after shuffle = " + nums);


            }
        }




