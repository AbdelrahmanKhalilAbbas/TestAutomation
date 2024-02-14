package com.spacejat.dashboard.factory;

import com.spacejat.dashboard.base.BasePage;
import com.spacejat.dashboard.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageFactory {
    protected WebDriver driver;

    public pageFactory (WebDriver driver){
        this.driver = driver;
    }
    public <T extends BasePage> T getPage(Class<T> pageClass){
        try{
            T page = pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
            PageFactory.initElements(driver,page);
            return page;
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Failed to instantiate page: " + pageClass.getName());
        }
    }
    public AllPages getAllPages(){
        MainPage mainPage = getPage(MainPage.class);
        HomePage homePage = getPage(HomePage.class);
        MeetingPage meetingPage = getPage(MeetingPage.class);
        ChannelPage channelPage = getPage(ChannelPage.class);
        ChatOneToOnePage chatOneToOnePage = getPage(ChatOneToOnePage.class);
        return new AllPages(mainPage,homePage,meetingPage,channelPage,chatOneToOnePage);
    }
}
