package firstPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://letskodeit.teachable.com/p/practice");

        System.out.println(driver.getTitle());//validate if your page is correct
        System.out.println(driver.getCurrentUrl());// validate if you are landed on correct url

        //System.out.println(driver.getPageSource());//print page source
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().back();

        driver.close();//closes current browser
        //driver.quit();//closes all the browsers opened by selenium





    }
}
