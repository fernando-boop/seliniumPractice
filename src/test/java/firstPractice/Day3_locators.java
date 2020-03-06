package firstPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://letskodeit.teachable.com/p/practice");
        Thread.sleep(3000);

        driver.findElement(By.name("enter-name")).sendKeys("Fernando");
        driver.findElement(By.id("confirmbtn"));
        Thread.sleep(3000);

        driver.close();


    }
}
