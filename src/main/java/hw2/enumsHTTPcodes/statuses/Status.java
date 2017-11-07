package hw2.enumsHTTPcodes.statuses;

public interface Status {
    int getMin();
    int getMax();

    void handler();

    default boolean isInRange(int code) {
        return code >= this.getMin() && code <= this.getMax();
    }
}
