package day52_inheritance.discordUsers;

public class Admin extends User{

    public Admin(){
        super();// call super/ user class no-args constructor
        System.out.println("Admin class constructor");
    }
    public Admin(String name, int id){
        super("Admin", name, id);// puyblic Uset(String role, String name, int id
        System.out.println("Admin class 2 args constructor");

    }

    @Override
    public String toString(){
        return "Admin{" +
                "name='" + getName() + '\'' +
                ", role='" + getRole() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
