package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.SearchPage;
import pages.UprCalculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class googleTest {
    private static WebDriver driver;
    private static SearchPage searchPage;
    private static UprCalculator UprCalculator;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        UprCalculator = new UprCalculator(driver);

    }
    @BeforeEach
    public void setup(){ driver.get("https://google.com/"); }

    @Test
    public void calculator1() {
       searchPage.search("Калькулятор");
       UprCalculator.leftsc.click();
        //(
       UprCalculator.one.click();
       //1
       UprCalculator.plus.click();
       //+
       UprCalculator.two.click();
       //2
       UprCalculator.rightsc.click();
       //)
       UprCalculator.increase.click();
       //*
       UprCalculator.three.click();
       //3
       UprCalculator.minus.click();
       //-
       UprCalculator.four.click();
       //4
       UprCalculator.zero.click();
       //0
       UprCalculator.part.click();
       //:
       UprCalculator.five.click();
       //5
       UprCalculator.equals.click();
       //=
       assertAll(() -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.cssSelector("div [jsname=\"VkJw6\"] span")).getText()),
               () -> assertEquals("1", driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] span")).getText()));

    }
    @Test
    public void calculator2(){
        searchPage.search("Калькулятор");
        UprCalculator.six.click();
        //6
        UprCalculator.part.click();
        //:
        UprCalculator.zero.click();
        //0
        UprCalculator.equals.click();
        //=
        assertAll(() -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.cssSelector("div [jsname=\"VkJw6\"] span")).getText()),
                () -> assertEquals("1", driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] span")).getText()));
    }
    @Test
    public void calculator3(){
        searchPage.search("Калькулятор");
        UprCalculator.sin.click();
        //sin
        UprCalculator.equals.click();
        //=
        assertAll(() -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.cssSelector("div [jsname=\"VkJw6\"] span")).getText()),
                () -> assertEquals("1", driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] span")).getText()));
    }
    @AfterAll
    public static void teardown() {driver.quit(); }
}
