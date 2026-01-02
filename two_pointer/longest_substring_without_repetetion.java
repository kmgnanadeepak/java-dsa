package two_pointer;

public class longest_substring_without_repetetion{
    public static void main(String[] args) {
        String str="cabdzabcd";
        for(int i=0;i<str.length();i++){
            String sub=" ";
           for(int j=i;j<str.length();j++){
            sub=sub+str.charAt(j);
           }
        }
        System.out.println(sub);
    }
    
}
