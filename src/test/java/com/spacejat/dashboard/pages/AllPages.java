package com.spacejat.dashboard.pages;


public class AllPages {
    private MainPage mainPage;
    private HomePage homePage;
    private MeetingPage meetingPage;
    private ChannelPage channelPage;
    private ChatOneToOnePage chatOneToOnePage;

    public AllPages(MainPage mainPage,HomePage homePage,MeetingPage meetingPage,ChannelPage channelPage,ChatOneToOnePage chatOneToOnePage){
        this.mainPage = mainPage;
        this.homePage = homePage;
        this.meetingPage = meetingPage;
        this.channelPage = channelPage;
        this.chatOneToOnePage = chatOneToOnePage;
    }

    public MainPage getMainPage(){
        return mainPage;
    }
    public HomePage getHomePage(){
        return homePage;
    }
    public MeetingPage getMeetingPage(){
        return meetingPage;
    }
    public ChannelPage getChannelPage(){
        return channelPage;
    }
    public ChatOneToOnePage getChatOneToOnePage(){
        return chatOneToOnePage;
    }

}
