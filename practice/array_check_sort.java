package practice;

public class array_check_sort {
    public static void main(String[] args) {
        int arr[]={1,6,7,4,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                System.out.println("not sorted");
                return;
            }
        }
        System.out.println("sorted");
    }
}
