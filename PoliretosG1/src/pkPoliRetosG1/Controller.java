package pkPoliRetosG1;

import java.util.InputMismatchException;
import java.util.Scanner;

import pkPoliRetosG1.serieFiguras.F5_TrianguloInverso;
import pkPoliRetosG1.serieFiguras.F6_Triangulo;
import pkPoliRetosG1.serieFiguras.F7_EscaleraDescendente;
import pkPoliRetosG1.serieFiguras.F8_EscaleraAscendente;
import pkPoliRetosG1.serieFiguras.F9_PiramideEscaleras;
import pkPoliRetosG1.serieFiguras.F10_PiramideSignosDescendente;
import pkPoliRetosG1.serieFiguras.F11_EscaleraCreciente;
import pkPoliRetosG1.serieFiguras.F12_NumerosDescendientes;
import pkPoliRetosG1.serieFiguras.F13_NumerosAscendentes;
import pkPoliRetosG1.serieFiguras.F14_TrianguloPascal;
import pkPoliRetosG1.serieFiguras.F15_PascalAlineadoIzquierda;
import pkPoliRetosG1.serieFiguras.F16_CruzAlternada;
import pkPoliRetosG1.serieFiguras.F17_CruzBinaria;
import pkPoliRetosG1.serieFiguras.F18_PiramideNumerica;
import pkPoliRetosG1.serieFiguras.F19_FiguraSimbolica;



public class Controller {

    private final Scanner in = new Scanner(System.in);

    public void run() {
        printHeader();

        boolean keep = true;
        while (keep) {
            int N = askPositiveInt("Ingrese el tamaño / nivel (N > 0): ");

            int fig = askOption("""
                Seleccione la FIGURA:
                 5)  F5 (Triángulo Inverso)
                 6)  F6 (Triángulo)
                 7)  F7 (Escalera Descendente)
                 8)  F8 (Escalera Ascendente)
                 9)  F9 (Pirámide Escaleras)
                10)  F10 (Pirámide Signos Descendente)
                11)  F11 (Escalera Creciente)
                12)  F12 (Números Descendientes)
                13)  F13 (Números Ascendentes)
                14)  F14 (Pascal centrado)
                15)  F15 (Pascal izquierda)
                16)  F16 (Cruz Alternada)
                17)  F17 (Cruz Binaria)
                18)  F18 (Pirámide Numérica)
                19)  F19 (Figura Simbólica)
                Opción: """, 5, 19);

            int loop = askOption("""
                Seleccione el TIPO de bucle:
                 1) for
                 2) while
                 3) do-while 
                Opción: """, 1, 3);

            System.out.println("\n--- SALIDA ---\n");
            execFigure(fig, loop, N);
            System.out.println("\n--------------\n");

            keep = askYesNo("¿Desea ejecutar otra figura? (s/n): ");
        }

        System.out.println("¡Gracias! Programa finalizado.");
        in.close();
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
		System.out.println("_____________");
    }

