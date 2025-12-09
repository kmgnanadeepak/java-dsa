public class linearseach {
    public static void main(String[] args) {
        int arr[]={18,1,45,17,33};
        int target=17;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target+"found ");
                return;
            } 
        }
            System.out.println("target not found");
        
    }
}

