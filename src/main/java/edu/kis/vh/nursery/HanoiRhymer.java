package edu.kis.vh.nursery;

/**
 * The HanoiRhymer class extends the defaultCountingOutRhymer class.
 * It adds functionality to count the number of rejected values based on
 * a specific condition: if the value to be added is greater than the current top value in the stack.
 */
public class HanoiRhymer extends defaultCountingOutRhymer {

    /**
     * The total number of rejected values.
     */
    int totalRejected = 0;

    /**
     * Returns the total number of rejected values.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Adds a value to the stack. If the value is greater than the current top value
     * and the stack is not empty, the value is rejected and the rejected count is incremented.
     * Otherwise, the value is added to the stack.
     */

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}