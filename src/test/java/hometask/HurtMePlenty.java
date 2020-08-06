package hometask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HurtMePlenty {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://cloud.google.com/");

        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Search box']")));

        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search box']"));
        searchBox.click();
        searchBox.sendKeys("Google Cloud Platform Pricing Calculator");
        searchBox.sendKeys(Keys.RETURN);

        new WebDriverWait(driver,10)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//div[@class='gs-title']/a[@data-ctorig='https://cloud.google.com/products/calculator']")));

        WebElement searchResult = driver.findElement(By.xpath("//div[@class='gs-title']/a[@data-ctorig='https://cloud.google.com/products/calculator']"));
        searchResult.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
