package es.upm.miw.iwvg.ecosystem.practica;


public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt((double) this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    public double distanceBetween(Point point) {
        return Math.sqrt(Math.pow((this.x - point.getX()), 2) + Math.pow((this.y - point.getY()), 2));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}