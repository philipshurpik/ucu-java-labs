package hw2.enumsHTTPcodes;

import hw2.enumsHTTPcodes.statuses.*;

import java.util.function.Supplier;

public enum HttpStatus {
    INFO(InfoHttpStatus::new), SUCCESS(SuccessHttpStatus::new), REDIRECT(RedirectHttpStatus::new),
    CLIENT_ERROR(ClientErrorHttpStatus::new), SERVER_ERROR(ServerErrorHttpStatus::new);

    private final Supplier<Status> constructor;

    HttpStatus(Supplier<Status> constructor) {
        this.constructor = constructor;
    }

    public static Status findByHttpCode(int code) {
        HttpStatus[] statuses = values();
        for (HttpStatus httpStatus : statuses) {
            Status status = httpStatus.get();
            if (status.isInRange(code)) {
                return status;
            }
        }
        throw new RuntimeException(code + " not supported");
    }

    Status get() {
        return constructor.get();
    }
}
