package hw2.enumsHTTPcodes;

import hw2.enumsHTTPcodes.statuses.Status;

public class HttpService {
    public void handleHttpCode(int code) {
        Status httpStatus = HttpStatus.findByHttpCode(code);
        httpStatus.handler();
    }
}
