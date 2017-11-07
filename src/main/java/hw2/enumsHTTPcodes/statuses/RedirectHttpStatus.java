package hw2.enumsHTTPcodes.statuses;

import lombok.Getter;

@Getter
public class RedirectHttpStatus implements Status {
    int min = 300;
    int max = 399;

    public void handler() {
        System.out.println("Redirect status");
    }
}
