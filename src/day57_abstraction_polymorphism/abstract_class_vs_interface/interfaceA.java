package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface interfaceA {
    /**
     * interfaces can ONLY have PUBLIC STATIC FINAL variables
     */
    public static final String TYPE= "interface";
    double MAX_COUNT= 500;//This is also public static final



    public abstract void absMethodD(int num);
public static void staticMethodE(String str){
    /**
     * starting from java 8(jdk 1.8
     * interface can have static and default methods
     */
    System.out.println("staticMethodE is called with str- "+str);
}
public default void defaultMethodF(){
    System.out.println("defaultMethodF is called");
}
}
