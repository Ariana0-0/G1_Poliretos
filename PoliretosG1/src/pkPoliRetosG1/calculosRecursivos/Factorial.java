package pkPoliRetosG1.calculosRecursivos;

public class Factorial {
    public static long conFor(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static long conWhile(int n) {
        long resultado = 1;
        int i = 2;
        while (i <= n) {
            resultado *= i;
            i++;
        }
        return resultado;
    }

    public static long conDoWhile(int n) {
        long resultado = 1;
        int i = 2;
        if (n >= 2) {
            do {
                resultado *= i;
                i++;
            } while (i <= n);
        }
        return resultado;
    }


}