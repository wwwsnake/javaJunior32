package lesson11.Matrix_DZ;

public class Main {
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}};


        double[][] matrix2 = {{4, 4, 4, 4},
                {5, 5, 5, 5},
                {6, 6, 6, 6}};
        Matrix a = new Matrix(matrix1);
        Matrix b = new Matrix(matrix2);

        //a - неявный параметр (внутри метода будет this)
        //b - явный - будет как otherMatrix
        IMatrix result = a.add(b);
        result.printToConsole();
    }
}

