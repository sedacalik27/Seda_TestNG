package techproed.tests.day22_DataProvider_XmlFile;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProvider {
    /*
        DataProvider, bir çok veriyi test caselerde loop kullanmadan aktarmak için kullanılır.
    TestNG'den gelen bir özelliktir. 2 Boyutlu Object Array return eder. DataProvider(veri sağlayıcı)
    kullanabilmek için @Test notasyonundan sonra parametre olarak dataprovider yazıp aşağıdaki
    örnekteki gibi bir isim veririz. Bu verileri kullanabilmek için test methoduna da String parametre ekleriz
    Ve bu verdiğimiz isim ile create method diyerek @DataProvider
    notasyonuna sahip bir method oluşturur ve bu method da kullanacağımız verileri gireriz.
        Eğer oluşturmuş olduğunuz @Dataprovider notasyonuna sahip methodu spesifik olarak bir methoda
    bağlamak isterseniz @DataProvider notasyonundan sonra name parametresi ile Test methodundaki
    belirttiğimiz aynı ismi veririz
     */

    @DataProvider(name="test03")
    //burda name parametresiyle test 1 ve test 2 ile bağlantısı kesip sadece test03 e bağladık
    public static Object[][] veriler() {
        return new Object[][]{{"erol"},{"evren"},{"seda"},{"ömer"},{"suat"}};
    }

    @Test(dataProvider = "veriler")
    public void test01(String data) {
        System.out.println(data);
    }


    @Test(dataProvider = "veriler")
    public void test02(String data) {
        System.out.println(data);
    }


    @Test(dataProvider = "test03")
    public void test03(String data) {
        System.out.println(data);

    }
}
