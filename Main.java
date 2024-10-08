import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your a:");
        int a = scanner.nextInt();
        System.out.println("Write your a:");
        int b = scanner.nextInt();
        System.out.println("Write your C:");
        int c = scanner.nextInt();
        System.out.println("Before: ");
        System.out.println("A: " + a +", B: " + b + ", C: " + c);
        int temp =0;
        if(a < b && a < c) {

        } if(a > b) {
            temp = b;
            b = a;
            a = temp;
        } if(b > c) {
            temp = b;
            b = c;
            c = temp;
        } if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("After:");
        System.out.println("A: " + a +", B: " + b + ", C: " + c);
    }
}