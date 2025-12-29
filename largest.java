public class largest {
    public static void main(String[] args) {
        int arr[]={1,2,6,90,5};
        int i;
        int largest=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest:"+largest);
    }
}
