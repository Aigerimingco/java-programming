package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city="Bishkek";
        System.out.println(city.equals("Bishkek"));
        System.out.println(city.equals("bishkek"));
        System.out.println(city.equals("Bishkek "));


        System.out.println(city.equalsIgnoreCase("Bishkek"));
        System.out.println(city.equalsIgnoreCase("bishkek"));
        System.out.println(city.equalsIgnoreCase("BISHKEK"));
        System.out.println(city.equalsIgnoreCase("BisHKek"));
        System.out.println(city.equalsIgnoreCase("Biishkek"));
        System.out.println(city.equalsIgnoreCase("Bish kek"));

        if(city.equals("BISHKEK")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");

        }





    }
}

