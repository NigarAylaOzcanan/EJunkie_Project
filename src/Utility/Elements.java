package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy (xpath = "(//button[contains(text(),'Add To Cart')])[2]")
    public WebElement addEbookButton;
    @FindBy (xpath = "//button[contains(text(),'Add Promo Code')]")
    public WebElement addPromoCodeButton;
    @FindBy (xpath = "//input[@placeholder='Promo Code']")
    public WebElement promoCodeInput;
    @FindBy (xpath = "//button[@class='Promo-Apply']")
    public WebElement applyButton;
    @FindBy (xpath = "//div[@id='SnackBar']//span")
    public WebElement errorText;
    @FindBy (xpath = "//iframe[@class='EJIframeV3 EJOverlayV3']")
    public WebElement iFrame1;

}
