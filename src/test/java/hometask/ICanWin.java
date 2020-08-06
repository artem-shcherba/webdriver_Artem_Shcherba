package hometask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ICanWin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://paste.ubuntu.com/");

        new WebDriverWait(driver,5)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("id_poster")));

        WebElement pasteName = driver.findElement(By.id("id_poster"));
        pasteName.sendKeys("helloweb");

        WebElement Expiration = driver.findElement(By.id("id_expiration"));
        Select expirationDropdown = new Select(Expiration);
        expirationDropdown.selectByValue("day");

        WebElement inputField = driver.findElement(By.id("id_content"));
        inputField.sendKeys("Hello from WebDriver");
        Thread.sleep(3000);

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
