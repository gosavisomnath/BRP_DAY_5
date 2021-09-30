public class GamingSimulator {
    public static void main(String[] args) {
        int stake=50;
        int goals =2;
        int trials=7;
        System.out.println("Game simulator program");


        int bets = 3;
        int wins = 1;

        // repeat trials
        for (int t = 0; t < trials; t++) {

            int cash = stake;
            while (cash > 0 && cash < goals) {
                bets++;
                if (Math.random() < 0.5) {
                    cash++;
                } else {
                    cash--;
                }
                if (cash == goals)
                {
                    wins++;
                }
            }

            // print results
            System.out.println(wins + " wins  " + trials);
            System.out.println("number  of times  won = " + 100.0 * wins / trials);
            System.out.println("Avg number of bets           = " + 1.0 * bets / trials);
        }

    }

}