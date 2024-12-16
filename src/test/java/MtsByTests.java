import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class MtsByTests {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\админ\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement cookieCloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='cookie-agree']")));
            cookieCloseButton.click();
        } catch (NoSuchElementException e) {
        }
    }

    @Test
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        Assert.assertEquals(blockTitle.getText(), "Онлайн пополнение\nбез комиссии", "Block title is not correct");
    }

    @Test
    public void testPaymentLogos() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        List<WebElement> logos = driver.findElements(By.xpath("//img[@alt='Visa'] | //img[@alt='Verified By Visa'] | //img[@alt='MasterCard'] | //img[@alt='MasterCard Secure Code'] | //img[@alt='Белкарт']"));
        for (WebElement logo : logos) {
            Assert.assertTrue(logo.isDisplayed(), logo.getAttribute("alt") + " logo is not displayed");
        }
    }

    @Test
    public void testMoreInfoLink() {
        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        moreInfoLink.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", "Link doesn't navigate to the correct page");
    }

    @Test
    public void testOnlineReplenishment() {
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneNumberField.click();

    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
