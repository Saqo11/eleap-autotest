package com.lms.automation;

import com.Eleap.Algorithms.com.Admin.CoursesSection.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MainTest {
    WebDriver driver;

    public LoginAdminPage loginAdminPage;
    public CoursesSectionAdminPage coursesSectionAdminPage;
    public DropDownMenuTab dropDownMenuTab;
    public MyAssignedSelfEnrollmentTab myAssignedSelfEnrollmentTab;
    public ManageCategoriesManageEventsTab manageCategoriesManageEventsTab;
    public QuizResultTabs quizResultTabs;
    @BeforeEach
    public void start() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginAdminPage = new LoginAdminPage(driver);
        coursesSectionAdminPage = new CoursesSectionAdminPage(driver);
        dropDownMenuTab =new DropDownMenuTab(driver);
        myAssignedSelfEnrollmentTab = new MyAssignedSelfEnrollmentTab(driver);
        manageCategoriesManageEventsTab = new ManageCategoriesManageEventsTab(driver);
        quizResultTabs = new QuizResultTabs(driver);

    }


    @AfterEach
    public void finish() {


      driver.quit();
   }


}

