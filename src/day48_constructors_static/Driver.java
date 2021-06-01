package day48_constructors_static;

public class Driver {
    private String name;
    public Driver(){

    }

    public Driver(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
