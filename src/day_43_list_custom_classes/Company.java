package day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.name= "Aigerim Ingco";
        emp1.jobTitle= "Coach";
        emp1.work();

        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);

        Employee emp2= new Employee();
        emp2.name= "Brian Ingco";
        emp2.jobTitle= "Security Analyst";
        emp2.work();
        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);

        Employee emp3 = new Employee();
        emp3.name= "Aisuluu";
        emp3.jobTitle= "Doctor";
        emp3.work();
        //emp1=emp2;

        emp1.work();
    }
}
