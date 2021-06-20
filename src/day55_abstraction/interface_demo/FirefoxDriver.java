package day55_abstraction.interface_demo;

public class FirefoxDriver implements WebDriver{

    @Override
    public void get(String url) {

    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {

    }
}
