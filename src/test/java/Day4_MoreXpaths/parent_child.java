package Day4_MoreXpaths;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //how to get to the child from the parent
        // his way //div[@class='lst-c[/dive/div[2]/div/input

        //Does not work for me
       //driver.findElement(By.xpath("//div[@class='gb_be gb_i gb_Ag gb_rg']/div[1]/div/class")).click();




        Thread.sleep(3000);
        driver.close();
    }
}
