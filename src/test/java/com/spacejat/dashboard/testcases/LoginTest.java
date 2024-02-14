package com.spacejat.dashboard.testcases;

import com.github.javafaker.Faker;
import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.MainPage;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Feature("Auth Feature")
public class LoginTest extends BaseTest {
    @Story("Login with LinkDevice Identity")
    @Description("It Will Login By Filling The LinkDevice Identity Then Navigate To SpaceJat Home Page")
    @Severity(SeverityLevel.CRITICAL)
    @Attachment()
    @Test(priority = 1,invocationCount = 1,description = "Test the login functionality using link identity")
    public void ShouldBeAbleToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity());
    }
    @Story("Login with LinkDevice Identity")
    @Description("It Will To Cancel Login with LinkDevice Identity")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 2,invocationCount = 1,description = "Test the cancel login functionality using link identity")
    public void ShouldBeAbleCancelToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .CancelLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity());
    }
    @Story("Login with LinkDevice Identity")
    @Description("It Will To Exit Login with LinkDevice Identity")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 3,invocationCount = 1,description = "Test the exit login functionality using link identity")
    public void ShouldBeAbleExitToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .ExitLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity());
    }
    @Story("Login with LinkDevice Identity")
    @Description("It Will To Login with Invalid LinkDevice Identity")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 4,invocationCount = 1,description = "Test the login functionality using invalid link identity")
    public void ShouldBeAbleInvalidToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .InvalidLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getInvalidLinkDeviceIdentity());
    }
    @Story("Login with LinkDevice Identity")
    @Description("It Will To Exit Login with Invalid Invitation link")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 5,invocationCount = 1,description = "Test the exit login functionality using invalid link identity")
    public void ShouldBeAbleExitInvalidToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .ExitInvalidLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getInvalidLinkDeviceIdentity());
    }
    @Story("Login with Invitation link")
    @Description("It Will To Exit Login with Invitation link")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 6,invocationCount = 1,description = "Test the exit login functionality using Invitation link")
    public void ShouldBeAbleExitToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .ExitLoginWithInvitationLink(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Story("Login with Invitation link")
    @Description("It Will To Cancel Login with Invitation link")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 7,invocationCount = 1,description = "Test the cancel login functionality using Invitation link")
    public void ShouldBeAbleCancelToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .CancelLoginWithInvitationLink(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Story("Login with Invitation link")
    @Description("It Will To Cancel To Select Your Identity using Invitation link")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 8,invocationCount = 1,description = "Test the login functionality Cancel To Select Your Identity using Invitation link")
    public void ShouldBeAbleCancelToSelectYourIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .CancelSelectYourIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Story("Login with Invitation link")
    @Description("It Will To exit To Select Your Identity using Invitation link")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 9,invocationCount = 1,description = "Test the login functionality exit To Select Your Identity using Invitation link")
    public void ShouldBeAbleExitToSelectYourIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .ExitSelectYourIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Story("Login with Invitation link")
    @Description("It Will To Cancel Create Identity")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 10,invocationCount = 1,description = "Test the login functionality using Cancel Create Identity")
    public void ShouldBeAbleToCancelCreateIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .CancelCreateIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Story("Login with Invitation link")
    @Description("It Will To Close Create Identity")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 11,invocationCount = 1,description = "Test the login functionality using Close Create Identity")
    public void ShouldBeAbleToIconCloseCreateIdentity(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .IconCloseCreateIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Story("Login with Invitation link")
    @Description("It Will To Login with Invitation link")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12,invocationCount = 1,description = "Test the login functionality using Invitation link")
    public void ShouldBeAbleToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .LoginWithInvitationLink
                        (ConfigUtils.getInstance().getInvitationLinkSpace(),
                                Faker.instance().name().firstName(),
                                Faker.instance().name().lastName(),
                                "khalilbido01@gmail.com",
                                "Software test engineer",
                                "01142446676");
    }
    @Story("Login with Invitation link")
    @Description("It Will To Cancel After Create Identity")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 13,invocationCount = 1,description = "Test the login functionality using Cancel After Create Identity")
    public void ShouldBeAbleCancelAfterCreateIdentityToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .CancelAfterCreateIdentity
                        (ConfigUtils.getInstance().getInvitationLinkSpace(),
                                Faker.instance().name().firstName(),
                                Faker.instance().name().lastName(),
                                "khalilbido01@gmail.com",
                                "Software test engineer",
                                "01142446676");
    }
//    @Story("Login with Invitation link")
//    @Description("It Will To Join Meeting As AGuest")
//    @Severity(SeverityLevel.CRITICAL)
//    @Test(priority = 14,invocationCount = 1,description = "Test the login functionality using Invalid Invitation link")
//    public void ShouldBeAbleInvalidToLoginWithInvitationLink(){
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .OpenSpaceJAT()
//                .InvalidLoginWithInvitationLink(ConfigUtils.getInstance().getInvalidInvitationLinkSpace());
//    }
//    @Story("Login with Invitation link")
//    @Description("It Will To Join Meeting As AGuest")
//    @Severity(SeverityLevel.CRITICAL)
//    @Test(priority = 15,invocationCount = 1,description = "Test the login functionality using Exit Invalid Invitation link")
//    public void ShouldBeAbleExitInvalidToLoginWithInvitationLink(){
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .OpenSpaceJAT()
//                .ExitInvalidLoginWithInvitationLink(ConfigUtils.getInstance().getInvalidInvitationLinkSpace());
//    }
    @Story("Join Meeting AS A Guest")
    @Description("It Will To Join Meeting As AGuest")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 16,invocationCount = 1,description = "Test the Join Meeting functionality AS A Guest")
    public void ShouldBeAbleToJoinMeetingAsAGuest(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .JoinMeetingAsAGuest(
                ConfigUtils.getInstance().getInvitationLinkMeeting(),
                "Bido",
                "khalilbido01@gmail.com");
    }
    @Story("Join Meeting AS A Guest")
    @Description("It Will Exit To Join Meeting As AGuest")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 17,invocationCount = 1,description = "Test exit the Join Meeting functionality AS A Guest")
    public void  ShouldBeAbleExitToJoinMeetingAsAGuest(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .ExitJoinMeetingAsAGuest(ConfigUtils.getInstance().getInvitationLinkMeeting());
    }
    @Story("Join Meeting AS A Guest")
    @Description("It Will Cancel To Join Meeting As AGuest")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 18,invocationCount = 1 ,description = "Test cancel the login Meeting functionality AS A Guest")
    public void  ShouldBeAbleCancelToJoinMeetingAsAGuest(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .CancelJoinMeetingAsAGuest(ConfigUtils.getInstance().getInvitationLinkMeeting());
    }
    @Story("Terms And Conditions")
    @Description("It Will Exit Terms And Conditions")
    @Severity(SeverityLevel.TRIVIAL)
    @Test(priority = 19,invocationCount = 1,description = "Test exit the Terms And Conditions")
    public void ShouldBeAbleToExitTermsAndConditions(){
        MainPage mainPage = new MainPage(driver);
        mainPage
                .OpenSpaceJAT()
                .ExitTermsAndConditions();
    }
}
