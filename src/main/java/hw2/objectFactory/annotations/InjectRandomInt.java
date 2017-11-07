package hw2.objectFactory.annotations;

import hw2.mailSender2.MailCode;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@MailCode(1)
public @interface InjectRandomInt {
    int min();
    int max();
}
