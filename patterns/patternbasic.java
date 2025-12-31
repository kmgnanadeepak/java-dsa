public class patternbasic {
    public static void patternflat(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void patternhalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void patternreversehalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void patterniloop(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void patternjloop(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

     public static void patterniloopreverse(int n){
          for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void patternjloopreverse(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternfullpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=i+2;j<=i;j=j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        patternfullpyramid(8);
    }
}
