package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args){
        try(Scanner leer = new Scanner(System.in)){
            int i;
            System.out.println("Ingrese el numero de repeticiones: ");
            int repeticiones = leer.nextInt();
            leer.close();
            
            System.out.println("Bucle For");
            String secuencia = "";
            for(i = 1; i <= repeticiones; i++){
                if(i % 2 == 0)
                    secuencia += "0 ";
                else
                    secuencia += i + " ";
            }

            System.out.println(secuencia);

            System.out.println("Bucle while");
            secuencia = "";
            i = 1;
            while(true){
                if(i % 2 == 0)
                    secuencia += "0 ";
                else
                    secuencia += i + " ";

                if(i == repeticiones)
                    break;
                i++;
            }
            System.out.println(secuencia);

            System.out.println("Bucle do while");
            secuencia = "";
            i = 1;
            do{
                if(i % 2 == 0)
                    secuencia += "0 ";
                else
                    secuencia += i + " ";
                i++;
            }while(i <= repeticiones);
            System.out.println(secuencia);
        }
    }
}