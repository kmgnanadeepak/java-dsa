package two_pointer;

public class longest_array_below_sum {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 7, 10};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            String subarray = "";
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                if (sum > 14) {
                    break;
                }
                subarray = subaray+arr[j] + ",";
                System.out.println("["+subarray+"]");
            }
        }
    }
}
