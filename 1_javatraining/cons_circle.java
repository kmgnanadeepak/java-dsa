import java.util.*;
class cons{
    double radius;
    cons(double r){
        radius=r;
    }
    void display(){
        double area=Math.PI*radius*radius;
        System.out.println("area of circle: "+area);
    }
}
class cons1{
    int length;
    int width;
    cons1(int l,int w){
        length=l;
        width=w;
    }
    void display(){
        int area=length*width;
        System.out.println("area od rectangle : "+area);
    }
}
class cons_circle{
    public static void main(String a[]){
        cons circle=new cons(4);
        cons1 rectangle=new cons1(5,6);
        circle.display();
        rectangle.display();
    }
}