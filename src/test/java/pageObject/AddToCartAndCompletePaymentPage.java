package pageObject;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import stepdefinitions.baseClass;

public class AddToCartAndCompletePaymentPage {
    Page page;

    public AddToCartAndCompletePaymentPage(Page page) {
        this.page = page;
    }

    public void clickAddToCartButton() {
        baseClass.getPage().getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to cart")).first().click();
    }

    public void navigateToCartPage() {
        baseClass.getPage().locator("[routerlink='/dashboard/cart']").click();
    }

    public void clickCheckoutButton() {
        baseClass.getPage().getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Checkout")).click();
    }

    public void enterCvvCode(int cvv) {
        baseClass.getPage().locator("//div[text()='CVV Code ']/following-sibling::input").fill(String.valueOf(cvv));
    }

    public void enterCountry(String country) {
        baseClass.getPage().getByPlaceholder("Select Country").pressSequentially(country);
        baseClass.getPage().locator("//button//span[text()=' India']").click();
    }

    public void clickPlaceOrderButton() {
        baseClass.getPage().locator("//a[text()='Place Order ']").click();
    }

    public String verifyOrderDetails() {
        return baseClass.getPage().locator(".order-summary .title").first().innerText();
    }
}
