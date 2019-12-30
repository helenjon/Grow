package SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

//Launch new Browser
//Open URL http://facebook.com
// 3.Type Login
// 4.Type Password
// 5.Click on Вход button
// 6.Check that you have logged in
// 7.Close the Browser

public class hometask1 {

    @Test
    public void homeTask1(){
        // Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        // init Chrome driver
        WebDriver driverChrome = new ChromeDriver(options);
        driverChrome.get("http://facebook.com");
        WebElement email = driverChrome.findElement(By.id("email"));
        WebElement pass = driverChrome.findElement(By.id("pass"));
        email.clear(); pass.clear();
        email.sendKeys("helena.mokina@gmail.com");
        pass.sendKeys("Olga2020");
        driverChrome.findElement(By.id("loginbutton")).click();
        String test = driverChrome.findElement(By.xpath("//a[@class='_5afe']")).getAttribute("title");
        // Login check
        Assert.assertEquals( test, "Olena Mironenko");
        driverChrome.quit();

    }


}
