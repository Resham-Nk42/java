abstract class Shape{
int dimension1,dimension2;

Shape(int dim1,int dim2){
dimension1=dim1;
dimension2=dim2;
}
abstract void printArea();
}

class Rectangle extends Shape{
Rectangle(int length,int width){
super(length,width);
}

void printArea(){
int area=dimension1 * dimension2;
System.out.println("Area of rectanle is:"+area);
}
}

class Triangle extends Shape{
Triangle(int base,int height){
super(base,height);
}

void printArea(){
double area=0.5*dimension1*dimension2;
System.out.println("Area of triangle is:"+area);
}
}

class Circle extends Shape{
Circle (int radius){
super(radius,0);

}

void printArea(){
double area=Math.PI*dimension1;
System.out.println("Area of Circle is:"+area);
}
}

class show{

public static void main(String args[]){
Shape s;

Rectangle r1=new Rectangle(5,8);
s=r1;
s.printArea();

Triangle t1=new Triangle(9,7);
s=t1;
s.printArea();

Circle c1=new Circle(4);
s=c1;
s.printArea();

}
}