package two_pointer;

public class maxsubarray {
    public static void maxsub(){
        int arr[]={2,4,6,8,9};
            for(int i=0;i<=arr.length-1;i++){
                for(int j=i;j<=arr.length-1;j++){
                    System.out.print("["+arr[i]+","+arr[j]+"]");
                }
                System.out.println(" ");
            }
    }
    public static void main(String[] args) {
        maxsub();
    }
}
