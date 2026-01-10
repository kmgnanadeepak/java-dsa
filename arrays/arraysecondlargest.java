public class arraysecondlargest {
    public static void main(String[] args) {
        int arr[]={9,2,5,7,7};
        int seclargest=-1,largest=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclargest&&arr[i]!=largest){
                seclargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(seclargest);
    }
}
