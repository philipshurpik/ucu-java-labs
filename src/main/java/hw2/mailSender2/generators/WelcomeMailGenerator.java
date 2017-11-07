package hw2.mailSender2.generators;

import hw2.mailSender2.MailCode;
import hw2.mailSender2.MailInfo;

@MailCode(1)
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        //40 lines of logice
        String greeting = "hi";
        if (mailInfo.getClient().getAge() > 50) {
            greeting = "Hello ";
        }

        return "<html> " + greeting + " " + mailInfo.getClient().getName() + " welcome to our Company";
    }
}
