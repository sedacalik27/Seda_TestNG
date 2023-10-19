package techproed.tests.day21_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_PozitifSmokeTest {
    @Test(groups = "smoke")
    public void positifLogin() {
        //Name: US100201_Admin_Login
        //Description:
        //Admin bilgileriyle giriş
        //Acceptance Criteria:
        //Admin olarak, uygulamaya giriş yapabilmeliyim
        //https://www.bluerentalcars.com/
        String url = ConfigReader.getProperty("blueRentalUrl");
        Driver.getDriver().get(url);

        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.loginButton.click();
        String email = ConfigReader.getProperty("blueRentalEmail");
        String password = ConfigReader.getProperty("blueRentalPassword");
        rentalPage.userEmail.sendKeys(email, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(2);
        Assert.assertTrue(rentalPage.verify.isDisplayed());






    }
}
