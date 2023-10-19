package techproed.tests.day21_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_NegatifTest {
    @Test(groups = "smoke")
    public void negatifTest() {
        /*
Negatif Test senaryolarinda sayfaya giris yapilamamasi ile ilgili senaryolari olusturmamiz gerekir.
Bunun icin once ornekteki gibi girmemiz gereken email deki mesela bir @ isareti ya da bir noktalama isareti
email'de olmadan, sifre dogru bile olsa giris yapmamamiz gerekir.Ayni sekilde email dogru olsa sifre yanlis
olsa yine login(giris) yapamamamiz gerekir. Dolayisiyla negatif testlerde bu senaryolari goz onunde bulundurup
buna gore test case lerimizi yazmamiz gerekir.
 */
        //Name:
        //US100208_Negative_Login
        //Description:
        //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        //Acceptance Criteria
        //Customer email: fake@bluerentalcars.com
        //Customer password: fakepass
        //Error:
        //User with email fake@bluerentalcars.com not found

        //BlueRentalCar sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //Login butonuna tıklayalım
        BlueRentalPage rentalPage= new BlueRentalPage();
        rentalPage.loginButton.click();


        //Yanlış email ve yanlış password ile giriş yapılamadığını test edelim
        String fakeEmail= ConfigReader.getProperty("fakeEmail");
        String fakePassword=ConfigReader.getProperty("fakePassword");
        rentalPage.userEmail.sendKeys(fakeEmail, Keys.TAB,fakePassword,Keys.ENTER);

        //test passed oldu ama giremedik sayfaya şimdi login butonunun görünür oldugunu test edicez
        Assert.assertTrue(rentalPage.verifyLogin.isDisplayed());

        //sayfayı kapat
        Driver.closeDriver();




    }

    @Test
    public void test02() {
         /*
    Driver driver = new Driver();
    driver.getDriver().get("https://amazon.com");
 ***NOT***
        SINGLETON PATTEN ile obje oluştumanın önüne geçtik
     */
    }
}
