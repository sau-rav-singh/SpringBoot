package com.saurav.dummySelenium;

import com.saurav.dummySelenium.page.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTest extends DummySeleniumApplicationTests {
    @Autowired
    private GooglePage googlePage;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        this.googlePage.screenshotUtil.takeScreenshot("googleTest");
        this.googlePage.getSearchComponent().search("spring boot");
        //Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.googlePage.close();
    }
}
