package day55_abstraction.exercise_example;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing Running exercise");
    }

    /**
     *
     * @param minutes- how long is exercise
     * @return we are assuming average num of calories while running is 13
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*13;
    }
}
