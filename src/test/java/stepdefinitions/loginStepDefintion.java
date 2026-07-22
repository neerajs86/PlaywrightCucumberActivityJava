package stepdefinitions;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.LoginPage;

public class loginStepDefintion{
    Page page;
    LoginPage loginPage = new LoginPage(page);

    @Given("user open browser and launch application")
    public void user_open_browser_and_launch_application() {
        loginPage.launchApplication("https://rahulshettyacademy.com/client/#/auth/login");
    }

    @When("user enter email as {string} and password as {string}")
    public void user_enter_email_as_and_password_as(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("verify Home title in dashboard page")
    public void verify_home_title_in_dashboard_page() {
        String homeHeading = loginPage.verifyHomePageHeading();
        System.out.println("Home heading : " + homeHeading);
        Assert.assertTrue(homeHeading.contains("Home"));
    }
}
