package pkPoliRetosG1.secuenciasNumericas;

public class S11 {
    public static void main(String[] args){
        try(java.util.Scanner leer = new java.util.Scanner(System.in)){
            System.out.println("Ingrese el numero de repeticiones:");
            int repeticiones = leer.nextInt();
            leer.close();
            
            System.out.println("Bucle for");
            String secuencia = "";
            int i, acumulador = 2;

            for (i = 1; i <= repeticiones; i++) {
                if(i == 1){
                    acumulador = 2;
                }else{
                    secuencia += acumulador + " ";
                    acumulador += 2*i;
                }
            }
            System.out.println(secuencia);

            System.out.println("Bucle while");
            secuencia = "";
            i = 1;
            acumulador = 2;
            while (i <= repeticiones) {
                if(i == 1){
                    acumulador = 2;
                }else{
                    secuencia += acumulador + " ";
                    acumulador += 2*i;
                }
                i++;
            }
            System.out.println(secuencia);

            System.out.println("Bucle do while");
            secuencia = "";
            i = 1;
            acumulador = 2;
            do {
                if(i == 1){
                    acumulador = 2;
                }else{
                    secuencia += acumulador + " ";
                    acumulador += 2*i;
                }
                i++;
            } while (i <= repeticiones);
            System.out.println(secuencia);

        }
    }
}
