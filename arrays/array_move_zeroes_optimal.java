public class array_move_zeroes_optimal {
    public static void main(String[] args) {
        int nums[]={1,0,2,0,3,0,4,0};
           int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }
        for(int i=0;i<nums.length;i++)
            System.out.println(nums[i]);
        
    }
}

