package day51_inheritance;

public class Contractor extends Employee {
              //1. lets everyone know that you are overrided
              //2. ensures that this method is being overridden. If not, it shows ERROR
    @Override
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;

    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
