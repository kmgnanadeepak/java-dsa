package recursions;

public class print_numbers {
   static int count=1;
    public static void fun(){
        if(count==11){
            return;
        }
        System.out.print(count+" ");
        count++;
        fun();
    }
    public static void main(String[] args) {
        fun();
    }
}
