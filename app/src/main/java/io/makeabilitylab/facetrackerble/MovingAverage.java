package io.makeabilitylab.facetrackerble;

import java.util.LinkedList;
import java.util.Queue;

/*
Simple class to calculate moving average.
*/

public class MovingAverage {
    public Queue<Integer> window = new LinkedList<Integer>();
    public int p;
    public int sum;

    public MovingAverage(int period) {
        assert period > 0 : "Period must be a positive integer";
        p = period;
    }

    public void newNum(int num) {
        sum += num;
        window.add(num);
        if (window.size() > p) {
            sum -= window.remove();
        }
    }

    public int getAvg() {
        if (window.isEmpty()) return 0;
        return sum / window.size();
    }

}
