public class twosum {
    public static void main(String[] args) {
        
    int arr[]={2,6,5,8,11};
    for(int i=0;i<arr.length;i++){
        if(arr[i]+arr[i+1]==14){
            System.out.println("["+arr[i]+arr[i+1]+"]");
        }  
        else{
            System.out.println("target cant be found");
        } 
     }
    }
}
