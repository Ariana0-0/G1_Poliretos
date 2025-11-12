package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class S5 {
         public static void main(String[] args){
        try(Scanner leer = new Scanner(System.in)){
            System.out.println("Ingrese el numero de repeticiones: ");
            int repeticiones = leer.nextInt();
            leer.close();
            
            System.out.println("Bucle for");
            String secuencia = "";
            int contadorDivisores = 0;
            
            /*
            //boolean aumentaPrimo = false;
            for (int i = 1; i <= repeticiones; i++) {
                contadorDivisores = 0;
                //aumentaPrimo = false;
                System.out.println("Se entra al for");
                for (int j=1; j <= i; j++){
                    if(i % j == 0)
                        contadorDivisores++;
                    
                    if((contadorDivisores == 2)&& (i == j)){
                        secuencia += i + " ";
                        //aumentaPrimo = true;
                    }
                }
                //if (aumentaPrimo==false)
                  //  i -= 1;    
                }
                System.out.println(secuencia);
            */
        
            System.out.println("Bucle while");
            secuencia = "";
            int i = 1, j = 1, auxiliar = 1;
            while (i <= (repeticiones+1)) {
                j = 1;
                contadorDivisores = 0;
                while (j <= auxiliar) {
                    if(auxiliar % j == 0)
                        contadorDivisores++;
                    j++;
                }
                if(i == 1)
                    i++;
                if(contadorDivisores == 2){
                    secuencia += auxiliar + " ";
                    i++;
                }
                auxiliar++;
            }
            System.out.println(secuencia);

            System.out.println("Bucle do while");
            secuencia = "";
            i = 1;
            j = 1;
            auxiliar = 1;
            do {
                j = 1;
                contadorDivisores = 0;
                do {
                    if(auxiliar % j == 0)
                        contadorDivisores++;
                    j++;
                } while (j <= auxiliar);
                if(i == 1)
                    i++;
                if(contadorDivisores == 2){
                    secuencia += auxiliar + " ";
                    i++;
                }
                auxiliar++;
            } while (i <= (repeticiones+1));
            System.out.println(secuencia);    
        }
    }
}