package pkPoliRetosG1.calculosRecursivos;

public class Multiplicacion {

    public static int conFor(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }
    public static int conWhile(int a, int b) {
        int resultado = 0;
        int contador = 0;
        while (contador < b) {
            resultado += a;
            contador++;
        }
        return resultado;
    }   
    public static int conDoWhile(int a, int b) {
        int resultado = 0;
        int contador = 0;
        if (b == 0) {
            return 0;
        }
        do {
            resultado += a;
            contador++;
        } while (contador < b);
        return resultado;
    }
}
