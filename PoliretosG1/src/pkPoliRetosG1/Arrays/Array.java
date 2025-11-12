package pkPoliRetosG1.Arrays;

import java.util.Scanner;

public class Array {

    public Array(){
    }

    public static void inicializarArrays(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) throws InterruptedException{

        System.out.println("-----------EJERCICIOS ARRAYS --------------");

        System.out.println("A01) Crear una array para cada palabra de su nombre e ingrese el porcentaje de carga para cada palabra.");

        Scanner scc = new Scanner(System.in);
        System.out.println("Ingrese los porcentajes de carga separados por espacio (4 cantidades):");
        String[] porcentajesTexto = scc.nextLine().split(" ");

        A01_PorcentajeNombre.g1_A01_porcentajeNombreFor(primerNombre, segundoNombre, primerApellido, segundoApellido, porcentajesTexto);
        A01_PorcentajeNombre.g1_A01_porcentajeNombreWhile(primerNombre, segundoNombre, primerApellido, segundoApellido, porcentajesTexto);
        A01_PorcentajeNombre.g1_A01_porcentajeNombreDoWhile(primerNombre, segundoNombre, primerApellido, segundoApellido, porcentajesTexto);

        System.out.println("A02) Crear una matriz solicitando el tamaño y caracter para almacenar las iniciales de su nombre y apellido y presentar la matriz");
        A02_InicialesNombre.g1_A02_inicialesNombreFor();
        A02_InicialesNombre.g1_A02_inicialesNombreWhile();
        A02_InicialesNombre.g1_A02_inicialesNombreDoWhile();

        System.out.println("A03) Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre ");
        A03_DibujarPlanoYFuncion.g1_A03dibujarPlanoYFuncionDibujandoConNombreFor(primerNombre);
        A03_DibujarPlanoYFuncion.g1_A03dibujarPlanoYFuncionDibujandoConNombreWhile(primerNombre);
        A03_DibujarPlanoYFuncion.g1_A03dibujarPlanoYFuncionDibujandoConNombreDoWhile(primerNombre);

        System.out.println("A04) Crear un matriz donde forme una X con su nombre y apellido");
        A04_FormarX.g1_A04formarXConNombreyApellidoFor(primerNombre, primerApellido);
        A04_FormarX.g1_A04formarXConNombreyApellidoWhile(primerNombre, primerApellido);
        A04_FormarX.g1_A04formarXConNombreyApellidoDoWhile(primerNombre, primerApellido);

        System.out.println("A05) Crear un matriz cuadrada del tamaño de su nombre, colocar cada letra de sus nombres completos de forma randomica/aleatorio.En el caso que conincidan las posiciones poner un *.");
        A05_MatrizAleatoriaNombre.g1_A05generarMatrizConNombreAleatorioFor(primerNombre, segundoNombre, primerApellido, segundoApellido);
        A05_MatrizAleatoriaNombre.g1_A05generarMatrizConNombreAleatorioWhile(primerNombre, segundoNombre, primerApellido, segundoApellido);
        A05_MatrizAleatoriaNombre.g1_A05generarMatrizConNombreAleatorioDoWhile(primerNombre, segundoNombre, primerApellido, segundoApellido);
        
    }

}
