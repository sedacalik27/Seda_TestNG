package techproed.tests.day22_DataProvider_XmlFile;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C03_DataProvider {
    @DataProvider
    public static Object[][] kullaniciBilgileri() {
        return new Object[][]{{"sam.walker@bluerentalcars.com", "c!fas_art"},
                {"kate.brown@bluerentalcars.com", "tad1$Fas"},
                {"raj.khan@bluerentalcars.com", "v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com", "Nga^g6!"}};
    }

    @Test(dataProvider = "kullaniciBilgileri")
    public void test01(String email,String password) {
        //BlueRentalCar sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //login butonuna basınız
        BlueRentalPage rentalPage=new BlueRentalPage();
        rentalPage.loginButton.click();
        ReusableMethods.bekle(2);

        //DataProvider ile girilen mail ve password bilgileri ile login olalım
        rentalPage.userEmail.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(2);


        //sayfayı kapatalım
        Driver.closeDriver();

    }
}