    private int askPositiveInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int v = in.nextInt();
                if (v > 0) return v;
                System.out.println(">> Ingrese un entero positivo.");
            } catch (InputMismatchException e) {
                System.out.println(">> Valor inválido. Intente de nuevo.");
                in.next(); // limpiar token inválido
            }
        }
    }

    private int askOption(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int v = in.nextInt();
                if (v >= min && v <= max) return v;
                System.out.printf(">> Opción fuera de rango (%d..%d).\n", min, max);
            } catch (InputMismatchException e) {
                System.out.println(">> Valor inválido. Intente de nuevo.");
                in.next();
            }
        }
    }

    private boolean askYesNo(String prompt) {
        System.out.print(prompt);
        String s = in.next().trim().toLowerCase();
        return s.startsWith("s");
    }

    private void execFigure(int fig, int loop, int N) {
        switch (fig) {
            case 5 -> {
                switch (loop) {
                    case 1 -> F5_TrianguloInverso.g1_F5_TrianguloInversoFor(N);
                    case 2 -> F5_TrianguloInverso.g1_F5_TrianguloInversoWhile(N);
                    case 3 -> F5_TrianguloInverso.g1_F5_TrianguloInversoDoWhile(N);
                }
            }
            case 6 -> {
                switch (loop) {
                    case 1 -> F6_Triangulo.g1_F6_TrianguloFor(N);
                    case 2 -> F6_Triangulo.g1_F6_TrianguloWhile(N);
                    case 3 -> F6_Triangulo.g1_F6_TrianguloDoWhile(N);
                }
            }
            case 7 -> {
                switch (loop) {
                    case 1 -> F7_EscaleraDescendente.g1_F7_EscaleraFor(N);
                    case 2 -> F7_EscaleraDescendente.g1_F7_EscaleraWhile(N);
                    case 3 -> F7_EscaleraDescendente.g1_F7_EscaleraDoWhile(N);
                }
            }
            case 8 -> {
                switch (loop) {
                    case 1 -> F8_EscaleraAscendente.g1_F8_EscaleraEspejoFor(N);
                    case 2 -> F8_EscaleraAscendente.g1_F8_EscaleraEspejoWhile(N);
                    case 3 -> F8_EscaleraAscendente.g1_F8_EscaleraEspejoDoWhile(N);
                }
            }
            case 9 -> {
                switch (loop) {
                    case 1 -> F9_PiramideEscaleras.g1_F9_PiramidePeldañosFor(N);
                    case 2 -> F9_PiramideEscaleras.g1_F9_PiramidePeldañosWhile(N);
                    case 3 -> F9_PiramideEscaleras.g1_F9_PiramidePeldañosDoWhile(N);
                }
            }
            case 10 -> {
                switch (loop) {
                    case 1 -> F10_PiramideSignosDescendente.g1_F10_EscaleraAlternaFor(N);
                    case 2 -> F10_PiramideSignosDescendente.g1_F10_EscaleraAlternaWhile(N);
                    case 3 -> F10_PiramideSignosDescendente.g1_F10_EscaleraAlternaDoWhile(N);
                }
            }
            case 11 -> {
                switch (loop) {
                    case 1 -> F11_EscaleraCreciente.g1_F11_EscaleraCrecienteFor(N);
                    case 2 -> F11_EscaleraCreciente.g1_F11_EscaleraCrecienteWhile(N);
                    case 3 -> F11_EscaleraCreciente.g1_F11_EscaleraCrecienteDoWhile(N);
                }
            }
            case 12 -> {
                switch (loop) {
                    case 1 -> F12_NumerosDescendientes.g1_F12_NumerosDescFor(N);
                    case 2 -> F12_NumerosDescendientes.g1_F12_NumerosDescWhile(N);
                    case 3 -> F12_NumerosDescendientes.g1_F12_NumerosDescDoWhile(N);
                }
            }
            case 13 -> {
                switch (loop) {
                    case 1 -> F13_NumerosAscendentes.g1_F13_NumerosAscFor(N);
                    case 2 -> F13_NumerosAscendentes.g1_F13_NumerosAscWhile(N);
                    case 3 -> F13_NumerosAscendentes.g1_F13_NumerosAscDoWhile(N);
                }
            }
            case 14 -> {
                switch (loop) {
                    case 1 -> F14_TrianguloPascal.g1_F14_PascalFor(N);
                    case 2 -> F14_TrianguloPascal.g1_F14_PascalWhile(N);
                    case 3 -> F14_TrianguloPascal.g1_F14_PascalDoWhile(N);
                }
            }
            case 15 -> {
                switch (loop) {
                    case 1 -> F15_PascalAlineadoIzquierda.g1_F15_PascalIzqFor(N);
                    case 2 -> F15_PascalAlineadoIzquierda.g1_F15_PascalIzqWhile(N);
                    case 3 -> F15_PascalAlineadoIzquierda.g1_F15_PascalIzqDoWhile(N);
                }
            }

            case 16 -> {
                switch (loop) {
                    case 1 -> F16_CruzAlternada.g1_F16_CruzAltFor(N);
                    case 2 -> F16_CruzAlternada.g1_F16_CruzAltWhile(N);
                    case 3 -> F16_CruzAlternada.g1_F16_CruzAltDoWhile(N);
                }
            }

            case 17 -> {
                switch (loop) {
                    case 1 -> F17_CruzBinaria.g1_F17_CruzBinFor(N);
                    case 2 -> F17_CruzBinaria.g1_F17_CruzBinWhile(N);
                    case 3 -> F17_CruzBinaria.g1_F17_CruzBinDoWhile(N);
                }
            }

            case 18 -> {
                switch (loop) {
                    case 1 -> F18_PiramideNumerica.g1_F18_PiramideNumFor(N);
                    case 2 -> F18_PiramideNumerica.g1_F18_PiramideNumWhile(N);
                    case 3 -> F18_PiramideNumerica.g1_F18_PiramideNumDoWhile(N);
                }
            }

            case 19 -> {
                switch (loop) {
                    case 1 -> F19_FiguraSimbolica.g1_F19_FiguraSimbolicaFor(N);
                    case 2 -> F19_FiguraSimbolica.g1_F19_FiguraSimbolicaWhile(N);
                    case 3 -> F19_FiguraSimbolica.g1_F19_FiguraSimbolicaDoWhile(N);
                }
            }
            
            default -> System.out.println("Figura no implementada aún.");
        }
    }
}
