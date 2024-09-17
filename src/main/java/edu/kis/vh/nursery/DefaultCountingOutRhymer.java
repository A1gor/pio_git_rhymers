package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int EMPTY = -1;

    private final int[] numbers = new int[SIZE];

    public int getTotal(){
        return total;
    }

    private int total = EMPTY;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public void setTotal(int total){
        this.total = total;
    }

    protected boolean callCheck() {
            return total == EMPTY;
        }
    public boolean isFull() {
                return total == 11;
            }
        
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }
            
    protected int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
