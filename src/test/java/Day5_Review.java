import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5_Review {
    public static void main(String[] args) throws InterruptedException {
//    WebDriverManager.firefoxdriver().setup();
//    WebDriver driver = new FirefoxDriver();
//
//   driver.get("https://www.google.com/");
//
//    Thread.sleep(2000);
//
//    driver.findElement(By.className("gLFyf")).sendKeys("Fernando");
//
//    Thread.sleep(5000);
//
//    driver.close();


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/#/index");
        Thread.sleep(3000);



    }
}
