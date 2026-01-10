public class arraysecondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,5,7,7};
        int seclargest=-1,largest=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
                seclargest=arr[i-1];
            }
        }
        System.out.println(largest);
        System.out.println(seclargest);
    }
}
