package day47_Abstraction;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
        System.out.println("========================");

        FireFoxDriver driver1 = new FireFoxDriver();
        driver1.get("https://www.google.com");
        driver1.quit();
        System.out.println("========================");

        OperaDriver driver2 = new OperaDriver();
        driver2.get("https://www.google.com");
        driver2.quit();



    }
}
