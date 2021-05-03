package day32_arrays_split;
import java.util.Arrays;
public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDS = {12345, 123456, 12347, 12348, 12349, 12350};
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDS));
        System.out.println("Find and print details of most expensive item");


        double maxPrice = prices[0];
        int itemOfMaxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                itemOfMaxPrice=i;
            }
        }
            System.out.println("most expensive item: "+maxPrice);
        System.out.println("itemOfMaxPrice = " + itemOfMaxPrice);
        System.out.println(items[itemOfMaxPrice]+ " -$"+prices[itemOfMaxPrice]+"- #"+itemIDS[itemOfMaxPrice]);

            //      break;
        }
    }


