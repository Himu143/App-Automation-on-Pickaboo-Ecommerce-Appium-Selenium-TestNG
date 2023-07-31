package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class HomePage {
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    AndroidElement allowBtn1;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.Image")
    AndroidElement closePickabook;
    @FindBy(xpath = "//android.view.View[@content-desc=\"Login\"]/android.widget.TextView")
    AndroidElement loginBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    AndroidElement mobileField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText")
    AndroidElement password;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.widget.Button")
    AndroidElement login;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Image")
    AndroidElement menu;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[5]/android.widget.Button[5]")
    AndroidElement logoutBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.ListView[1]/android.view.View[1]/android.view.View")
    AndroidElement smartphone;

    @FindBy(xpath = "//android.view.View[@content-desc=\" Dashboard\"]")
    AndroidElement dashboardBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View")
    AndroidElement acInformation;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
    AndroidElement editBtn;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText")
    AndroidElement firstname;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.widget.EditText")
    AndroidElement lastname;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View")
    AndroidElement saveBtn;
    @FindBy(xpath = "//android.view.View[@content-desc=\"fastpick Redmi 12C 4GB/128GB with 12 Months Free Display Insurance Redmi 12C 4GB/128GB with 12 Months Free Display Insurance ৳14,599 ৳14,999 -3%\"]/android.view.View/android.view.View[2]")
    AndroidElement redmiPhone;

    @FindBy(xpath = "//android.view.View[@content-desc=\"fastpick Redmi 12C 4GB/128GB with 12 Months Free Display Insurance Redmi 12C 4GB/128GB with 12 Months Free Display Insurance ৳14,599 ৳14,999 -3%\"]/android.view.View/android.view.View[1]/android.widget.Image")
    AndroidElement addToCart;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[7]/android.view.View[3]/android.view.View")
    AndroidElement selectPhoneColour;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText")
    AndroidElement searchBar;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View")
    AndroidElement filter;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[9]")
    AndroidElement viewMore;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[1]/android.view.View[2]")
    AndroidElement selectSam;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[2]/android.widget.TextView")
    AndroidElement selectInfinix;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[6]/android.widget.TextView")
    AndroidElement selectNokia;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[4]/android.widget.TextView")
    AndroidElement selectOnePlus;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[4]/android.view.View[2]/android.view.View")
    AndroidElement applyBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View")
    AndroidElement myOrderBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]")
    AndroidElement home;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.ListView[1]/android.view.View[4]/android.view.View")
    AndroidElement computers;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View")
    AndroidElement categoryBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[1]/android.widget.TextView")
    AndroidElement laptopNotebook;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[2]/android.view.View[2]")
    AndroidElement tablet;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[5]")
    AndroidElement selectBrand;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[5]/android.widget.TextView")
    AndroidElement selectApple;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[6]/android.view.View[1]")
    AndroidElement selectAsus;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[7]")
    AndroidElement selectRam;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[3]/android.widget.TextView")
    AndroidElement selectRam32;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[15]/android.widget.ListView/android.view.View[1]/android.widget.TextView")
    AndroidElement selectRam16;
    WebDriver driver;
    public HomePage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    public void allow() throws InterruptedException {
        allowBtn1.click();
        Thread.sleep(1000);
        allowBtn1.click();
        Thread.sleep(1000);
        allowBtn1.click();

    }

    public void login(){
        closePickabook.click();
        loginBtn.click();
        mobileField.sendKeys("01674169352");
        password.sendKeys("12345678");
        login.click();

    }

    public void selectSmartPhone(){
        menu.click();
        smartphone.click();

    }

    public void selectDashboard() throws InterruptedException {
        menu.click();
        dashboardBtn.click();
        acInformation.click();
        editBtn.click();
        firstname.sendKeys("Kazi Tajul");
        lastname.sendKeys("Islam");
        saveBtn.click();
        menu.click();
        smartphone.click();

    }

    public void search(){
        searchBar.click();
        searchBar.sendKeys("Samsung s22 ultra");
        searchBar.click();

    }

    public void filter(){
        filter.click();
        viewMore.click();
        selectSam.click();
        selectInfinix.click();
        selectOnePlus.click();
        selectNokia.click();
        applyBtn.click();
    }

    public void myOrder(){
        menu.click();
        dashboardBtn.click();
        myOrderBtn.click();
        menu.click();
        smartphone.click();
    }


    public void selectCom(){
        menu.click();
        computers.click();
        filter.click();
        categoryBtn.click();
        tablet.click();
        laptopNotebook.click();
        selectBrand.click();
        selectApple.click();
        selectAsus.click();
        selectRam.click();
        selectRam32.click();
        selectRam16.click();
        applyBtn.click();
    }



}