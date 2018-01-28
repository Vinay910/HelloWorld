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
        System.out.println("Result in cm :- " + calcFeetAndInches(12, 11));
        System.out.println("Result in cm :- " + calcFeetAndInches(9));
        switching('b');
        forLoop(20000.0);
        forLoopReverse(20000.0);
        TotalPrime(1000);
        System.out.println("Number is an Even Number? " + isEvenNumber(10));
        totalEvenNumber(1,100);

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

    private static float calcFeetAndInches(float feet, float Inches) {
        if (feet >= 0 && Inches >= 0 && Inches <= 12) {
            return (float) ((feet * 12 * 2.54) + (Inches * 2.54));
        } else {
            return -1;
        }
    }

    private static float calcFeetAndInches(float Inches) {
        if (Inches >= 0) {
            float feet = (int) Inches / 12;
            float remInches = (int) Inches % 12;
            return calcFeetAndInches(feet, remInches);
        } else {
            return -1;
        }
    }

    private static void switching(char ch) {
        switch (ch) {
            case 'a':
            case 'A':
                System.out.println("Found A");
                break;
            case 'b':
            case 'B':
                System.out.println("Found B");
                break;
            case 'c':
            case 'C':
                System.out.println("Found C");
                break;
            case 'd':
            case 'D':
                System.out.println("Found D");
                break;
            case 'e':
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Found nothing");
                break;
        }
    }

    private static void forLoop(double sum) {
        for (double i = 2; i <= 8; i++) {
            System.out.println("Interest on " + sum + " @ " + i + " is: " + String.format("%.2f", sum * (i / 100)));
        }
    }

    private static void forLoopReverse(double sum) {
        for (double i = 8; i >= 2; --i) {
            System.out.println("Interest on " + sum + " @ " + i + " is: " + String.format("%.2f", sum * (i / 100)));
        }
    }

    private static boolean forPrime(int prime) {
        if (prime == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(prime); i++) {
            System.out.println("Looping " + i);
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void TotalPrime(int Number) {
        for (int i = 2; i <= Number; i++) {
            if (forPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    private static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void totalEvenNumber(int Number,int finalNumber)
    {
        int counter=0;
        while(Number<=finalNumber)
        {
         if(isEvenNumber(Number))
         {
             System.out.println(Number+" is a Even Number");
             Number++;
             counter++;
             if(counter==10)
             {
                 System.out.println("Existing loop");
                 break;
             }

         }
         else
         {
             Number++;
             continue;
         }
        }
    }
}

