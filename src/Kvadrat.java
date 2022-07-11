public class Kvadrat {
    public static void main(String[] args) {
        Shape square = new Shape();
        square.high = 5;
        square.length = 7;
        int p = square.perimetr();
        int s = square.square1();
        int x = p + s;
        System.out.println(x);
    }
}

class Shape {
    int high, length;

    int perimetr() {
        int per = high + length;
        return per;
    }

    int square1() {
        int squ = high * length;
        return squ;
    }
}
