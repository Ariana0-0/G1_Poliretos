package pkPoliRetosG1;


import java.util.Scanner;

import pkPoliRetosG1.serieFiguras.Figuras;
import pkPoliRetosG1.Arrays.Array;
import pkPoliRetosG1.Loadings.Loading;



public class Controller {


    public void run(Scanner sc) throws InterruptedException {
        printHeader();



        System.out.println(">> Ingrese su Primer Nombre: ");
        String primerNombre = sc.nextLine();
        System.out.println(">> Ingrese su Segundo Nombre: ");
        String segundoNombre = sc.nextLine();
        System.out.println(">> Ingrese su Primer Apellido:");
        String primerApellido = sc.nextLine();
        System.out.println(">> Ingrese su Segundo Apellido:");
        String segundoApellido = sc.nextLine();

        //Series numericas


        //Series de caracteres


        //Figuras

        //5-19
        Figuras.inicializarFiguras();

        //Cadena de caracteres


        //Arrays
        Array.inicializarArrays(primerNombre, segundoNombre, primerApellido, segundoApellido);
        

        //Loading
        Loading.inicializarLoadings(primerNombre, primerApellido, segundoApellido);

        //Recursion


        //Grafos y Automatas

        System.out.println("¡Gracias! Programa finalizado.");
        
    }

    private void printHeader() {
        System.out.println("-----ESCUELA POLITECNICA NACIONAL------");
		System.out.println("-----------------POLIRETOS-------------");
		System.out.println("--------------Programacion II----------");
		System.out.println("------------------GRUPO 1--------------");
        System.out.println("---------------------------------------");
		System.out.println("Integrantes: --------------------------");
		System.out.println("  Alban Salazar Emilio Fabian----------");
		System.out.println("  Alcivar Gomez Alan Nahin-------------");
        System.out.println("  Almeida Reyes Anthonny Joel----------");
		System.out.println("  Alomoto Granizo Ariana Thais---------");
        System.out.println("  Astudillo Campos Josue Sebastian-----");
		System.out.println("Curso: GR2SW---------------------------");
		System.out.println("---------------------------------------");
		System.out.println("_______________________________________");
    }

    
}
