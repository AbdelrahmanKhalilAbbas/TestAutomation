package com.spacejat.dashboard.testcases;

import com.github.javafaker.Faker;
import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.MainPage;
import io.qameta.allure.*;
import org.testng.annotations.Test;
@Feature("Meeting Feature")
public class CreateMeetingTest extends BaseTest {
    @Story("Create meeting public")
    @Description("It Will To Creat Meeting Public And Join And Send Message In The Chat Wall")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1,invocationCount = 1,description = "Test the Create meeting functionality Selecting public")
    public void ShouldBeAbleCreateTheMeetingPublic() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity()).getHomePage()
                .CreateMeetingPublic(Faker.instance().name().title()).getMeetingPage()
                .JoinMeetingPublic();
    }
    @Story("Create meeting private")
    @Description("It Will To Create Meeting Private")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2,invocationCount = 1,description = "Test the Create meeting functionality Selecting private")
    public void ShouldBeAbleCreateTheMeetingPrivate() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity()).getHomePage()
                .CreateMeetingPrivate(Faker.instance().name().title());
    }
}
