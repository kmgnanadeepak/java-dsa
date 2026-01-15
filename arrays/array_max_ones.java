public class array_max_ones {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,1,1,0,1};
        int count=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count=count+1;
            }
                if(arr[i]==0){
                    count=0;
                }
                if(count>max){
                    max=count;
                }
        }
        System.out.println(max);
    }
}
