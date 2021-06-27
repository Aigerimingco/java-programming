package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements interfaceA, InterfaceB {
    @Override
    public void absMethodA() {
        System.out.println("absmethodA implementation is called");
    }

    //Class can extend 1 abstract class and can implement multiple interfaces

    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }
   // @Override -> static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called- "+num);
    }
}
