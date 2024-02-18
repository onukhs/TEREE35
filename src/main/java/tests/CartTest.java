package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TestBase;

import java.util.List;


public class CartTest extends TestBase {

    @Test
    public void addItemsToCartTest() {
        //Login as valid user
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button']")).click();

        //Take all Add to cart buttons from the page
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
        addToCartButtons.get(0).click();
        addToCartButtons.get(5).click();

        driver.findElement(By.xpath("//span[contains(text(), '2')]"));
    }

    @Test
    public void addAndRemoveElementsTest(){
//        Desc: Add and remove items to a basket/cart
//        Login as valid user
//        Click on Add to cart button for all items in the list
//        When items are added to a cart go to Cart page
//        Remove all items from the cart
//        Verify that all elements are removed

    }
}
