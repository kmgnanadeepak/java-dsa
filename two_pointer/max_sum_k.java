package two_pointer;

public class max_sum_k {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 1, 8, 7 };
        int l = 0, r = 0, k = 3, max = 0, sum = 0;
        for (r = 0; r < arr.length; r++) {
            sum = sum + arr[r];
            if (r - l == 3) {
                sum = sum - arr[l];
                l++;
            }
            if (r - l + 1 == k) {
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
