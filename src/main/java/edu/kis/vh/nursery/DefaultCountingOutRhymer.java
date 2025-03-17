package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_MAX_SIZE = 12;
    public static final int ERROR_VALUE = -1;
    public static final int NUMBERS_FULL_SIZE = 11;
    private final int[] numbers = new int[NUMBERS_MAX_SIZE];

    public int total = ERROR_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_VALUE;
    }

    public boolean isFull() {
        return total == NUMBERS_FULL_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
