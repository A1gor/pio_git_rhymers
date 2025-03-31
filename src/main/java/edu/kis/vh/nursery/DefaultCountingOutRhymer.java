package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_MAX_SIZE = 12;
    private static final int DEFAULT_VALUE = -1;
    private static final int ERROR_VALUE = -1;
    private final int[] numbers = new int[NUMBERS_MAX_SIZE];

    private int total = DEFAULT_VALUE;

    public int getTotal(){
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == NUMBERS_MAX_SIZE - 1;
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
