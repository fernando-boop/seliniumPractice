package asiya_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asiya_practice {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String webSite = "https://www.amazon.com/";
        String currentTitle = driver.getTitle();

        driver.get(webSite);
//div{contains@text(),'   ' )-+
//TagName[contains@attribute,'value']
//TagName[attribute*='value']
        if (webSite.contains(currentTitle)) {
            System.out.println("website is comfirmed ");
        }else {
            System.out.println("website not confirmed ");
        }

        String item = "one more headphones";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
        driver.findElement(By.className("nav-input")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        if (driver.getTitle().contains(item)){
            System.out.println("Item is acounted for");


        }else{
            System.out.println("item and search do not match ");
        }



        Thread.sleep(3000);
        driver.close();

    }
}
