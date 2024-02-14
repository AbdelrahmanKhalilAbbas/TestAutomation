package com.spacejat.dashboard.pages;

import com.spacejat.dashboard.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

        /*
        Join meeting
        */
    @FindBy(xpath = "//html/body/div/div[1]/div[2]/div[3]/div/button")
    WebElement JoinMeetingOrChannel;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[1]/button")
    WebElement IconCloseJoinMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[2]/div[4]/button[1]")
    WebElement CancelJoinMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[2]/div[3]/input")
    WebElement EnterLinkToJoinAMeetingOrChannelInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[2]/div[4]/button[2]")
    WebElement JoinBJoinMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[10]/div/div/div[1]/button")
    WebElement IconCloseInvitationLinkNotFound;
    @FindBy(xpath = "//html/body/div[1]/div[10]/div/div/div[2]/div[2]/button")
    WebElement DismissInvitationLinkNotFound;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[100]/div/div/div[1]/button")
    WebElement IconCloseJoinAsAGuest;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[100]/div/div/div[2]/div[4]/button[1]")
    WebElement CancelASAGuest;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[100]/div/div/div[2]/div[2]/input")
    WebElement EnterYourNameInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[100]/div/div/div[2]/div[3]/input")
    WebElement EnterYourEmailInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[100]/div/div/div[2]/div[4]/button[2]")
    WebElement JoinBJoinASaGuest;
    /*
    All Elements
     */
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[3]/div/aside/div/button[1]")
    WebElement Inbox;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[4]/div/aside/div/button[2]")
    WebElement Calendar;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[4]/div/aside/div/button[3]")
    WebElement Drive;
    @FindBy(xpath = "//html/body/div/div[1]/div[2]/div[3]/div/div/div[1]/button")
    WebElement NotificationList;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[1]/aside/div[2]/button")
    WebElement Setting;
    @FindBy(xpath = "//html/body/div/div[1]/div[2]/div[3]/div/div/div[2]/button")
    WebElement dropDownIdentity;
    /*
    Add or join Space
     */
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[1]/aside/div[1]/button[1]")
    WebElement AddSpace;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[1]/button")
    WebElement IconCloseAddSpace;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[2]/div[4]/button[1]")
    WebElement CancelAddSpace;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[2]/div[3]/input")
    WebElement EnterLinkToAddAnotherSpaceInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[91]/div/div/div[2]/div[4]/button[2]")
    WebElement JoinAddSpace;
    @FindBy(xpath = "//html/body/div[1]/div[10]/div/div/div[2]/div[2]/button")
    WebElement DismissTheInvitationLinkYouHaveEnteredIsIncorrect;
    @FindBy(xpath = "//html/body/div[1]/div[10]/div/div/div[1]/button")
    WebElement IconCloseTheInvitationLinkYouHaveEnteredIsIncorrect;
    // join space
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[2]/button[2]")
    WebElement AcceptToJoinSpace;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[2]/button[1]")
    WebElement CancelToJoinSpace;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[1]/button")
    WebElement IconCloseToJoinSpace;
    // create and select identity
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[1]/button")
    WebElement IconCloseSelectYourIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[4]/button[1]")
    WebElement CancelSelectYourIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[4]/button[2]")
    WebElement JoinWithIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[2]/button")
    WebElement CreateNewIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[2]/div[1]/input")
    WebElement FirstName;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[2]/div[2]/input")
    WebElement SecondName;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[3]/input")
    WebElement BusinessEmail;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[4]/input")
    WebElement JobTitle;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[5]/input")
    WebElement Mobile;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[1]/button")
    WebElement IconCloseCreateIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[7]/button[1]")
    WebElement CancelCreateIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[101]/div/div/div[2]/div[7]/button[2]")
    WebElement CreateBCreateIdentity;
    // Create Space
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[2]/div[5]/button")
    WebElement NextAfterSelectIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[1]/button")
    WebElement IconCloseAfterSelectIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[1]/button[3]")
    WebElement IconCloseSpaceInfo;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[2]/div[2]/input")
    WebElement SpaceNameInput;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[1]/button[1]")
    WebElement ButtonBackIcon;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[2]/div[5]/button")
    WebElement StartSpace;
    /*
    CREATE
     */
    @FindBy(id = "buttonAsideCreate")
    WebElement CREATE;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/button[2]")
    WebElement Meeting;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/button[3]")
    WebElement Channel;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/button[4]")
    WebElement Chat;
    // select member
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[53]/div[16]/div/div/div[2]/div[2]/button")
    WebElement Member;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[53]/div[16]/div/div/div[2]/div[3]/button[2]")
    WebElement StartChat;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[53]/div[16]/div/div/div[2]/div[3]/button[1]")
    WebElement CancelStartChat;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[53]/div[16]/div/div/div[1]/button")
    WebElement IconCloseStartChat;
    //Meeting found scroll
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div/input")
    WebElement MeetingNameInput;
    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[53]/div[10]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]/*[name()='svg'][1]")
    WebElement SelectTypeMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[1]/div[3]/div/ul/li[1]")
    WebElement PublicM;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[1]/div[3]/div/ul/li[2]")
    WebElement PrivateM;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/input")
    WebElement EnableStage;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div/input")
    WebElement AllowToChat;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div/input")
    WebElement AllowToSendAttachment;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[5]/div[2]/div/div[1]/div/input")
    WebElement AllowToShareScreen;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[5]/div[3]/div[1]/div/div/input")
    WebElement AllowGuest;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]/div/div/input")
    WebElement AllowWaitingRoom;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[1]/button")
    WebElement IconCloseCreateMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[2]/button[1]")
    WebElement CancelCreateMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[10]/div/div/div[2]/div[2]/button[2]")
    WebElement CreateBCreateMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[5]/div[5]/div/div/div[1]/button")
    WebElement IconCloseJoinMeetingNow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[5]/div[5]/div/div/div[2]/div[4]/button[1]")
    WebElement CancelJoinMeetingNow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[5]/div[5]/div/div/div[2]/div[4]/button[2]")
    WebElement JoinMeetingNow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[5]/div[13]/div/div/div[2]/div[4]/button[2]")
    WebElement JoinStageMeetingNow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[5]/div[5]/div/div/div[2]/div[2]/div/button")
    WebElement ShareMeetingLink;
    //Channel found scroll
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[1]/div[1]/div/input")
    WebElement ChannelNameInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[1]/div[2]/textarea")
    WebElement EnterChannelDescriptionInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[1]/div[3]/div/button[1]")
    WebElement SelectTypeChannel;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[1]/div[3]/div/ul/li[1]")
    WebElement PublicC;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[1]/div[3]/div/ul/li[2]")
    WebElement LockedC;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[4]/div[1]/div/div/input")
    WebElement ChatAllow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[4]/div[2]/div/div/input")
    WebElement SendAttachmentAllow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/div/input")
    WebElement SharingScreenAllow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[2]/button[1]")
    WebElement CancelCreateChannel;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[2]/div[2]/button[2]")
    WebElement CreateBCreateChannel;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[18]/div/div/div[1]/button")
    WebElement IconCloseCreateChannel;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[6]/div/div/div[1]/button")
    WebElement IconCloseJoinChannelNow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[6]/div/div/div[2]/div[3]/button[1]")
    WebElement CancelJoinChannelNow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[6]/div/div/div[2]/div[3]/button[2]")
    WebElement JoinChannelNow;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[6]/div/div/div[2]/div[2]/div/button")
    WebElement ShareChannelLink;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[1]/div[1]")
    WebElement GeneralChannel;


    /*Run TEST*/

    @Step
    public AllPages CreateMeetingPublic(String Name) throws InterruptedException {
        CREATE.click();
        Thread.sleep(4000);
        Meeting.click();
        MeetingNameInput.sendKeys(Name);
        SelectTypeMeeting.click();
        PublicM.click();
        CreateBCreateMeeting.click();
        Thread.sleep(5000);
        JoinMeetingNow.click();
        return new AllPages(new MainPage(driver),new HomePage(driver),new MeetingPage(driver),new ChannelPage(driver),new ChatOneToOnePage(driver));
    }
    @Step
    public AllPages CreateMeetingPrivate(String Name) throws InterruptedException {
        CREATE.click();
        Thread.sleep(2000);
        Meeting.click();
        MeetingNameInput.sendKeys(Name);
        SelectTypeMeeting.click();
        PrivateM.click();
        CreateBCreateMeeting.click();
        Thread.sleep(3000);
        JoinMeetingNow.click();
        return new AllPages(new MainPage(driver),new HomePage(driver),new MeetingPage(driver),new ChannelPage(driver),new ChatOneToOnePage(driver));
    }
    @Step
    public AllPages CreateStageMeetingPublic(String Name) throws InterruptedException {
        CREATE.click();
        Thread.sleep(2000);
        Meeting.click();
        MeetingNameInput.sendKeys(Name);
        SelectTypeMeeting.click();
        PublicM.click();
        EnableStage.click();
        CreateBCreateMeeting.click();
        Thread.sleep(3000);
        JoinStageMeetingNow.click();
        return new AllPages(new MainPage(driver),new HomePage(driver),new MeetingPage(driver),new ChannelPage(driver),new ChatOneToOnePage(driver));
    }
    @Step
    public AllPages CreateStageMeetingPrivate(String Name) throws InterruptedException {
        CREATE.click();
        Thread.sleep(2000);
        Meeting.click();
        MeetingNameInput.sendKeys(Name);
        SelectTypeMeeting.click();
        PrivateM.click();
        EnableStage.click();
        CreateBCreateMeeting.click();
        Thread.sleep(3000);
        JoinStageMeetingNow.click();
        return new AllPages(new MainPage(driver),new HomePage(driver),new MeetingPage(driver),new ChannelPage(driver),new ChatOneToOnePage(driver));
    }
    @Step
    public AllPages CreateChannelPublic(String Name, String Description) throws InterruptedException {
        CREATE.click();
        Thread.sleep(2000);
        Channel.click();
        ChannelNameInput.sendKeys(Name);
        EnterChannelDescriptionInput.sendKeys(Description);
        SelectTypeChannel.click();
        PublicC.click();
        CreateBCreateChannel.click();
        Thread.sleep(3000);
        JoinChannelNow.click();
        return new AllPages(new MainPage(driver),new HomePage(driver),new MeetingPage(driver),new ChannelPage(driver),new ChatOneToOnePage(driver));
    }
    @Step
    public void CreateChannelLocked(String Name) throws InterruptedException {
        CREATE.click();
        Thread.sleep(2000);
        Channel.click();
        Thread.sleep(2000);
        ChannelNameInput.sendKeys(Name);
        Thread.sleep(2000);
        SelectTypeChannel.click();
        Thread.sleep(2000);
        LockedC.click();
        Thread.sleep(2000);
        CreateBCreateChannel.click();
        Thread.sleep(3000);
        JoinChannelNow.click();
    }
    @Step
    public void CreateChat() throws InterruptedException {
        CREATE.click();
        Thread.sleep(3000);
        Chat.click();
        Thread.sleep(2000);
        Member.click();
        Thread.sleep(2000);
        StartChat.click();
    }
    @Step
   public AllPages JoinGeneralChannel(){
        GeneralChannel.click();
        return new AllPages(new MainPage(driver),new HomePage(driver),new MeetingPage(driver),new ChannelPage(driver),new ChatOneToOnePage(driver));
    }

}
