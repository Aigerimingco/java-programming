package day53_inheritance.hiding;

public class Parent {
    public String name = "parent> Mike Smith";

    public void indroduce1() {
        System.out.println("hello I am " + name);

    }
}


class Child extends Parent {
    public String name = "child> Bob Smith";

    public void indroduce2() {
        System.out.println("Hello I am " + name);
    }
}

class Runner{
    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.indroduce1();


        Child child= new Child();
        child.indroduce1();
        child.indroduce2();
    }
}