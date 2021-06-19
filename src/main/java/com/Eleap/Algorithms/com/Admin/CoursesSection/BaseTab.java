package com.Eleap.Algorithms.com.Admin.CoursesSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTab   implements WaitHelper,ComponentHelper{
    public WebDriver driver;


    public BaseTab (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



}
