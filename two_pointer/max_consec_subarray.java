package two_pointer;

public class max_consec_subarray {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1},count=0,maxcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            if(arr[i]==0){
                count=0;
            }
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
