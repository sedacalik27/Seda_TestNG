package techproed.tests.day21_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Homework01 {
  /*
    Name:

    US100402_Negative_Login
    Description:
    Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
    Acceptance Criteria:
    Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
    Hata Mesaji:
    Bad credentials
    Test Data:
    Customer email: jack@gmail.com
    Customer password: fakepass
    */

    @Test
    public void negatifTest() {
        //US100402_Negative_Login
        //    Description:
        //    Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
        //    Acceptance Criteria:
        //    Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
        //    Hata Mesaji:
        //    Bad credentials

        //    Test Data:
        //    Customer email: jack@gmail.com
        //    Customer password: fakepass

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage rentalPage=new BlueRentalPage();
        rentalPage.loginButton.click();
        String email= ConfigReader.getProperty("blueRentalEmail");
        String password= ConfigReader.getProperty("blueRentalPassword");

        String fakeEmail = ConfigReader.getProperty("fakeEmail");
        String fakePassword = ConfigReader.getProperty("fakePassword");
        rentalPage.userEmail.sendKeys(email, Keys.TAB,password,Keys.ENTER);

        Assert.assertTrue(rentalPage.verifyLogin.isDisplayed());
        ReusableMethods.bekle(5);

        //AssertFalse ile yapmak istersek
        //Assert.assertFalse(rentalPage.profilButton.isDisplayed());















    }
}
