public class arrays_sorted_union {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,4,5};
        int arr2[]={2,4,6,8};
        int newarr[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(newarr[i]==arr1[i] || newarr[i]==arr2[j]){
                        continue;
                    }
                newarr[i]=arr1[i];
                }
            }
        }
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }
    }
}
