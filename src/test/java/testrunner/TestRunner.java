package testrunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import setup.Setup;


public class TestRunner extends Setup {




  //  @Test(priority = 1,description = "User can allow everything")
    @BeforeTest(description = "User can allow all necessary permission")
    public void allowable() throws InterruptedException {
        HomePage homePage= new HomePage(driver);
        homePage.allow();
        Thread.sleep(100);
    }

    @Test(priority = 1,description = "User can login with valid credential")
    public void loginAc() throws InterruptedException {
        HomePage homePage=new HomePage(driver);
        homePage.login();
        Thread.sleep(1000);

    }

//    @Test(priority = 3, description = "User can logout by clicking logout button")
//    public void  logout(){
//        pages.HomePage homePage=new pages.HomePage(driver);
//        homePage.logOut();
//    }


    @Test(priority = 2,description = "User can select dashboard and edit their profile")
    public void dashboard() throws InterruptedException {
        HomePage homePage=new HomePage(driver);

        homePage.selectDashboard();
    }

//    @Test(priority = 4,description = "User can add product to the cart")
//    public void addToCart(){
//        pages.HomePage homePage=new pages.HomePage(driver);
//        homePage.addToCart();
//    }

    @Test(priority = 3,description = "User can search products from searchbar")
    public void searchProduct(){
        HomePage homePage=new HomePage(driver);
        homePage.search();
    }

    @Test(priority = 4,description = "User can filter their search")
    public  void  filterSrch(){
        HomePage homePage=new HomePage(driver);
        homePage.filter();
    }
    @Test(priority = 5,description = "User can check order list")

    public void checkOrderList(){
        HomePage homePage=new HomePage(driver);
        homePage.myOrder();
    }
    @Test(priority = 6,description = "User can filter computer section")
    public void computerFilter(){
        HomePage homePage=new HomePage(driver);
        homePage.selectCom();
    }

}