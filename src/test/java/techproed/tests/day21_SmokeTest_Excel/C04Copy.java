package techproed.tests.day21_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C04Copy {
    @Test
    public void excelTest() {
        //BlueRentalCar sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //Login buttonuna tıklayalım
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.loginButton.click();

        //Excel dosyasındaki herhangi bir kullanıcı adı ve password ile login olalım
        String dosyaYolu = "src/test/java/techproed/resources/mysmoketestdata.xlsx";
        String sayfaIsmi = "customer_info";
        ExcelReader reader = new ExcelReader(dosyaYolu, sayfaIsmi);
        String email = reader.getCellData(2, 0);
        String password = reader.getCellData(2, 1);
        System.out.println(email + " || " + password);
        rentalPage.userEmail.sendKeys(email, Keys.TAB, password, Keys.ENTER);

        //Girilen email ile login olduğumuzu doğrulayalım
        ReusableMethods.bekle(3);
        rentalPage.profilButton.click();
        ReusableMethods.bekle(2);
        rentalPage.profil.click();
        ReusableMethods.bekle(2);
        String emailWebElement = rentalPage.profilEmail.getText();
        Assert.assertEquals(email, emailWebElement, "Emaillerde Uyuşmazlık Var");

    }
}
