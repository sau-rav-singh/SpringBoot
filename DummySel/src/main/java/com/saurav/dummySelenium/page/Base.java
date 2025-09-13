package com.saurav.dummySelenium.page;

import com.saurav.dummySelenium.util.ScreenshotUtil;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public abstract class Base {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait webDriverWait;

    @Autowired
    @Lazy
    public ScreenshotUtil screenshotUtil;

    @PostConstruct
    private void init() {
        PageFactory.initElements(this.driver, this);
    }

}