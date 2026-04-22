import java.util.*;
class student{
    int number;
    String name;
    int age;
    
    public void print(){
        System.out.println("number:"+number);
        System.out.println("name:"+name);
    }
}
class classes{
public static void main(String args[]){
    student s1=new student();
    s1.name="deepak";
    s1.number=18;
    s1.print();
}
}