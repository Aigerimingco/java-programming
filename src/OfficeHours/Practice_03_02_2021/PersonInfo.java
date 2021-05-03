package OfficeHours.Practice_03_02_2021;
/*Printing, variables, datatypes, concatenation
================================================

Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information
====================================================

Make a class Zoo
make a main method

Create variables and give some values

    - For this one, pick which datatype you think is best for each variable

    - name, founded date, starting time, closing time, open on holidays, has aquarium section, number of big cats, number of hoofed animals, number of reptiles, number of birds, number of primates, number of employees, ticket cost for adults, ticket cost for under 13, park rules,

    - Make a brochure of the zoo's information.

====================================================

 */

public class PersonInfo {
    public static void main(String[] args) {
        String name="Aigerim";
        byte age=34;
        char gender='F';
        boolean student=true;
        short numberOfSiblings=4;
        long favoriteNumber=110;
        int numberOfSeasons=4;
        double birthdate=05.20;
        int year=2021;
       // String fullDob=05.20.1986;
        String FavoriteQuote="Positive minds will lead to positive outcomes";

        System.out.println("Name: "+ name+ "Age: "+ age+"Gender: "+ gender+"Student: "+ student +
                "Number of Siblings: " + numberOfSiblings+"Favorite Number: "+favoriteNumber +"Number of Seasons: "+
                numberOfSeasons
        +birthdate+year+FavoriteQuote);


    }
}
