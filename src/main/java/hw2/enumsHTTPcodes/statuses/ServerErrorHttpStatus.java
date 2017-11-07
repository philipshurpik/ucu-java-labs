package hw2.enumsHTTPcodes.statuses;

import lombok.Getter;

@Getter
public class ServerErrorHttpStatus implements Status {
    int min = 500;
    int max = 599;

    public void handler() {
        System.out.println("Server error status");
    }
}
