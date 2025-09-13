package com.saurav.dummySelenium.util;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Component
@Lazy
public class ScreenshotUtil {

    @Autowired
    private WebDriver driver;

    @Value("${screenshot.path}")
    private Path path;

    public void takeScreenshot(String imageName) throws IOException {
        File screenshotFile = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(screenshotFile,this.path.resolve(imageName+".png").toFile());
        System.out.println("Screenshot Taken and saved to "+path);
    }

    @PostConstruct
    public void init() throws InterruptedException {
        System.out.println("Waiting------------------");
        Thread.sleep(10000);
        System.out.println("Initialized ScreenshotUtil");
    }
}
