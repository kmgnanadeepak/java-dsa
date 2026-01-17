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

    
    static int count1=0;
    public static void even(){
        if(count1>20){
            return;
        }
        System.out.println(count1);
        count1=count1+2;
        even();
    }

    static int count2=1;
    public static void odd(){
        if(count2>20){
            return;
        }
        System.out.println(count2);
        count2=count2+2;
        odd();
    }


    public static void main(String[] args) {
       odd();
    }
}
