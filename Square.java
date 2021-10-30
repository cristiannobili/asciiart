public class Square extends Shape {
   

    public Square(int rows) {
        this.rows = rows;
    }

    protected Row generateRow(int row) {
        return new Row(1, 5);
    }

    public static void main(String... args) {
        Square square = new Square(5);
        square.render();
    }
}