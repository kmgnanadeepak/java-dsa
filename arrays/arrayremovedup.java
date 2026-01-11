public class arrayremovedup {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
               }
            }
           System.out.println(arr[i]);
        }
    }
}
