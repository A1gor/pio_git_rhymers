package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int INITIAL_TOTAL = -1;
    private final int[] numbers = new int[SIZE];

    public int getTotal() {
        return total;
    }

    public int total = INITIAL_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
}