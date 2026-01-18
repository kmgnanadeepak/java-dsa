public class array_maxsub_withk {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,0,1,1,5};
        int target = 4;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum == target){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println(maxLen);
    }
}
