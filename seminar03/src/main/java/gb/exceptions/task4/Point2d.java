package gb.exceptions.task4;

import java.util.Objects;

public class Point2d {
    private int x;
    private int y;

    public Point2d(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
    return String.format("(%s;%s)",x,y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2d point2d = (Point2d) o;
        return x == point2d.x && y == point2d.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
