import Utility.BaseDriver;
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

        actions.moveToElement(elements.addEbookButton).click().build().perform();
        driver.switchTo().frame(elements.iFrame1);

      // wait.until(ExpectedConditions.elementToBeClickable(elements.addPromoCodeButton)).click();
      // wait.until(ExpectedConditions.elementToBeClickable(elements.promoCodeInput)).sendKeys("23456");
      // elements.applyButton.click();
        //

        wait.until(ExpectedConditions.elementToBeClickable(elements.addPromoCodeButton));
        actions.moveToElement(elements.addPromoCodeButton).click().build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(elements.promoCodeInput));
        actions.moveToElement(elements.promoCodeInput).sendKeys("23456").build().perform();
        actions.moveToElement(elements.applyButton).click().build().perform();
    }
    @Test(priority = 3)
    public void verifyTheWarningMessage() {

        wait.until(ExpectedConditions.visibilityOf(elements.errorText));
        Assert.assertTrue(elements.errorText.isDisplayed(), "No warning message is present! ");
        logger.info("Error message: "+ elements.errorText.getText());
    }
}
