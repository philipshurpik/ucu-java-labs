package hw2.mailSender2.generators;

import hw2.mailSender2.MailCode;
import hw2.mailSender2.MailInfo;

@MailCode(3)
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "happy birthday " + mailInfo.getClient().getName();
    }
}
