package hw2.mailSender2;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.fluttercode.datafactory.impl.DataFactory;

@Slf4j
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender2 mailSender = new MailSender2();
        DataFactory dataFactory = new DataFactory();

        while (true) {
            MailInfo mailInfo = new MailInfo(dataFactory.getNumberBetween(1, 4));
            mailInfo.setClient(new Client(dataFactory.getName(), dataFactory.getNumberBetween(18, 60)));
            try {
                mailSender.sendMail(mailInfo);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
            Thread.sleep(1000);
        }
    }
}
