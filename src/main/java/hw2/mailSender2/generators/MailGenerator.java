package hw2.mailSender2.generators;

import hw2.mailSender2.MailInfo;

public interface MailGenerator {
    String generateHtml(MailInfo mailInfo);
}
