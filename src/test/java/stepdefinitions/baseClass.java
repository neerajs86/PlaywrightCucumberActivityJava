package stepdefinitions;

import com.microsoft.playwright.*;

public class baseClass {

   static Page page;
   static Playwright playwright;
    static Browser browser;
    static BrowserContext context;

    public static Page getPage() {
        if(page==null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            context = browser.newContext();
            page = context.newPage();
        }
        return page;
    }

    public static void tearDown() {
        if (page != null) page.close();
        if (page != null) browser.close();
        if (page != null) playwright.close();
        page = null;
    }

}
