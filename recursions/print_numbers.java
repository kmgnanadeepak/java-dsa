package recursions;

public class print_numbers {
    public static void fun(){
        int count=1;
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
