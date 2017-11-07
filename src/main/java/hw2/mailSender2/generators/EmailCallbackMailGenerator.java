package hw2.mailSender2.generators;

import hw2.mailSender2.MailCode;
import hw2.mailSender2.MailInfo;

@MailCode(2)
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "<html> don't call use we call you</html>";
    }
}
