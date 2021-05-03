package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale=true;
        boolean freeShipping=true;
        String itemName="handbag";
        if(onSale && freeShipping){
            System.out.println("adding to cart - "+itemName);
        }else{
            System.out.println("Continue shopping for good deals on - "+itemName);
        }

        //add to cart only when it is freeshipping , onSale and itemName is "handbag"
        if(onSale && freeShipping &&itemName.equals("handbag")){
            System.out.println("adding to cart - "+itemName);
        }else{
            System.out.println("Continue shopping for good deals on - " + itemName);
        }


    }
}
