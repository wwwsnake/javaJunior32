package lesson5;

public class Main2 {
    public static void main(String[] args) {
//        MathOperations.printTypeOfTriangle(4,5,7);
//        MathOperations.printTypeOfTriangle(5,2,9);
//        MathOperations.printTypeOfTriangle(6,5,1);
        double ploshad1 = MathOperations.calculateSquare(5, 2, 6);
        double ploshad2 = MathOperations.calculateSquare(6, 6, 3);
        double ploshad3 = MathOperations.calculateSquare(5,2);
        if (ploshad1 > ploshad2) {
            System.out.println("1>2");
        } else if (ploshad1<ploshad2){
            System.out.println("2>1");
        } else{
            System.out.println("1=2");
        }

    }
}
