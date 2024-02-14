package com.spacejat.dashboard.pages;

import com.spacejat.dashboard.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MeetingPage extends BasePage {
    public MeetingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "videoFrame")
    WebElement FrameMeeting;
    @FindBy(id ="closeCameraTest")
    WebElement VideoIconBtn;
    // /html/body/div/div[1]/div[3]/div[4]/button
    @FindBy(id ="closeMicrophoneTest")
    WebElement SpeakerIconBtn;
    @FindBy(xpath = "//html/body/div/div[2]/button[1]")
    WebElement joinBtn;
    @FindBy(xpath = "//html/body/div/div[2]/button[2]")
    WebElement cancelBtn;
    // HEADPHONES
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[1]/button/div")
    WebElement AllHeadPhone;
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[1]/div/ul/button[2]/div/div")
    WebElement communicationsHeadPhones;
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[1]/div/ul/button[3]/div/div")
    WebElement Speakers;
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[1]/div/ul/button[4]/div/div")
    WebElement TS35505NVIDIAHighDefinitionAudio;
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[1]/div/ul/button[5]/div/div")
    WebElement HeadPhones;
    //WEB CAMERA
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[2]/button/div")
    WebElement AllWebCamera;
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[2]/div/ul/button/div/div")
    WebElement IntegratedWebCam;
    //MicroPhone
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[3]/button/div")
    WebElement AllMicroPhone;
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[3]/div/ul/button[2]/div/div")
    WebElement CommunicationsMicroPhone;
    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div[3]/div/ul/button[3]/div/div")
    WebElement MicroPhone;
    //
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[2]/div[3]/button")
    WebElement dropdownFrame;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[2]/div[3]/ul/button[1]")
    WebElement SwitchGridView;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[2]/div[3]/ul/button[2]")
    WebElement FullScreen;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[2]/div[3]/ul/button[5]")
    WebElement EditMeetingFrame;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[2]/div[3]/ul/button[4]")
    WebElement shareMeetingFrame;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[10]/div/div/div[2]/div[2]/div/button")
    WebElement copyLinkFrameOrWall;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[10]/div/div/div[1]/button")
    WebElement iconCloseShareFrameOrWall;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[2]/div[3]/ul/button[3]")
    WebElement inviteToMeetingFrame;
    @FindBy(id = "onCamera")
    WebElement openCam;
    @FindBy(id = "onMicrophone")
    WebElement openMic;
    @FindBy(xpath = "//html/body/div/div[1]/div[3]/div[2]/button")
    WebElement startTheRecord;
    @FindBy(xpath = "//html/body/div/div[1]/div[3]/div[6]/button")
    WebElement raiseHand;
    @FindBy(xpath = "//html/body/div/div[1]/div[3]/div[7]/button")
    WebElement settingController;
    @FindBy(xpath = "//html/body/div/div[1]/div[3]/div[8]/button")
    WebElement endOrLeaveTheMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[6]/div/div/div[1]/button")
    WebElement iconCloseEndMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[6]/div/div/div[2]/div/button[1]")
    WebElement EndMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[6]/div/div/div[2]/div/button[2]")
    WebElement leaveMeeting;
    @FindBy(xpath = "//html/body/div/div[1]/div[3]/div[3]/button")
    WebElement shareScreen;
    @FindBy(id = "votingID")
    WebElement voting;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/ul/h5/button[1]")
    WebElement backIcon;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[1]/button[2]")
    WebElement createDocument1;
    @FindBy (xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div/div/button")
    WebElement addParagraph1;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/button")
    WebElement closeIconDocument1;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[1]/div/div/div[2]/div[4]/button[1]")
    WebElement cancelDocument1;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/button")
    WebElement submitDocument1;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[1]/div/div/div[2]/div[4]/button[2]")
    WebElement postDocument1;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/div/input")
    WebElement DocumentTitle1;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[2]/div/div[3]/button")
    WebElement createDocument2;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[2]/div[2]/div/input")
    WebElement DocumentTitle2;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[4]/button[1]")
    WebElement cancelDocument2;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/button")
    WebElement closeIconDocument2;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[2]/div[2]/button")
    WebElement submitDocument2;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[4]/button[2]")
    WebElement postDocument2;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[3]/div/div/button")
    WebElement addParagraph2;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[1]/button[3]")
    WebElement participants;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[1]/button[1]")
    WebElement meetingManagement;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[4]/ul/li[1]/button")
    WebElement waitingRoom;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[4]/ul/li[2]/button")
    WebElement Activity;
    // chat Private
    @FindBy(id = "inBoxID")
    WebElement inBox;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[7]/div/div/div[1]/button")
    WebElement startChattingNow;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/ul/button")
    WebElement createChat;
    // chat Wall
    @FindBy(id = "idWallChat")
    WebElement WallChat;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[5]/div[1]/div[2]/div/textarea")
    WebElement StartTyping;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[5]/div[1]/div[2]/div/button")
    WebElement SendBtn;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[5]/div[1]/div[2]/div/div[3]/div/div/button")
    WebElement emojiWall;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[5]/div[1]/div[2]/div/div[1]/button")
    WebElement attachmentWall;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[5]/ul/li[2]/button")
    WebElement documents;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[5]/ul/li[3]/button")
    WebElement media;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/div[2]/div[5]/ul/li[1]/button")
    WebElement wall;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/ul/div/button")
    WebElement dropdownWallChat;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/ul/div/ul/button[3]")
    WebElement editMeeting;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/ul/div/ul/button[2]")
    WebElement shareMeeting;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/aside[2]/div/ul/div/ul/button[1]")
    WebElement inviteToMeeting;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/input")
    WebElement searchMemberInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/button")
    WebElement searchMember;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[4]/button[1]")
    WebElement cancelSearch;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[3]/button")
    WebElement selectMember;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[4]/button[2]")
    WebElement inviteMember;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[2]/div/div/div[1]/button")
    WebElement exitInvite;
    //
    @Step
    public void JoinMeetingPublic() throws InterruptedException {
        driver.switchTo().frame(FrameMeeting);
        VideoIconBtn.click();
        Thread.sleep(5000);
        SpeakerIconBtn.click();
        Thread.sleep(5000);
        joinBtn.click();
        Thread.sleep(5000);
        openCam.click();
        driver.switchTo().parentFrame();
        Thread.sleep(5000);
        inBox.click();
        Thread.sleep(5000);
        WallChat.click();
        Thread.sleep(5000);
        StartTyping.sendKeys("Hi Everyone");
        Thread.sleep(5000);
        SendBtn.click();
    }

}
