package pkPoliRetosG1.calculosRecursivos;

public class Suma {
    
public static int conFor(int a, int b) {
    int resultado = a;
    for (int i = 0; i < b; i++) {
        resultado++;
    }
    return resultado;
}

public static int conWhile(int a, int b) {
    int resultado = a;
    int contador = 0;
    while (contador < b) {
        resultado++;
        contador++;
    }
    return resultado;
}
public static int conDoWhile(int a, int b) {
    int resultado = a;
    int contador = 0;
    do {
        resultado++;
        contador++;
    } while (contador < b);
    return resultado;}

}