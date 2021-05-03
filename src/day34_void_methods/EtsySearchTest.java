package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
    }

    public static void openBrowser() {
        System.out.println("1. Launching Chrome browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("2. Navigating to https://www.etsy.com");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("3. PASS: verify etsy homepage is displayed");
        System.out.println("4. Type 'Wooden spoon' in search engine and click 'Enter'");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("5. PASS: DSearch result successfully displayed");
    }
}
