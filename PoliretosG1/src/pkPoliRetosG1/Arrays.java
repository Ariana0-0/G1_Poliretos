package pkPoliRetosG1;
import java.util.Random;

public class Arrays extends Persona {


    public Arrays(String nombre1, String nombre2, String apellido1, String apellido2) {
        super(nombre1, nombre2, apellido1, apellido2);
    }

    public void g1_A03dibujarPlanoYFuncionDibujandoConNombre(String nombre1){
        int longitudNombreEnX = nombre1.length();
        int enY = longitudNombreEnX;

        //Plano de Coordenadas
        String[][] planoDeCoordenadas = new String [(longitudNombreEnX+2)][(enY+2)];//+2 Por los indices y linea de separacion
        //Transformacion de String a Arreglo de Caracteres
        char[] arregloNombre = nombre1.toCharArray();
        
        
        
        //lleno la matriz de caracteres ' ' 
        for (int i = 0; i < longitudNombreEnX+2; i++){
            for (int j = 0; j < enY+2; j++){
                planoDeCoordenadas[i][j] = " ";
            }
        }

        //1. Creacion del plano de coordenadas
        int temp; //Temporal para los indices
        //Colocar eje y

        //Valores en Y
        temp = enY;
        System.out.println("Temp: " + temp + " en c: " + ("" + temp).charAt(0));
        for (int i = 0; i < planoDeCoordenadas.length ; i++){
            if (i == planoDeCoordenadas.length-1) planoDeCoordenadas[i][0] = "  ";
            else 
                planoDeCoordenadas[i][0] = " " + temp; //casteo a char dado que es una matriz de strings
                temp = temp - 1;
            
        }

        //Linea de separacion
        for (int i = 0; i < planoDeCoordenadas.length ; i++){
            planoDeCoordenadas[i][1] = "|";
        }

        //Colocar eje x
        for (int i = 2; i < planoDeCoordenadas[0].length; i++){ //empiezo desde la ultima fila y 3ra columna para colocar los indices
            planoDeCoordenadas[planoDeCoordenadas.length-1][i] = "" + (i-1);
        }
        //Linea de separacion
        for (int i = 2; i < planoDeCoordenadas[0].length; i++){ //empiezo desde la penuultima fila y 3ra columna para colocar la linea de separacion
            planoDeCoordenadas[planoDeCoordenadas.length-2][i] = "_";
        }

        //Usando for:
        for (int i = 0; i < nombre1.length(); i++){
            planoDeCoordenadas[(nombre1.length())-i-1][i+2] = "" + arregloNombre[i];
        }
        
        //Usando while
        int k = 0;
        while (k < nombre1.length()){
        	planoDeCoordenadas[(nombre1.length())-k-1][k+2] = "" + arregloNombre[k];
        	k++;
        }

        //Usando do-while
        int w = 0;
        do  {
        	planoDeCoordenadas[(nombre1.length())-w-1][w+2] = "" + arregloNombre[w];
        	w++;
        } while (w < nombre1.length());

        //Se muestra el resultado
        System.out.println("Resultado: ");
        imprimirMatricesString(planoDeCoordenadas);
    }

    public void g1_A04formarXConNombreyApellido(String nombre1, String apellido1){

        int tamanio = (nombre1.length()>apellido1.length())? nombre1.length() : apellido1.length();

        char [][] nombreXApellido = new char[tamanio][tamanio];

        char[] arrNombre = nombre1.toCharArray();
        char[] arrApell = apellido1.toCharArray();
            
        //Usando for
        for (int i = 0; i < nombre1.length(); i++){
            nombreXApellido[i][i] = arrNombre[i];
        }
        for (int i= 0; i < apellido1.length(); i++){
            nombreXApellido[i][tamanio-i-1] = arrApell[i];
        }

        //Usando while
        int k = 0;
        while(k < nombre1.length()){
            nombreXApellido[k][k] = arrNombre[k];
            k++;
        }
        k = 0 ;
        while(k < apellido1.length()){
            nombreXApellido[k][tamanio-k-1] = arrApell[k];
            k++;
        }

        //Usando do-while
        int w = 0;
        do{
            nombreXApellido[w][w] = arrNombre[w];
            w++;
        }while (w < nombre1.length());
        
        w = 0;
        do{
            nombreXApellido[w][tamanio-w-1] = arrApell[w];
            w++;
        }while (w < apellido1.length());


        //Se muestra el resultado
        System.out.println("RESULTADO: ");
        imprimirMatricesChar(nombreXApellido);
    }

    public void g1_A05generarMatrizConNombreAleatorio(String nombre1, String nombre2, String apellido1, String apellido2) throws InterruptedException{
        
        String nombreCompleto = nombre1 + nombre2 + apellido1 + apellido2;

        char[] arregloNombreCompleto = nombreCompleto.toCharArray();

        int tamanio = 10;

        Random random = new Random();

        char[][] matrizCaracteresAleatorios = new char[tamanio][tamanio];

        //Usando for:
        for (int i = 0; i < nombreCompleto.length(); i++){

            int filaRand = random.nextInt(tamanio);
            int colRand = random.nextInt(tamanio);

            char letra = arregloNombreCompleto[i];

            if (matrizCaracteresAleatorios[filaRand][colRand] == '\0'){
                matrizCaracteresAleatorios[filaRand][colRand] = letra;
            } else {
                matrizCaracteresAleatorios[filaRand][colRand] = '*';
            }
            System.out.println("-------------------------");
            imprimirMatricesChar(matrizCaracteresAleatorios);
            System.out.println("-------------------------");
            Thread.sleep(200);
            
        }

        // //Usando while:
        // int k = 0;
        // while (k < nombreCompleto.length()){
        //     int filaRand = random.nextInt(tamanio);
        //     int colRand = random.nextInt(tamanio);

        //     char letra = arregloNombreCompleto[k];

        //     if (matrizCaracteresAleatorios[filaRand][colRand] == '\0'){
        //         matrizCaracteresAleatorios[filaRand][colRand] = letra;
        //     } else {
        //         matrizCaracteresAleatorios[filaRand][colRand] = '*';
        //     }

        //     imprimirMatricesChar(matrizCaracteresAleatorios);
        //     Thread.sleep(1000);
        //     k++;
        // }

        // //Usando do-while:
        // int w = 0;
        // do{
        //     int filaRand = random.nextInt(tamanio);
        //     int colRand = random.nextInt(tamanio);

        //     char letra = arregloNombreCompleto[w];

        //     if (matrizCaracteresAleatorios[filaRand][colRand] == '\0'){
        //         matrizCaracteresAleatorios[filaRand][colRand] = letra;
        //     } else {
        //         matrizCaracteresAleatorios[filaRand][colRand] = '*';
        //     }

        //     imprimirMatricesChar(matrizCaracteresAleatorios);
        //     Thread.sleep(500);
        //     w++;
        // }while (w < nombreCompleto.length());

        //Resultado:
        System.out.println("RESULTADO: ");
        imprimirMatricesChar(matrizCaracteresAleatorios);
    }

    public void imprimirMatricesString(String[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void imprimirMatricesChar(char[][] matriz){
         for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
