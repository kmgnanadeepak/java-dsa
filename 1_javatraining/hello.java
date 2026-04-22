import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter telugu marks:");
        int number1 = sc.nextInt();
        System.out.println("Enter english marks:");
        int number2 = sc.nextInt();
        System.out.println("Enter maths marks:");
        int number3 = sc.nextInt();

        System.out.println("\n Number is:" + number);
        System.out.println("Name is:" + name);
        System.out.println("Telugu marks are:" + number1);
        System.out.println("English marks are:" + number2);
        System.out.println("Maths marks are:" + number3);
    }
}
