package com.swiftpot.dailytext.crawler;

import com.swiftpot.dailytext.crawler.models.DailyTextEntity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         20-Jan-17 @ 9:26 PM
 */
public class DailyTextCrawler {

    private static String JW_DAILY_TEXT_BASE_URL="http://wol.jw.org/en/wol/dt/r1/lp-e";
    private static String DATE_PATTERN = "yyyy-MM-dd";

    /**
     *
     * @param date pass in date in yyyy/mm/dd format as that is what is used on jw.org website.
     * @return
     * @throws IOException
     */
    public DailyTextEntity crawlForDailyText(String date) throws IOException, ParseException {
        //retrieve html
        Document doc = Jsoup.connect(JW_DAILY_TEXT_BASE_URL + "/" + date).get();

        //Find paragraph(p) tag with themeScrp class in the html page,this contains the theme Scripture
        Element dailyTextThemeParagraph = doc.select("p.themeScrp").first();
        //Find the first div with the class 'bodyTxt' in the html page,this contains the body of the daily Text.
        Element dailyTextBodyDiv = doc.select("div.bodyTxt").first();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN);
        Date friendlyDate = simpleDateFormat.parse(date);
        String friendlyDateString = simpleDateFormat.format(friendlyDate);

        return new DailyTextEntity(friendlyDateString,dailyTextThemeParagraph.text(),dailyTextBodyDiv.text());

    }
}
