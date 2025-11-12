package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args){
        try(Scanner leer = new Scanner(System.in)){
            System.out.println("Ingrese el numero de repeticiones: ");
            int repeticiones = leer.nextInt();
            leer.close();
            int a = 0,b = 1,c,i,aux = 1;
            String secuencia = "";
            
            System.out.println("Bucle For");
            for(i = 1; (i) <= repeticiones; i++){
                if(i == 1)
                    c = a;
                else if(i == 2)
                    c = b;
                else{
                    c = a + b;
                    a = b;
                    b = c;
                }
                secuencia += c + "/" + aux + " ";
                aux += 2;
            }
            System.out.println(secuencia);

            a = 0;
            b = 1;
            aux = 1;
            i = 1;
            secuencia = "";
            System.out.println("Bucle While");
            
            while (i <= repeticiones) {
                if(i == 1)
                    c = a;
                else if(i == 2)
                    c = b;
                else{
                    c = a + b;
                    a = b;
                    b = c;
                }
                secuencia += c + "/" + aux + " ";
                aux += 2;
                i++;
            }

            System.out.println(secuencia);

            a = 0;
            b = 1;
            aux = 1;
            i = 1;
            secuencia = "";
            System.out.println("Bucle Do While");
            do {
                if(i == 1)
                    c = a;
                else if(i == 2)
                    c = b;
                else{
                    c = a + b;
                    a = b;
                    b = c;
                }
                
                secuencia += c + "/" + aux + " ";
                aux += 2;
                i++;
            } while (i <= repeticiones);
            System.out.println(secuencia);
        }
    }
}