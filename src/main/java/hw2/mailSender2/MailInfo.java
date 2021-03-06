package hw2.mailSender2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private int mailCode;

    public MailInfo(int mailCode) {
        this.mailCode = mailCode;
    }
}
