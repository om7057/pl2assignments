/*Q1.	i) Write a java program to create an abstract class named Shape that contains two integers 
and an empty method named printArea(). Provide three classes named Rectangle, 
Triangle and Circle such that each class extends the class Shape. 
Each class contains only the method printArea() that prints the area of the given shape. 
Also show and demonstrate the difference between overriding and overloading.*/


abstract class Shape{
    int int1;
    int int2;
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(int length, int breadth){
        this.int1=length;
        this.int2=breadth;
    }
    @Override
    void printArea(){
        System.out.println("Area of Rectangle is: "+ (int1*int2));
    }
}

class Triangle extends Shape{
    Triangle(int base,int height){
        this.int1=base;
        this.int2=height;
    }

    @Override
    void printArea(){
        System.out.println("Area of the triangle is :"+(0.5*int1*int2));
    }
}

class Circle extends Shape{
    Circle(int radius){
        this.int1=radius;
    }

    @Override
    void printArea(){
        System.out.println("Area of the circle is :"+(3.14*int1*int1));
    }
}

public class abstract_shape{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5, 4);
        Triangle t=new Triangle(4, 3);
        Circle c=new Circle(5);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}