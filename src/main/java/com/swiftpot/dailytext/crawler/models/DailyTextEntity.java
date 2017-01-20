package com.swiftpot.dailytext.crawler.models;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         20-Jan-17 @ 9:30 PM
 */

/**
 * Contains the full daily text parts,the date,the theme and the daily text message body
 */
public class DailyTextEntity {

    /**
     * date of the current daily text
     */
    private String dailyTextDayDate;

    /**
     * the theme of the daily text
     */
    private String dailyTextTheme;

    /**
     * the daily text full message body
     */
    private String dailyTextMsgBody;

    public DailyTextEntity() {
    }

    public DailyTextEntity(String dailyTextDayDate, String dailyTextTheme, String dailyTextMsgBody) {
        this.dailyTextDayDate = dailyTextDayDate;
        this.dailyTextTheme = dailyTextTheme;
        this.dailyTextMsgBody = dailyTextMsgBody;
    }

    public String getDailyTextDayDate() {
        return dailyTextDayDate;
    }

    public void setDailyTextDayDate(String dailyTextDayDate) {
        this.dailyTextDayDate = dailyTextDayDate;
    }

    public String getDailyTextTheme() {
        return dailyTextTheme;
    }

    public void setDailyTextTheme(String dailyTextTheme) {
        this.dailyTextTheme = dailyTextTheme;
    }

    public String getDailyTextMsgBody() {
        return dailyTextMsgBody;
    }

    public void setDailyTextMsgBody(String dailyTextMsgBody) {
        this.dailyTextMsgBody = dailyTextMsgBody;
    }
}
