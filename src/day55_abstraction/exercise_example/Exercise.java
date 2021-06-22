package day55_abstraction.exercise_example;

public abstract class Exercise {
    public  void start(){
        System.out.println("Warming up and starting the exercise");
    }
    // abstract method-without body/implementation, just signature
    public abstract void perform();

    /**
     * another abstract method that concrete sub classes will override/implement
     * @param minutes- how long is exercise
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);

}
