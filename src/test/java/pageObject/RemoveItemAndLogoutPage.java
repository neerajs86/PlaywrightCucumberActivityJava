package pageObject;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import stepdefinitions.baseClass;

public class RemoveItemAndLogoutPage {
    Page page;

    public RemoveItemAndLogoutPage(Page page) {
        this.page = page;
    }

    public void clickOrderButton() {
        baseClass.getPage().locator("//label[contains(text(),'Orders History Page')]").click();
    }

    public void clickDeleteButton() {
        baseClass.getPage().getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).first().click();
    }

    public void clickSignOutButton() {
        baseClass.getPage().getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Out")).click();
    }

    public String verifyLoginHeading() {
       return baseClass.getPage().locator("//h1[text()='Log in']").innerText();
    }
}
