package day55_abstraction.interface_demo;

import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

public class DriverObjects {
    public static void main(String[] args) {
       // WebDriver driver= new WebDriver(); ERROR: CANT create object of interface
        ChromeDriver driver1= new ChromeDriver();
        FirefoxDriver driver2=new FirefoxDriver();
        WebDriver driver3= new ChromeDriver();

        driver1.get("https://google.com");
        driver1.findElement("//input[@name='q']");
        System.out.println(("Title= " + driver1.getTitle()));


    }
}
