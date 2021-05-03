package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf("c"));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println(indexOfJava);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println(indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");
        System.out.println(indexOfSql);

        //if (technologies.contains("maven")) {
         //   System.out.println("maven is present");
        //} else {
          //  System.out.println("maven is not presengt");

            if (technologies.indexOf("maven") > -1) {
                System.out.println("maven is present");
            } else {
                System.out.println("maven not found");
            }
            String word="hello";
        System.out.println(word.indexOf("lo"));
        }
    }
