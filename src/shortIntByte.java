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


    }

    public static void floatDouble() {
        int pound = 99;
        double kg = .45359237 * pound;
        System.out.println("Weight in kg is :- " + kg);
    }

    public static void unicode() {
        char ch = '\u00AE';
        System.out.println("Surprise char : " + ch);
    }

    public static void operator()
    {
        double d1=20d;
        double d2=80d;
        double add=(d1+d2)*25;
        double rem=add%40;
        if(rem<=20)
            System.out.println("Test was over the limit");
    }
}
