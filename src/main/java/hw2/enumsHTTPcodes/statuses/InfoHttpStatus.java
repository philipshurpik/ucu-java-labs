package hw2.enumsHTTPcodes.statuses;

import lombok.Getter;

@Getter
public class InfoHttpStatus implements Status {
    int min = 100;
    int max = 199;

    public void handler() {
        System.out.println("Info status");
    }
}
