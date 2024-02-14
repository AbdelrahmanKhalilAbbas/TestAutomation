package com.spacejat.dashboard.testcases;

import com.github.javafaker.Faker;
import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.MainPage;
import io.qameta.allure.*;
import org.testng.annotations.Test;
@Feature("Channel Feature")
public class CreateChannelTest extends BaseTest {
    @Story("Join General Channel")
    @Description("It Will To Exit Join General Channel")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1,invocationCount = 1,description = "Test the Join Channel functionality General Channel")
    public void ShouldBeJoinGeneralChannel(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance()
                        .getLinkDeviceIdentity())
                .getHomePage()
                .JoinGeneralChannel();
    }
    @Story("Pin And Unpin Channel General")
    @Description("It Will To Pin And Unpin General Channel")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2,invocationCount = 1,description = "Test the pin and unpin functionality General Channel")
    public void ShouldBePinAndUnpinChannelGeneral() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance()
                        .getLinkDeviceIdentity())
                .getChannelPage()
                .pinAndUnpinGeneralChannel();
    }
    @Story("Create channel public")
    @Description("It Will To Create Channel Public")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3,invocationCount = 1,description = "Test the Create channel functionality Selecting public")
    public void ShouldBeAbleCreateTheChannelPublic() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity()).getHomePage()
                .CreateChannelPublic(Faker.instance().name().title(),Faker.instance().name().title());
    }
    @Story("Create channel Locked")
    @Description("It Will To Create Channel Locked")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3,invocationCount = 1,description = "Test the Create channel functionality Selecting Locked")
    public void ShouldBeAbleCreateTheChannelLocked() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity()).getHomePage()
                .CreateChannelLocked(Faker.instance().name().title());
    }
}
