package firstPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Method;
import java.sql.Driver;

public class Day1 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();




        driver.get("https://facebook.com ");
        driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Fernando");
        driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Garduno");
        driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("402-880-6984");
        driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("Bustfer-0078");
        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"month\"]/option[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"day\"]/option[32]")).click();
        driver.findElement(By.xpath("//*[@id=\"year\"]/option[33]")).click();
       // driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
//
        driver.close();




      //  driver.close();



//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("402-880-6984");
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("hustfer-0078");

//       // driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
//        driver.findElement(By.xpath("//input[@class='ytd-searchbox']")).sendKeys("Mine craft");
//        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("youtube.com");
//        driver.findElement(By.xpath("[@class='gN089b']")).click();
//        driver.close();

       driver.close();
    }
}
