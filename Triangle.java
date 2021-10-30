public class Triangle extends Shape{
    public Triangle(int rows) {
        this.rows = rows;
    }

    protected Row generateRow(int row) {
        int stars = row + 1;
        int spaces = this.rows - stars;
        return new Row(spaces, stars);
    }

    public static void main(String... args) {
        Triangle shape = new Triangle(20);
        shape.render();
    }
}
