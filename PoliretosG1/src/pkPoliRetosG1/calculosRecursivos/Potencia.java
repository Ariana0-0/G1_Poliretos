package pkPoliRetosG1.calculosRecursivos;

public class Potencia {

public static long conFor(int a, int b){
    long resultado = 1;
    for(int i = 0; i < b; i++){
        resultado *= a;
    }
    return resultado;

}
public static long conWhile(int a, int b){
    long resultado = 1;
    int i = 0;
    while(i < b){
        resultado *= a;
        i++;
    }
    return resultado;
}
public static long conDoWhile(int a, int b){
    long resultado = 1;
    int i = 0;
    do{
        resultado *= a;
        i++;
    }while(i < b);
    return resultado;  
 }

}
