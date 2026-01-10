package practice;

public class largest3sum {
    public static void main(String[] args) {
        int arr[]={5,9,1,8,7};
        int maxlen=0,currlen=0;
        for(int i=0;i<arr.length-3;i++){
                currlen=arr[i]+arr[i+1]+arr[i+2];
                if(currlen>maxlen){
                    maxlen=currlen;
                }
        }
        System.out.println(maxlen);
    }
}
