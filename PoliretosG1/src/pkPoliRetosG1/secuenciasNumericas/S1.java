package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int a = 0, b = 1, c, repeticiones,i = 1;
            String secuencia = "";

            System.out.println("Ingrese el numero de repeticiones: ");
            repeticiones = leer.nextInt();
            
            System.out.println("Bucle For");
            
            for (i = 1; i <= repeticiones; i++) {
                if (i == 1) {
                    secuencia += "0 1 ";
                }
                c = a + b;
                a = b;
                b = c;
                if (i == repeticiones)
                    secuencia += c;
                else
                    secuencia += c + " ";
            }
            System.out.println(secuencia);

            System.out.println("Bucle while");
            
            i = 1;
            secuencia = "";
            a = 0;
            b = 1;
            while (true) {
                
                if (i == 1) {
                    secuencia += "0 1 ";
                }

                c = a + b;
                a = b;
                b = c;
                i++;
                if ((i - 1) == repeticiones){
                    secuencia += c;
                    break;
                }else
                    secuencia += c + " ";
            }
            System.out.println(secuencia);
            
            System.out.println("Bucle do while");

            i = 1;
            secuencia = "";
            a = 0;
            b = 1;
            do {
                if (i == 1) {
                    secuencia += "0 1 ";
                }

                c = a + b;
                a = b;
                b = c;
                if (i == repeticiones){
                    secuencia += c;
                    break;
                }else
                    secuencia += c + " ";
                i++;    
            } while (true);

            System.out.println(secuencia);

            leer.close();
        }
    }
}
