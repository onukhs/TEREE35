package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.TestBase;

import static java.lang.Thread.sleep;

public class PracticeTest extends TestBase {


    @Test
    public void practiceTest(){
        driver.get("https://sdacademy.dev");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void elementsTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        sleep(3000);

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        sleep(3000);
    }

    @Test
    public void elemeddntsTest() throws InterruptedException {
        driver.get("https://www.amazon.com");
        //excplicit wait
        sleep(5000);
        driver.findElement(By.xpath("//*button_first_item")).click();
    }


}
