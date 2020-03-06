package Day2_xpath_locators_paths;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        Thread.sleep(2000);
//=============================================================
        //First try

//        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
//        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@title='Sign in']")).click();
//======================================================================================
        // Mine


        driver.findElement(By.cssSelector("ainput#login1")).sendKeys("first");
        driver.findElement(By.cssSelector("input#password")).sendKeys("pass");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        Thread.sleep(5000);
        driver.close();

        //driver.findElement(By.cssSelector("div#error.loginError")).getText();

        //==================================================================
        //Hisf


        driver.get("http://rediff.com");
       
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();





    }
}
