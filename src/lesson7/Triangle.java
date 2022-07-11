package lesson7;

public class Triangle {
   private  int a;
   private  int b;
   private  int c;


   //конструктор:
   public Triangle(){

   }
   public  Triangle(int a, int b,int c){
      this.a = a;
      this.b = b;
      this.c = c;
      //вместо 3 сеттеров
   }



   public void setA(int a) {
      this.a = a;
   }

   public void setB(int b) {
      this.b = b;
   }

   public void setC(int c) {
      this.c = c;
   }
   public int perimetr(){   //в скобках ничего не передаем, т.к. метод в том же классе
      return a+b+c;
   }
}
