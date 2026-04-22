class shapes{
    int length;
    int breadth;

public void calculate(){
     System.out.println("area is:"+ (length*breadth));
}
}
class Rectangle{
    public static void main(String args[]){
        shapes obj1=new shapes();
        obj1.length=18;
        obj1.breadth=12;
        obj1.calculate();
    }
}