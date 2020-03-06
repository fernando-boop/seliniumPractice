package firstPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Paths {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("12345");

        driver.findElement(By.xpath("//*[@id='Login']")).click();
        String message = driver.findElement(By.cssSelector("div#error.loginError")).getText();
        System.out.println(message);

        Thread.sleep(3000);
        //*[@id="nav-search"]

        driver.close();




    }
}
