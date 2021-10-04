public class Main {

    public static void main(String[] args) {
        Integer[][] mArray1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] mArray2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        Matrix m1 = new Matrix(mArray1, 3, 3);
        Matrix m2 = new Matrix(mArray2, 3, 3);
        Matrix m3 = m1.sub(m2);
        m3.print();
        System.out.println();
        m3.mul(2).print();
        System.out.println();
        m3.add(2).print();
        System.out.println();
        m3.sub(2).print();
    }

}
