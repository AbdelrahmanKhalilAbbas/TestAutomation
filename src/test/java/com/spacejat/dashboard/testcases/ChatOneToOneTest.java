package com.spacejat.dashboard.testcases;

import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.MainPage;
import io.qameta.allure.*;
import org.testng.annotations.Test;
@Feature("ChatOneToOne Feature")
public class ChatOneToOneTest extends BaseTest {
    @Story("Start Chat One To One")
    @Description("It Will To Open Chat One To One")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1,invocationCount = 1,description = "Test the open chat functionality To Open Chat One To One")
    public void ShouldBeAbleToOpenChatOne2One() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance()
                        .getLinkDeviceIdentity())
                .getHomePage()
                .CreateChat();
    }
}
