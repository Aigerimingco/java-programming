package day54_abstraction;

public class School1 {
    public static void main(String[] args) {
       // Student student= new Student();ERROR- ca not create object of student
        //student.attendClass();

        OnlineStudent onlineStudent= new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent= new CampusStudent();
        campusStudent.attendClass();


    }
}
