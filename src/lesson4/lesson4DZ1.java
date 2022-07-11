package lesson4;

public class lesson4DZ1{
    public static void main(String[] args) {
        int[][] numbers = new int[8][8];
        for (int i = 0; i < numbers.length; i++) {
            for(int j=0;j<numbers[i].length;j++){
                if ((i+j)== numbers.length-1){
                    System.out.print("X");
                } else{
                    System.out.print("-");

                }
            }
            System.out.println();
        }
    }
}
