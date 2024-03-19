import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_301_AddEbook extends BaseDriver {

    @Test(priority = 1)
    public void accessTheWebsite(){

        String pageTitle=driver.getTitle();
        Assert.assertEquals(pageTitle, "E-junkie", "Page title does not match expected value");

    }

    @Test(priority = 2)
    public void addEbookToBasket (){

    }
}
