public class arraysecondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,5,7,7};
        int seclargest=0,largest = arr[arr.length - 1];
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=largest){
                seclargest=arr[i];
                break;
            }
        }
        System.out.println(seclargest);
    }
}
