package hw2.enumsHTTPcodes.statuses;

import lombok.Getter;

@Getter
public class ClientErrorHttpStatus implements Status {
    int min = 400;
    int max = 499;

    public void handler() {
        System.out.println("Client error status");
    }
}
