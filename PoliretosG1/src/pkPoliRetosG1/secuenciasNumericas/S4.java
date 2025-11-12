package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args){
        try(Scanner leer = new Scanner(System.in)){
            int i;
            System.out.println("Ingrese el numero de repeticiones: ");
            int repeticiones = leer.nextInt();
            leer.close();
            
            int a = 0,b = 1,c,aux = 0;
            String secuencia = "";

            System.out.println("Bucle For");
            
            for (i = 1; i <= repeticiones; i++){
                aux += 2;
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
            }

            System.out.println(secuencia);

            a = 0;
            b = 1;
            aux = 0;
            i = 1;
            secuencia = "";
            System.out.println("Bucle While");
            while (i <= repeticiones) {
                aux += 2;
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
                i++;
            }
            
            System.out.println(secuencia);

            a = 0;
            b = 1;
            aux = 0;
            i = 1;
            secuencia = "";
            System.out.println("Bucle Do While");
            do {
                aux += 2;
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
                i++;
            } while (i <= repeticiones);
            
            System.out.println(secuencia);
        }
    }
}
