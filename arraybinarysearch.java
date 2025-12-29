public class arraybinarysearch {
    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 6, 8, 10, 16};
        int key = 10;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("num found");
                return;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("num not found");
    }
}
