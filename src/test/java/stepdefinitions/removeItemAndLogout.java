package stepdefinitions;

import com.microsoft.playwright.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.RemoveItemAndLogoutPage;

public class removeItemAndLogout{

    Page page;
    RemoveItemAndLogoutPage removeItemAndLogoutPage = new RemoveItemAndLogoutPage(page);

    @When("user clicks order button")
    public void user_clicks_order_button() {
        removeItemAndLogoutPage.clickOrderButton();
    }

    @When("user clicks Delete button")
    public void user_clicks_delete_button() {
        removeItemAndLogoutPage.clickDeleteButton();
        System.out.println("Product deleted from the cart");
    }

    @Then("user clicks signout button to logout.")
    public void user_clicks_signout_button_to_logout() {
        removeItemAndLogoutPage.clickSignOutButton();
    }

    @Then("verify user logs out successfully")
    public void verify_user_logs_out_successfully() {
        String loginText = removeItemAndLogoutPage.verifyLoginHeading();
        System.out.println("Login heading : " + loginText);
        Assert.assertEquals(loginText, "Log in");
    }
}
