public class arraymaxsubarray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                int first=arr[i];
                int last=arr[j+1];
                System.out.print("["+first+","+last+"]");
                last++;
            }
            System.out.println(" ");
        }
    }
}
