package INTERSACTION_ALGORITHM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static class Point {
        public final long x, y;

        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2){
        double x = (double) (b1*c2 - b2*c1) / (a1*b2 - a2*b1);
        double y = (double) (a2*c1 - a1*c2) / (a1*b2 - a2*b1);

        if(x%1 != 0 || y%1 != 0) return null;

        return new Point((long)x, (long)y);
    }

    private Point getMinmumPoint(List<Point> points){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point p : points){
            if(p.x < x) x = p.x;
            if(p.y < y) y = p.y;
        }

        return new Point(x, y);
    }

    private Point getMaximumPoint(List<Point> points){
        return new Point(0, 0);
    }

    public String[] solution(int[][] line){

        String[] result = new String[10];
        return result;
    }
}
