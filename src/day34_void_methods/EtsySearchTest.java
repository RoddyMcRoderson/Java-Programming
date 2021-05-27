package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting ETSY Search Smoke Test--");
        System.out.println("");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test completed - Pass -");
    }
    public static void openBrowser(){
        System.out.println("1. Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("2. Navigate to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("3a. PASS: Verify Etsy home page is displayed");
        System.out.println("3b. Type Wood Spoon in search field and press enter");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("4. ");
    }
}
