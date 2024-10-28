public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(10,10);
        matrix.setColumn(4,"5, 5, 5, 5, 5");
        matrix.setColumn(8, "9, 9, 9, 9, 9");
        matrix.prettyPrint();

    }
}