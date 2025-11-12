package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class S9 {
    public static void main(String[] args){
        try(Scanner leer = new Scanner(System.in)){
            System.out.println("Ingrese el numero de repeticiones:");
            int repeticiones = leer.nextInt();
            leer.close();
            
            System.out.println("Bucle for");
            String secuencia = "";
            int i, acumulador = 1;

            for (i = 1; i <= repeticiones; i++) {
                acumulador *= 2;
                secuencia += acumulador + " ";
            }
            System.out.println(secuencia);

            System.out.println("Bucle while");
            secuencia = "";
            i = 1;
            acumulador = 1;
            while (i <= repeticiones) {
                acumulador *= 2;
                secuencia += acumulador + " ";
                i++;
            }
            System.out.println(secuencia);

            System.out.println("Bucle do while");
            secuencia = "";
            i = 1;
            acumulador = 1;
            do {
                acumulador *= 2;
                secuencia += acumulador + " ";
                i++;
            } while (i <= repeticiones);
            System.out.println(secuencia);
        }
    }
}
