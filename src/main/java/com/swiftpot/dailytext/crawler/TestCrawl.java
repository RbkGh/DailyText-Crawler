package com.swiftpot.dailytext.crawler;

import com.swiftpot.dailytext.crawler.models.DailyTextEntity;

import java.io.IOException;
import java.text.ParseException;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         20-Jan-17 @ 10:24 PM
 */
public class TestCrawl {

    public static void main(String[] args) throws IOException, ParseException {

        DailyTextEntity dailyTextEntity = new DailyTextCrawler().crawlForDailyText("2017/01/20");
        System.out.println("Day="+dailyTextEntity.getDailyTextDayDate()+"\nTheme: "+dailyTextEntity.getDailyTextTheme()+"\nBody: "+dailyTextEntity.getDailyTextMsgBody());
    }
}
