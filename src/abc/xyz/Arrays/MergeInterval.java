package abc.xyz.Arrays;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeInterval {

    public static class Interval {
        int start;
        int end;

        private Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }


        public Interval [] mergeIntervals(Interval [] intervals)
        {
            Arrays.sort(intervals, new Comparator<Interval>() {
                @Override
                public int compare(Interval o1, Interval o2) {
                    return Integer.compare(o1.start, o2.start);
                }
            });

            Stack<Interval> stack = new Stack<>();
            stack.push(intervals[0]);

            for (int i =1; i<intervals.length; i++)
            {
                Interval top = (Interval) stack.peek();
                if (top.end > intervals[i].start)
                {
                    if (top.end < intervals[i].end)
                        top.end = intervals[i].end;
                }
                else
                    stack.push(intervals[i]);

            }
            Interval [] mergedInterval = new Interval[stack.size()];
            int i = 0;
            while (!stack.isEmpty())
            {
                mergedInterval[i] = (Interval) stack.pop();
            }
            return mergedInterval;

        }


    public static void main(String[] args) {
        MergeInterval obj = new MergeInterval();
        Interval [] intervals = new Interval[4];
        intervals[0] = new Interval(6, 8);
        intervals[1] = new Interval(1, 9);
        intervals[2] = new Interval(2,4);
        intervals[3] = new Interval(4, 7);

        Interval [] merged = obj.mergeIntervals(intervals);
        System.out.print("[");
        for (int i=0; i<merged.length; i++)
        {
            System.out.print("(" + merged[i].start + ","+merged[i].end + ") ");
        }
        System.out.print("]");
    }
}