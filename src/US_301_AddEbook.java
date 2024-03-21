import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_301_AddEbook extends BaseDriver {
    @Test(priority = 1)
    public void accessTheWebsite() {

        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "E-junkie Shop", "Page title does not match expected value");
    }

    @Test(priority = 2)
    public void addEbookToBasket() {
        actions
                .moveToElement(elements.addEbookButton)
                .click()
                .build()
                .perform();
        driver
                .switchTo()
                .frame(elements.iFrame1);
        actions
                .click(elements.addPromoCodeButton)
                .moveToElement(elements.promoCodeInput)
                .sendKeys("65432")
                .click(elements.applyButton)
                .build()
                .perform();

    }
    @Test (priority = 3)
    public void verifyTheWarningMessage(){

        wait.until(ExpectedConditions.textToBePresentInElement(elements.errorText,"Invalid promo code" ));
        Assert.assertTrue(elements.errorText.isDisplayed(), "No warning message is present! ");
        System.out.println("Result: " + elements.errorText.getText());
    }
}
