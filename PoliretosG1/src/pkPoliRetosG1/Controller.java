package pkPoliRetosG1;
//import pkPoliRetosG1.Arrays;
//import pkPoliRetosG1.Persona;
import java.util.Scanner;


public class Controller {

    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    //private Integer termino;
    private Persona persona;

    Scanner sc = new Scanner(System.in);

    public Controller(){
        System.out.println("Ingrese su Primer Nombre: ");
        nombre1 = sc.nextLine();
        System.out.println("Ingrese su Segundo Nombre: ");
        nombre2 = sc.nextLine();
        System.out.println("Ingrese su Primer Apellido:");
        apellido1 = sc.nextLine();
        System.out.println("Ingrese su Segundo Apellido:");
        apellido2 = sc.nextLine();

        persona = new Persona(nombre1, nombre2, apellido1, apellido2);
    }

    public void inicializarPrograma() throws Exception{

        Arrays ejerciciosArray = new Arrays(persona.getPrimerNombre(), persona.getSegundoNombre(), persona.getPrimerApellido(), persona.getSegundoApellido());

        System.out.println("-----------EJERCICIOS ARRAYS (A03-A05)--------------");
        System.out.println("A03) Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre ");
        ejerciciosArray.g1_A03dibujarPlanoYFuncionDibujandoConNombre(persona.getPrimerNombre());
        System.out.println("A04)    Crear un matriz donde forme una X con su nombre y apellido");
        ejerciciosArray.g1_A04formarXConNombreyApellido(persona.getPrimerNombre(), persona.getPrimerApellido());
        System.out.println("A05)    Crear un matriz cuadrada del tamaño de su nombre, colocar cada letra de sus nombres completos de forma randomica/aleatorio.En el caso que conincidan las posiciones poner un *.");
        ejerciciosArray.g1_A05generarMatrizConNombreAleatorio(persona.getPrimerNombre(), persona.getSegundoNombre(), persona.getPrimerApellido(), persona.getSegundoApellido());

        System.out.println("---------------------------------------------------");
        System.out.println("------------EJERCICIOS LOGINS (L01-L10)------------");
        Loading ejerciciosLoading = new Loading(persona.getPrimerNombre(), persona.getSegundoNombre(), persona.getPrimerApellido(), persona.getSegundoApellido(), ' ');
        
        System.out.println(" L01) Indicador de carga desde 0  a 100% usar los signos \\|/-| para simular un movimiento rotacional de carga 0% hasta 100% ");
        ejerciciosLoading.g1_L01indicarCargadeCeroACien();

        System.out.println("L02) Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres");
        System.out.println("Ingrese un caracter de su preferencia: ");
        ejerciciosLoading.setCaracter(sc.nextLine().charAt(0));
        ejerciciosLoading.g1_L02pedirCaracterYSimularCarga(ejerciciosLoading.getCaracter());

        System.out.println("L03) Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres ");
        System.out.println("L03) Ingrese un caracter de su preferencia: ");
        ejerciciosLoading.setCaracter(sc.nextLine().charAt(0));
        ejerciciosLoading.g1_L03pedirCaracterYDesplazar(ejerciciosLoading.getCaracter());

        System.out.println("L04) Waiting que inicia en 0  a 100% usar los signos o0o para simular un movimiento de ida y vuelta en el mismo puesto");
        ejerciciosLoading.g1_L04simularMovimientoWaiting();

        System.out.println("L05) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta entre > -");
        ejerciciosLoading.g1_L05avanzarBarraCambiandoPunta();

        System.out.println("L06) Crear una barra es de 20 caracteres, la barra <=> se desplaza de izquierda a derecha");
        ejerciciosLoading.g1_L06desplazarBarradeTresCaracteres();

        System.out.println("L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \\|/-| ");
        ejerciciosLoading.g1_L07avanzarBarraConPuntaRotacional();

        System.out.println("L08) Pedir el nombre y apellidos y realizar la carga mostrando letra a letra hasta el 100%");
        ejerciciosLoading.g1_L08realizarCargaConNombreyApellidoCompleto(persona.getPrimerNombre(), persona.getPrimerApellido(), persona.getSegundoApellido());

        System.out.println("L09) Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100% ");
        ejerciciosLoading.g1_L09mostrarNombreCompletoUnaLetraPorLinea(persona.getPrimerNombre(), persona.getPrimerApellido());

        System.out.println("L10) Generar un numero randon entre 10 a 100 para simular una carga de un archivo en kB.");
        ejerciciosLoading.g1_L10simularDescargaDeArchivo();

    }
}
