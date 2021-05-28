package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress= new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipcode("22182");

        System.out.println("CybertekSchool address: "+cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println("address after update: "+cybertekAddress.toString());
        System.out.println("street info: "+cybertekAddress.getStreet());

        Address newAddress= new Address();
        newAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        System.out.println(newAddress.toString());


    }
}
