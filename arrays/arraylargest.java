public class arraylargest {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,2,7,50};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
