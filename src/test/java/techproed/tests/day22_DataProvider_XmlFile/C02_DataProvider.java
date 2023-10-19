package techproed.tests.day22_DataProvider_XmlFile;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_DataProvider {
    @DataProvider
    public static Object[][] araclar() {
        return new Object[][]{{"volvo"},{"mercedes"},{"audi"},{"ford"}};
    }
    //Google sayfasına gidelim
    //DataProvider ile istediğimiz arac isimlerini aratalım


    @Test(dataProvider = "araclar")
    public void test01(String data) {
        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //DataProvider ile istediğimiz arac isimlerini aratalım
        GooglePage page = new GooglePage();
        page.aramaKutusu.sendKeys(data, Keys.ENTER);
        //page.cookie.click();//eger cookies çıkarsa kapat demek

        //sayfayi kapatin
        Driver.closeDriver();


        

    }
}
