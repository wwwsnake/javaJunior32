package lesson11.Matrix_DZ;

public class Main {
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};


        double[][] matrix2 = {{4, 4, 4},
                {5, 5, 5},
                {6, 6, 6}};
        Matrix a = new Matrix(matrix1);
        Matrix b = new Matrix(matrix2);

        //a - неявный параметр (внутри метода будет this)
        //b - явный - будет как otherMatrix
        System.out.println("DETERMINANT");
        System.out.println(b.determinant());

        IMatrix resultAdd = a.add(b);
        System.out.println("ADD");
        resultAdd.printToConsole();

        IMatrix resultSub = a.sub(b);
        System.out.println("SUB");
        resultSub.printToConsole();

        IMatrix resultMul = a.mul(b);
        System.out.println("MUL");
        resultMul.printToConsole();


        IMatrix resultMulValue = a.mul(3.5);
        System.out.println("MulValue");
        resultMulValue.printToConsole();

        IMatrix resultTranspose = b.transpose();
        System.out.println("Transpose");
        resultTranspose.printToConsole();

        System.out.println("FillMatrix");
        b.fillMatrix(2.0);

        System.out.println("IsNullMatrix");
        System.out.println(a.isNullMatrix());

        System.out.println("IsIdentityMatrix");
        System.out.println(a.isIdentityMatrix());

        System.out.println("IsSquareMatrix");
        System.out.println(a.isSquareMatrix());

    }
}

