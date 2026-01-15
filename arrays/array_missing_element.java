public class array_missing_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int xor1=0;
        int xor2=0;
        for(int i=0;i<arr.length;i++){
            xor1=xor1^(i+1);
            xor2=xor2^arr[i];
        }
       int xor3=xor1^xor2;
       System.out.println(xor3);
    }
}
