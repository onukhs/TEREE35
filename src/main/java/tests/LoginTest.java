package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.TestBase;


public class LoginTest extends TestBase {

    @Test
    public void successLoginTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
    }

    @Test
    public void loginAsBlockedUserTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        driver.findElement(By.xpath("//*[contains(text(), 'Epic sadface: Sorry, this user has been locked out.')]"));
    }

    @Test
    public void loginAsInvalidUserTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("potato");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        driver.findElement(By.xpath("//*[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"));
    }
}
