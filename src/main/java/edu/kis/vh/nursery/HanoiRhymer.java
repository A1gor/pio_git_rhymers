package edu.kis.vh.nursery;

/**
 * HanoiRhymer extends DefaultCountingOutRhymer.
 * It tracks the total number of rejected inputs.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Total number of rejected inputs.
     */
    private int totalRejected = 0;

    /**
     * Reports the total number of rejected inputs.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Counts the given value into the rhymer.
     *
     * @param in the value to be counted in.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
