package practice;

public class max_len_k {
    public static void main(String[] args) {
        int arr[]={5,9,1,8,7},k=2,max=0,sum=0;
        for(int i=0;i<arr.length-3;i++){
            sum=arr[i]+arr[i+1]+arr[i+2];
              if(sum>max){
                max=sum;
              } 
        }
        System.out.println(max);
    }
}
