package com.sdl.selenium.web;

import com.sdl.selenium.InputData;
import com.sdl.selenium.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class WebLocatorActionsIntegrationTest extends TestBase {

    private WebLocator locator = new WebLocator().setId("loginButton");

    @BeforeClass
    public void startTests() {
        driver.get(InputData.LOGIN_URL);
    }

    @Test
    public void actionsTest() {
        assertThat(locator.isElementPresent(), is(true));
        assertThat(locator.getHtmlText(true), equalTo("Login"));
        startTests();
        assertThat(locator.getHtmlText(true), equalTo("Login"));
    }
}
