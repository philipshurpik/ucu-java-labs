package hw2.mailSender2;


import com.sun.xml.internal.txw2.IllegalAnnotationException;
import hw2.mailSender2.generators.MailGenerator;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MailSender2 {

    private Map<Integer, MailGenerator> generatorMap = new HashMap<>();

    @SneakyThrows
    public MailSender2() {
        Reflections scanner = new Reflections("hw2.mailSender2.generators");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);

        for (Class<? extends MailGenerator> mailGenerator : classes) {
            if (!Modifier.isAbstract(mailGenerator.getModifiers())) {
                MailCode annotation = mailGenerator.getAnnotation(MailCode.class);
                if (annotation == null) {
                    throw new IllegalAnnotationException(mailGenerator.getSimpleName() + " should implement MailCode annotation");
                }
                int key = mailGenerator.getAnnotation(MailCode.class).value();
                if (generatorMap.containsKey(key)) {
                    throw new IllegalAnnotationException(mailGenerator.getSimpleName() + " has duplicate MailCode key " + key + " with " + generatorMap.get(key).getClass().getSimpleName());
                }
                generatorMap.put(key, mailGenerator.newInstance());
            }
        }
    }

    public void sendMail(MailInfo mailInfo) {
        MailGenerator mailGenerator = generatorMap.get(mailInfo.getMailCode());
        if (mailGenerator == null) {
            throw new IllegalStateException(mailInfo.getMailCode() + " not supported yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html, mailInfo);
    }

    private void send(String html, MailInfo mailInfo) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("sending to ").append(mailInfo.getClient().getName()).append('\n').append(html));
    }
}
