public class shortIntByte {

    public static void main(String[] a) {
        floatDouble();
        int int1 = 90000;
        byte byte1 = 127;
        short short1 = 30000;
        long long1 = 50000 + (10 * (byte1 + short1 + int1));
        System.out.println(long1);
        unicode();
        operator();
        System.out.println("Final Score is : " + score(true, 10000, 8, 200));
        System.out.println("Final Score is : " + score(true, 1000, 5, 100));
        System.out.println("Final Score is : " + score(false, 10000, 8, 200));
        displayHighScorePosition("Vinayak", 1500);
        displayHighScorePosition("Vinay", 900);
        displayHighScorePosition("Vinu", 400);
        displayHighScorePosition("Vin", 50);
    }

    private static void floatDouble() {
        int pound = 99;
        double kg = .45359237 * pound;
        System.out.println("Weight in kg is :- " + kg);
    }

    private static void unicode() {
        char ch = '\u00AE';
        System.out.println("Surprise char : " + ch);
    }

    private static void operator() {
        double d1 = 20d;
        double d2 = 80d;
        double add = (d1 + d2) * 25;
        double rem = add % 40;
        if (rem <= 20)
            System.out.println("Test was over the limit");
    }

    private static int score(boolean gameOver, int score, int lvl, int bonus) {
        if (gameOver) {
            return (score + (lvl * bonus));
        }
        return 0;
    }

    private static void displayHighScorePosition(String name, int highScore) {
        int pos = calculateHighScorePosition(highScore);
        System.out.println(name + " managed to get into position " + pos);
    }

    private static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score <= 999) {
            return 2;
        } else if (score >= 100 && score <= 499) {
            return 3;
        } else {
            return 4;
        }
    }
}
