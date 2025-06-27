package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fAround2{

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
    }

    @Test
    public void signIntoGitHub() throws InterruptedException {
        Thread.sleep(2000);
        WebElement findSignInBtn = driver.findElement(By.linkText("Sign in"));
        findSignInBtn.click();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("login_field"));
        username.sendKeys("NotHilo");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Tai17031996@@");

        WebElement signInBtn = driver.findElement(By.name("commit"));
        signInBtn.click();
        Thread.sleep(5000);

        WebElement label = driver.findElement(By.className("AppHeader-context-item-label"));
        String actualResult = label.getText();
        String expectedResult = "Dashboard";
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(10000);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}