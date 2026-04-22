public class simple_if {
    public static void simple_if(){
        int a=10;
        if(a>5){
            System.out.println("a is greater than 5");
        }   
    }

    public static void nested_if(){
        int a=10;
        int b=20;
        if(a>5){
            if(b>15){
                System.out.println("a is greater than 5 and b is greater than 15");
            }
        }
    }

     public static void multiple_if(){
        int a=10;
        if(a>5){
            System.out.println("a is greater than 5");
        }if(a==5){
            System.out.println("a is equal to 5");
        }
    }
     public static void if_else(){
        int a=10;
        if(a>5){
            System.out.println("a is greater than 5");
        }else{
            System.out.println("a is less than or equal to 5");
        }
    }

     public static void nested_if_else(){
        int a=10;
        int b=20;
        if(a>5){
            if(b>15){
                System.out.println("a is greater than 5 and b is greater than 15");
            }else{
                System.out.println("a is greater than 5 and b is less than or equal to 15");
            }
        }else{
            System.out.println("a is less than or equal to 5");
        }
    }

     public static void if_else_if(){
        int a=10;
        if(a>5){
            System.out.println("a is greater than 5");
        }else if(a==5){
            System.out.println("a is equal to 5");
        }else{
            System.out.println("a is less than 5");
        }
    }


public static void main(String[] args) {
            simple_if();
            nested_if();
            multiple_if();
            if_else();
            nested_if_else();
            if_else_if();
}

}
