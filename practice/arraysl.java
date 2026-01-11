package practice;
public class arraysl {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,9},fl=arr[0],sl=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fl){
                sl=fl;
                fl=arr[i];
            }
        }
        System.out.println(fl+" "+sl);
    }
}
