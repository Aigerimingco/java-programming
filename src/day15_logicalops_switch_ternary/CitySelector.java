package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city="Salt Lake City";
        String city2="Orlando";
        if(city.equals("Salt Lake City") || city.equals("Orlando")){
            System.out.println("Willing to relocate to "+ city);
        }else{
            System.out.println("Not considerin - "+ city);
        }


        String teacher= "akbar";
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is java class with "+ teacher);
        }else{
            System.out.println("Soft skill class with "+teacher);
        }
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("jave class with "+ teacher);
        }else if(teacher.equals("Nadir")){
            System.out.println("Soft skill class with "+teacher);
        }else{
            System.out.println("some othe class with "+teacher);
        }

        String company="Microsoft";
        double salary=120_000.0;
        if(company.equals("Microsoft") || salary>=120_000.0){
            System.out.println("Accept job offer");
        }else{
            System.out.println("Decline job offer or negotiate");
        }
    }
}
