package day59_polymorphism_exceptions;

public class ElementsTests {
    public static void main(String[] args) {
Link link= new Link();
link.click();
link.getText();
link.sendKeys("hi");
link.getLinkHref();

WebElement loginLink= new Link();
loginLink.click();

    }
}
