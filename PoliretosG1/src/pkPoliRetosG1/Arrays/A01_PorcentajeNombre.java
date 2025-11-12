package pkPoliRetosG1.Arrays;

public class A01_PorcentajeNombre {

    
    //For
    public static void g1_A01_porcentajeNombreFor(String nombre1, String nombre2, String apellido1, String apellido2, String[] porcentajesTexto){
        
        String nombreCompleto = nombre1 + " " + nombre2 + " " + apellido1 + " " + apellido2;
        String[] palabras = nombreCompleto.split(" ");

        
        int[] porcentajes = new int[porcentajesTexto.length];
        for (int i = 0; i < porcentajesTexto.length; i++) {
            porcentajes[i] = Integer.parseInt(porcentajesTexto[i]);
        }

        System.out.println();
        System.out.println(nombreCompleto);

        for (int i = 0; i < palabras.length; i++) {
            imprimirBarra(palabras[i], porcentajes[i]);
        }

    }
    
    //While
    public static void g1_A01_porcentajeNombreWhile(String nombre1, String nombre2, String apellido1, String apellido2, String[] porcentajesTexto){
        String nombreCompleto = nombre1 + " " + nombre2 + " " + apellido1 + " " + apellido2;
        String[] palabras = nombreCompleto.split(" ");

        int[] porcentajes = new int[porcentajesTexto.length];
        int i = 0;

        while (i < porcentajesTexto.length) {
            porcentajes[i] = Integer.parseInt(porcentajesTexto[i]);
            i++;
        }

        System.out.println();
        System.out.println(nombreCompleto);

        i = 0;
        while (i < palabras.length) {
            imprimirBarra(palabras[i], porcentajes[i]);
            i++;
        }
    }

    //Do While
    public static void g1_A01_porcentajeNombreDoWhile(String nombre1, String nombre2, String apellido1, String apellido2, String[] porcentajesTexto){
        String nombreCompleto = nombre1 + " " + nombre2 + " " + apellido1 + " " + apellido2;
        String[] palabras = nombreCompleto.split(" ");

        int[] porcentajes = new int[porcentajesTexto.length];
        int i = 0;

        do {
            porcentajes[i] = Integer.parseInt(porcentajesTexto[i]);
            i++;
        } while (i < porcentajesTexto.length);

        System.out.println();
        System.out.println(nombreCompleto);

        i = 0;
        do {
            imprimirBarra(palabras[i], porcentajes[i]);
            i++;
        } while (i < palabras.length);

    }

    private static void imprimirBarra(String palabra, int porcentaje) {
        int longitudBarra = 15;
        int llenado = (porcentaje * longitudBarra) / 100;

        StringBuilder barra = new StringBuilder("[");
        for (int j = 0; j < longitudBarra; j++) {
            if (j < llenado) {
                barra.append("=");
            } else {
                barra.append(" ");
            }
        }
        barra.append(">]");
        int letraMostrar = Math.max(2, (porcentaje * palabra.length()) / 100);
        if (letraMostrar > palabra.length()) {
            letraMostrar = palabra.length();
        } 
        String subPalabra = palabra.substring(0, letraMostrar);

        System.out.printf("%s %3d%% %s%n", barra.toString(), porcentaje, subPalabra);
    }

    
}
