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
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point p : points){
            if(p.x > x) x = p.x;
            if(p.y > y) y = p.x;
        }

        return new Point(x, y);
    }

    public String[] solution(int[][] line){
        List<Point> points = new ArrayList<Point>();
        for(int i=0; i<line.length-1; i++){
            for(int j=i+1; j<line.length; j++){
                Point intersectionPoint = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if(intersectionPoint!=null){
                    points.add(intersectionPoint);
                }
            }
        }

        String[] result = new String[10];
        return result;
    }
}
