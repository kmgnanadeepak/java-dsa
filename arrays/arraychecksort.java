public class arraychecksort {
    public static void main(String[] args) {
        int arr[]={1,2,4,8,8};
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                System.out.println("not sorted");
            return;
        }
    }
        System.out.println("sorted");
    }
}
