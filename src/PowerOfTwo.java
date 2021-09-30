import java.util.Scanner;
public class PowerOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = 0;
        int i = 1;

        System.out.println("Enter the number for Calculate power of 2");
        Num = sc.nextInt();
        for (i = 1; i <= Num; i++) {
            double power = Math.pow(2, i);
            System.out.println("power of Two= " + power);
        }
        System.out.println();
    }
}