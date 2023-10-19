package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import javax.xml.xpath.XPath;

public class BlueRentalPage {
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li//a)[1]")
    public WebElement loginButton;

    @FindBy(xpath = "(//input)[1]")
    public WebElement userEmail;

    @FindBy(xpath = "(//button)[3]")
    public WebElement verify;

    //Negatif Login Button
    @FindBy(xpath = "(//button)[2]")
    public WebElement verifyLogin;

    @FindBy(xpath = "(//button)[1]")
    public WebElement profilButton;

    @FindBy(xpath = "//*[.='Profile']")
    public WebElement profil;

    @FindBy(xpath = "//em")
    public WebElement profilEmail;

    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//*[.='OK']")
    public WebElement okButton;





}
