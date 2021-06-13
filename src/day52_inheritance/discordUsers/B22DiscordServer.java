package day52_inheritance.discordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 =new User();
        user1.setId(1234);
        user1.setName("Anara");
        user1.setRole("student");


        Admin admin1 = new Admin();
        admin1.setId(3245);
        admin1.setName("Burak");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2= new Admin("Aika", 1234);
        System.out.println(admin2.toString());

    }
}
