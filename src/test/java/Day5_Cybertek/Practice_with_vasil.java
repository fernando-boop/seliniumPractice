package Day5_Cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_with_vasil {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url1 = "http://google.com";
        String url2 = "http://amazon.com";
        String title = driver.getTitle();

        System.out.println(title);

        driver.get(url1);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);
        driver.navigate().to(url2);
        Thread.sleep(3000);
        driver.navigate().back();


        Thread.sleep(3000);

        driver.close();
    }
}
