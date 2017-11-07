package hw2.enumsHTTPcodes.statuses;

import lombok.Getter;

@Getter
public class SuccessHttpStatus implements Status {
    int min = 200;
    int max = 299;

    public void handler() {
        System.out.println("Success status");
    }
}
