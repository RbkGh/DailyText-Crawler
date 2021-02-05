# Java library to crawl jw.org and retrieve daily text in friendly format (tts friendly)

# Example
```
public static void main(String[] args) throws IOException, ParseException {

           DailyTextEntity dailyTextEntity = new DailyTextCrawler().crawlForDailyText("2017/01/20");
           System.out.println("Day="+dailyTextEntity.getDailyTextDayDate()+"\nTheme: "+dailyTextEntity.getDailyTextTheme()+"\nBody: "+dailyTextEntity.getDailyTextMsgBody());
       }
       This will output
       Day=Friday, January 2017
       Theme: See, truly an Israelite in whom there is no deceit.—John 1:47.
       Body: You cannot read hearts as Jesus could, but with God’s help you can exercise insight. Will you use that ability to look for the good in your teenager? No one wants to be labeled a “troublemaker.” In thought or word, never label your son or daughter a “rebellious teenager” or a “problem child.” Even if your teen is struggling, let him know that you see his potential and heartfelt desire to do what is right. Note any signs of growth and progress, and commend him. Help him to develop his good qualities by giving him increased responsibility when possible. Jesus did that with his disciples. About a year and a half after meeting Nathanael, Jesus selected him as an apostle, and Nathanael proved to be a zealous Christian. (Luke 6:13, 14; Acts 1:13, 14) Your commendation and encouragement will help your child to feel that he is, not someone who always fails to measure up, but a capable Christian whom Jehovah can use. w15 11/15 2:15, 16

```
