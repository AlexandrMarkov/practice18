package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class UprCalculator {
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"N10B9\"]")
    public WebElement one;

    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"lVjWed\"]")
    public WebElement two;

    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"KN1kY\"]")
    public WebElement three;

    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"xAP7E\"]")
    public WebElement four;

    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"Ax5wH\"]")
    public WebElement five;

    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"abcgof\"]")
    public WebElement six;

    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"bkEvMb\"]")
    public WebElement zero;

    @FindBy (css = "div[aria-label=\"закрывающая скобка\"]")
    public WebElement rightsc;

    @FindBy (css = "div[aria-label=\"открывающая скобка\"]")
    public WebElement leftsc;

    @FindBy (css = "div[aria-label=\"вычитание\"]")
    public WebElement minus;

    @FindBy (css = "div[aria-label=\"сложение\"]")
    public WebElement plus;

    @FindBy (css = "div[aria-label=\"умножение\"]")
    public WebElement increase;

    @FindBy (css = "div[aria-label=\"деление\"]")
    public WebElement part;

    @FindBy (css = "div[aria-label=\"равно\"]")
    public WebElement equals;

    @FindBy (css = "div[aria-label=\"синус\"]")
    public WebElement sin;


    public UprCalculator(WebDriver driver) { initElements(driver, this);}


}
