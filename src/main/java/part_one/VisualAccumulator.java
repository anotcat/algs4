package part_one;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdDraw;

public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }

    public double mean() {
        return total / N;
    }

    public String toString() {
        return "Mean (" + N + "values ):" + String.format("%7.5f", mean());// 7.5f 将mean结果转为保留7位小数的浮点数
    }

    public static void main(String[] args) {
        VisualAccumulator v = new VisualAccumulator(2000, 2000);
        for (int i = 0; i < 2000; i++) {
            v.addDataValue(i);
        }
        new Bag<String>();
        new Queue<Integer>();
        new Stack<Integer>();
    }
}
