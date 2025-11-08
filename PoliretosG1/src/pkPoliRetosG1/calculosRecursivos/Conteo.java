package pkPoliRetosG1.calculosRecursivos;

public class Conteo {

    public static void progresivoFor(int a) {
        System.out.println("---Conteo progresivo (for) 1 hasta"+ a + "---");
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }

public static void progresivoWhile(int a) {
        System.out.println("---Conteo progresivo (while) 1 hasta"+ a + "---");
        int i = 1;
        while (i <= a) {
            System.out.println(i);
            i++;
        }
    }

public static void progresivoDoWhile(int a) {
        System.out.println("---Conteo progresivo (do while) 1 hasta"+ a + "---");
        if (a < 1) {
            return;
        }
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= a);
    }



    public static void regresivoFor(int a) {
        System.out.println("---Conteo regresivo (for)"+ a + "hasta 0 ---");
        for (int i = a; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void regresivoWhile(int a) {
        System.out.println("---Conteo regresivo (while)"+ a + "hasta 0 ---");
        int i = a;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }

    public static void regresivoDoWhile(int a) {
        System.out.println("---Conteo regresivo (do while)"+ a + "hasta 0 ---");
        if (a < 0) {
            return;
        }
        int i = a;
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
    }
}
