package two_pointer;

public class max_consec_ones_III {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0},k=2;
        int l=0,r=0,maxlen=0,zeroes=0;
        for(r=0;r<arr.length;r++){
            if(arr[r]==0){
                zeroes+=1;
            }
            while(zeroes>k){
                if(arr[l]==0)
                    zeroes--;
                    l++;
                
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        System.out.println(maxlen);
    }
}
