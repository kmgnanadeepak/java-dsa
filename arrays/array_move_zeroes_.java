public class array_move_zeroes_ {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
