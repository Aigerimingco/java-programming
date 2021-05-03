package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection='y';
        boolean answer;
        String result;
        if(selection=='y'){
            System.out.println("your file will be deleted");
            answer=true;
            result="deleted";
        }else{
            System.out.println("file deletion cancelled.");
            answer=false;
            result="not deleted";
        }
        System.out.println("did file get deleted? -" + answer);
        System.out.println("did file get deleted? -" + result);
    }
}
