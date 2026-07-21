package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    @Before
    public void setUp() {
        baseClass.getPage();
    }

    @After
    public void tearDown() {
        baseClass.tearDown();
    }
}
