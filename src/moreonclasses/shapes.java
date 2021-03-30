package moreonclasses;
import java.util.Scanner;
import java.lang.Math.*;
class shapes {
    int width;

    void area() {

    }
}
//your code goes here
class Square extends shapes{
    public Square(int width){
        this.width = width;
    }

    public void area(){
        int area = this.width * this.width;
        System.out.println(area);
    }
}

class Circle extends shapes{
    private double width;

    public Circle(int width){
        this.width = width;
    }

    public void area(){
        System.out.println((double)Math.PI * this.width * this.width);
    }
}

class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}