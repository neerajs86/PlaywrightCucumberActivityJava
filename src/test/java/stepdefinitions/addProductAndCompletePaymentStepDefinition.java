package stepdefinitions;

import com.microsoft.playwright.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObject.AddToCartAndCompletePaymentPage;

public class addProductAndCompletePaymentStepDefinition {
 Page page;
 AddToCartAndCompletePaymentPage addToCartAndCompletePaymentPage = new AddToCartAndCompletePaymentPage(page);

 @Given("user clicks add to cart button")
 public void user_clicks_add_to_cart_button() {
  addToCartAndCompletePaymentPage.clickAddToCartButton();
 }

 @Given("user navigate to cart page")
 public void user_navigate_to_cart_page() {
  addToCartAndCompletePaymentPage.navigateToCartPage();
 }

 @Then("user clicks Checkout button to proceed")
 public void user_clicks_checkout_button_to_proceed() {
  addToCartAndCompletePaymentPage.clickCheckoutButton();
 }

 @Then("user enters CVV code as {int}")
 public void user_enters_cvv_code_as(Integer cvv) {
 addToCartAndCompletePaymentPage.enterCvvCode(cvv);
 }

 @Then("user enter country as {string}")
 public void user_enter_country_as(String country) {
 addToCartAndCompletePaymentPage.enterCountry(country);
 }

 @Then("user clicks Place Order button")
 public void user_clicks_place_order_button() {
  addToCartAndCompletePaymentPage.clickPlaceOrderButton();
 }

 @Then("user verify order details")
 public void user_verify_order_details() {
 String productName = addToCartAndCompletePaymentPage.verifyOrderDetails();
 Assert.assertEquals(productName, "ADIDAS ORIGINAL");
 }
 }
