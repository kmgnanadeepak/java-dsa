public class linearsearch {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,6};
        int target=4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("target found at : "+i);
                return;
            }
        }
        System.out.println("not found");
    }
}
