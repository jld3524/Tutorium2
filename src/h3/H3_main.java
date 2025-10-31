package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 210;
        int j = 102;
        int k = -10;

        boolean expr1 = i > j;
        boolean expr2 = i > 200;
        boolean expr3 = j > 100;

        if (expr1 && !expr2 && !expr3) {
            k = 1;
        } else if (expr1 && expr2 && !expr3) {
            k = 2;
        } else if (expr1 && expr2 && expr3) {
            k = 3;
        } else if (!expr1 && !expr2 && !expr3) {
            k = 4;
        } else {
            k = -10;
        }

        System.out.println("Werte:  k = " + k);
    }
}

