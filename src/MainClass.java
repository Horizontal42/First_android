import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, S;
        System.out.printf("Введите длину катета a:");
        a=in.nextDouble();
        System.out.printf("Введите длину катета b:");
        b=in.nextDouble();
        c=Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        S=(a*b)/2;
        System.out.printf("c=%.2f S=%.2f",c,S);
    }
}
