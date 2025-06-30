package part2.com.saucedemo.test.login;


import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests2 extends BaseTest {

    @Test
    public void testErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("123");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}


