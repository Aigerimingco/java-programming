package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDS = {12345, 123456, 12347, 12348, 12349, 12350};
        System.out.println("-----FIND THE INDEX OF 'Gloves' in items array-----");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println("Index of Gloves= " + i);
                break;
            }
        }
        System.out.println("-----SET BOOLERAN TO TRUE IF FIRST 'iPad' is found-----");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equals("Shoes")) {
                iPadExists = true;
                break;
            }

        }
        System.out.println("iPadExists = " + iPadExists);


        System.out.println("-----Print a report of each shopping item-----");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "\t - $" + prices[i] + "\t - #" + itemIDS[i]);

        }
        System.out.println("-----Look for Jacket in items and print all details-----");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Jacket")) {
                System.out.println(items[i] + "\t - $" + prices[i] + "\t - #" + itemIDS[i]);
                break;
            }
        }
    }
}
