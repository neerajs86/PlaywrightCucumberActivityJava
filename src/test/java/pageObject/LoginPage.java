package pageObject;

import com.microsoft.playwright.Page;
import stepdefinitions.baseClass;

public class LoginPage {
    Page page;

    public LoginPage(Page page) {
    this.page = page;
    }

    public void launchApplication(String url) {
        baseClass.getPage().navigate("https://rahulshettyacademy.com/client/#/auth/login");
    }

    public void enterEmail(String email) {
        baseClass.getPage().locator("#userEmail").fill(email);
    }

    public void enterPassword(String password) {
        baseClass.getPage().locator("#userPassword").fill(password);
    }

    public void clickLoginButton() {
        baseClass.getPage().locator("#login").click();;
    }

    public String verifyHomePageHeading() {
        return baseClass.getPage().locator("#sidebar").innerText();
    }



}
