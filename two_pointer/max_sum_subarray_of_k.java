package two_pointer;

public class max_sum_subarray_of_k {
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2},k=3;
        int max=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                 sum=sum+arr[j];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
