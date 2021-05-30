package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class CustomerObjects {
    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println("cs1 = " + cs1);

        Customer cs2 = new Customer("Mike", 2);
        System.out.println("cs2 = " + cs2);

        Customer cs3= new Customer("John Ward",4873);
        System.out.println("cs3 = " + cs3);
        
        //Array of customers
        Customer [] todaysCustomers={cs1,cs2,cs3, new Customer("Bashir",0)};
        
        //arraylist of customer objects
        List<Customer> customerArrayList= new ArrayList<>();
        customerArrayList.add(cs1);
        customerArrayList.add(cs2);
        customerArrayList.add(cs3);
        customerArrayList.add(new Customer("BOB",449));
        customerArrayList.add(new Customer("Aigerim", 34));

        // print info of first customer object in array and arraylist
        System.out.println(todaysCustomers[0].toString());
        System.out.println("customerArrayList = " + customerArrayList.get(0).toString());

        System.out.println(customerArrayList);

        System.out.println("----FOR LOOP----");
        for(int i=0; i<customerArrayList.size(); i++){
            System.out.println(customerArrayList.get(i));

        }
        System.out.println("----FOR EACH LOOP----");
        for (Customer eachCustomer : customerArrayList) {
            System.out.println(eachCustomer);

            
        }

        //print only names of customers

        System.out.println("----names of customers----");
        customerArrayList.forEach(each-> System.out.println(each.getName()));
        for (Customer eachCustomer : customerArrayList) {
            System.out.println(eachCustomer.getName());

        }
        }



    
}
