package Point_Challenge;

public class Point {

    private int x;
    private int y;

    //Constructors
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getter & Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Methods
    public double distance(){
        return distance(0,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }

}
