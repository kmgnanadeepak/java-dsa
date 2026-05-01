package practice;

public class array_sorted_check {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8,9,12,11},count=0;
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            count++;
        }
    }
     if(count==0){
            System.out.println("sorted");
            return;
        }
    System.out.println("not sorted");
    }
}
