import java.util.*;
public class FlipCoin {
    public static void main(String[] args) {

        double Heads=0;
        double Tails=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Number of times to flip a coin :- ");
        int a= sc.nextInt();

        for (int i=1;i<=a;i++)
        {
            if (Math.random()<0.5)
            {
                Tails++;
            }
            else
            {
                Heads++;
            }
        }
        double c,d;
        c=(double)(Heads/a)*100;
        d=(double) (Tails/a)*100;
        System.out.println("Number of times Heads occurs is "+Heads);
        System.out.println("Number of times Tails occurs is "+Tails);

        System.out.println("percentage of the Head occurs is "+c+ "%");
        System.out.println("percentage of the Tails occurs is "+d+ "%");
    }
}