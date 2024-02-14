package com.spacejat.dashboard.pages;

import com.spacejat.dashboard.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChannelPage extends BasePage {

    public ChannelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[1]/div/div/div[2]")
    WebElement Dots3Channel;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[1]")
    WebElement inviteGeneralChannel;
    @FindBy(id = "buttonClose")
    WebElement IconCloseInvitation;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[4]/div/div/div[2]/div[4]/button[1]")
    WebElement cancelInvitation;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[4]/div/div/div[2]/div[3]/button[1]")
    WebElement selectMemberInvitation;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[4]/div/div/div[2]/div[1]/input")
    WebElement SearchMemberInvitation;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[4]/div/div/div[2]/div[1]/button")
    WebElement searchBtn;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[4]/div/div/div[2]/div[4]/button[2]")
    WebElement Invite;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[2]")
    WebElement CopyLink;
    @FindBy(id = "buttonIconCloseChannel")
    WebElement IconCloseCopyLink;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[53]/div[2]/div[6]/div/div[10]/div/div/div[2]/div[2]/div/button")
    WebElement copyBtn;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[3]")
    WebElement UnpinOrPinChannel;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[4]")
    WebElement LeaveChannel;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[5]")
    WebElement RemoveChannel;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[3]")
    WebElement EditChannel;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[3]")
    WebElement PinOrUnpinChannelCreator;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[5]")
    WebElement LeaveChannelCreator;
    @FindBy(xpath = "//html/body/div/div[1]/div[53]/div[2]/div[6]/div/div[12]/button[6]")
    WebElement RemoveChannelCreator;

    @Step
    public void pinAndUnpinGeneralChannel() throws InterruptedException {
        Dots3Channel.click();
        PinOrUnpinChannelCreator.click();
        Thread.sleep(5000);
        Dots3Channel.click();
        PinOrUnpinChannelCreator.click();
    }


}
