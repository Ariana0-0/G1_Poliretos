package pkPoliRetosG1;

import java.util.Random;

public class Loading extends Persona{
    private char caracter;

    

    public Loading(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, char caracter) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido);
        setCaracter(caracter);
    }

    public void g1_L01indicarCargadeCeroACien() throws InterruptedException{
        
        char[] rotacion = {'|', '/', '-', '\\'};

        int pos = 0;

        //Usando for:
        System.out.println("1. FOR: ");
        for(int i = 0; i <= 100; i++){
            System.out.println(" " + rotacion[pos] + " " + i + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;
        }

        //Usando while
        System.out.println("2. WHILE: ");
        int k = 0;
        pos = 0;
        while(k <= 100){
            System.out.println(" " + rotacion[pos] + " " + k + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            k++;
        }

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        int w = 0;
        pos = 0;
        do{
            System.out.println(" " + rotacion[pos] + " " + w + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            w++;
        } while (w <= 100);


    }

    public void g1_L02pedirCaracterYSimularCarga(char caracter) throws InterruptedException{


        //Usando for:
        System.out.println("1. FOR: ");
        char[] barraFor = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            
            if (porcentaje % 5 == 0 && porcentaje != 0){ //Por cada 5% aumenta un caracter
                barraFor[(porcentaje/5)-1] = caracter;
            }

            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraFor);
            System.out.println("[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("2. WHILE: ");
        char[] barraWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int k = 0;
        while (k <= 100){
            if (k % 5 == 0 && k != 0){ //Por cada 5% aumenta un caracter
                barraWhile[(k/5)-1] = caracter;
            }

            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraWhile);
            System.out.println("[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int w = 0;
        do{
            if (w % 5 == 0 && w != 0){ //Por cada 5% aumenta un caracter
                barraDoWhile[(w/5)-1] = caracter;
            }

            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraDoWhile);
            System.out.println("[" + barraEnString + " ]" + w + " %");
            Thread.sleep(100);
            w++;
        }while (w <= 100);
        System.out.println("Carga Completa.");
    }

    public void g1_L03pedirCaracterYDesplazar(char caracter) throws InterruptedException{
        

        //Usando for:
        System.out.println("1. FOR: ");
        char[] barraFor = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            if (porcentaje < 10){ //Antes del 10%
                if (porcentaje % 5 == 0 && porcentaje != 0){ //Por cada 5% aumenta un caracter
                    barraFor[(porcentaje/5)-1] = caracter;
                }
            } else { //Desde el 10%
                if (porcentaje % 5 == 0){ //Por cada 5% aumenta un caracter
                    barraFor[(porcentaje/5)-2] = ' '; 
                    barraFor[(porcentaje/5)-1] = caracter; //Cambio de posición de caracter al siguiente
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraFor);
            System.out.println("[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("2. WHILE: ");
        char[] barraWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int k = 0;
        while (k <= 100){
            if (k < 10){ //Antes del 10%
                if (k % 5 == 0 && k != 0){ //Por cada 5% aumenta un caracter
                    barraWhile[(k/5)-1] = caracter;
                }
            } else { //Desde el 10%
                if (k % 5 == 0){ //Por cada 5% aumenta un caracter
                    barraWhile[(k/5)-2] = ' '; 
                    barraWhile[(k/5)-1] = caracter; //Cambio de posición de caracter al siguiente
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraWhile);
            System.out.println("[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int w = 0;
        do{
            if (w < 10){ //Antes del 10%
                if (w % 5 == 0 && w != 0){ //Por cada 5% aumenta un caracter
                    barraDoWhile[(w/5)-1] = caracter;
                }
            } else { //Desde el 10%
                if (w % 5 == 0){ //Por cada 5% aumenta un caracter
                    barraDoWhile[(w/5)-2] = ' '; 
                    barraDoWhile[(w/5)-1] = caracter; //Cambio de posición de caracter al siguiente
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraDoWhile);
            System.out.println("[" + barraEnString + " ]" + w + " %");
            Thread.sleep(100);
            w++;
        }while (w <= 100);
        System.out.println("Carga Completa.");
    }

    public void g1_L04simularMovimientoWaiting() throws InterruptedException{
        String[] simbolo = {"o0o", "oo0", "o0o", "0oo"};

        int pos = 0;

        //Usando for:
        System.out.println("1. FOR: ");
        for(int i = 0; i <= 100; i++){
            System.out.println(" " + simbolo[pos] + " " + i + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;
        }

        //Usando while
        System.out.println("2. WHILE: ");
        int k = 0;
        pos = 0;
        while(k <= 100){
            System.out.println(" " + simbolo[pos] + " " + k + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            k++;
        }

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        int w = 0;
        pos = 0;
        do{
            System.out.println(" " + simbolo[pos] + " " + w + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            w++;
        } while (w <= 100);
    }

    public void g1_L05avanzarBarraCambiandoPunta() throws InterruptedException{
        //Usando for:
        System.out.println("1. FOR: ");
        char[] barraFor = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            if (porcentaje < 10){ //Antes del 10%
                if (porcentaje % 5 == 0 && porcentaje != 0){ //Por cada 5% aumenta un caracter
                    barraFor[(porcentaje/5)-1] = '>';
                }
            } else { //Desde el 10%
                if (porcentaje % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    if (porcentaje % 2 == 0){ //Porcentaje par
                        barraFor[(porcentaje/5)-1] = '-';//Cambio de posición de caracter al siguiente
                    } else {
                        barraFor[(porcentaje/5)-1] = '>';//Cambio de posición de caracter al siguiente
                    }
                    barraFor[(porcentaje/5)-2] = '='; //Anterior posicion se reemplaza por un '=' 
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraFor);
            System.out.println("[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("2. WHILE: ");
        char[] barraWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int k = 0;
        while (k <= 100){
            if (k < 10){ //Antes del 10%
                if (k % 5 == 0 && k != 0){ //Por cada 5% aumenta un caracter
                    barraWhile[(k/5)-1] = '>';
                }
            } else { //Desde el 10%
                if (k % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    if (k % 2 == 0){ //Porcentaje par
                        barraWhile[(k/5)-1] = '-';//Cambio de posición de caracter al siguiente
                    } else {
                        barraWhile[(k/5)-1] = '>';//Cambio de posición de caracter al siguiente
                    }
                    barraWhile[(k/5)-2] = '='; //Anterior posicion se reemplaza por un '=' 
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraWhile);
            System.out.println("[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int w = 0;
        do{
            if (w < 10){ //Antes del 10%
                if (w % 5 == 0 && w != 0){ //Por cada 5% aumenta un caracter
                    barraDoWhile[(w/5)-1] = '>';
                }
            } else { //Desde el 10%
                if (w % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    if (w % 2 == 0){ //Porcentaje par
                        barraDoWhile[(w/5)-1] = '-';//Cambio de posición de caracter al siguiente
                    } else {
                        barraDoWhile[(w/5)-1] = '>';//Cambio de posición de caracter al siguiente
                    }
                    barraDoWhile[(w/5)-2] = '='; //Anterior posicion se reemplaza por un '=' 
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraDoWhile);
            System.out.println("[" + barraEnString + " ]" + w + " %");
            Thread.sleep(100);
            w++;
        }while (w <= 100);
        System.out.println("Carga Completa.");
    }

    public void g1_L06desplazarBarradeTresCaracteres() throws InterruptedException{
        //Usando for:
        System.out.println("1. FOR: ");
        char[] barraFor = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            if (porcentaje < 5){ //Antes del 5%
                if (porcentaje % 5 == 0){ //El unico caso: 0
                    barraFor[porcentaje] = '<';
                    barraFor[porcentaje+1] = '=';
                    barraFor[porcentaje+2] = '>';
                }
            } else if (porcentaje <= 85){ //Desde el 5% hasta el 85%
                if (porcentaje % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barraFor[(porcentaje/5)-1] = ' ';//Anterior posicion '<' se reemplaza por un ' ' 
                    barraFor[(porcentaje/5)] = '<';//Cambio de posición de caracter de '=' a '<'
                    barraFor[(porcentaje/5)+1] = '='; //Cambio de posición de caracter de '>' a '='
                    barraFor[(porcentaje/5)+2] = '>'; //Cambio de posición de caracter de ' ' a '>'
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraFor);
            System.out.println("[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("2. WHILE: ");
        char[] barraWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int k = 0;
        while (k <= 100){
            if (k < 5){ //Antes del 5%
                if (k % 5 == 0){ //El unico caso: 0
                    barraWhile[k] = '<';
                    barraWhile[k+1] = '=';
                    barraWhile[k+2] = '>';
                }
            } else if (k <= 85){ //Desde el 5% hasta el 85%
                if (k % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barraWhile[(k/5)-1] = ' ';//Anterior posicion '<' se reemplaza por un ' ' 
                    barraWhile[(k/5)] = '<';//Cambio de posición de caracter de '=' a '<'
                    barraWhile[(k/5)+1] = '='; //Cambio de posición de caracter de '>' a '='
                    barraWhile[(k/5)+2] = '>'; //Cambio de posición de caracter de ' ' a '>'
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraWhile);
            System.out.println("[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");

        //Usando while:
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int w = 0;
        do{
            if (w < 5){ //Antes del 5%
                if (w % 5 == 0){ //El unico caso: 0
                    barraDoWhile[w] = '<';
                    barraDoWhile[w+1] = '=';
                    barraDoWhile[w+2] = '>';
                }
            } else if (w <= 85){ //Desde el 5% hasta el 85%
                if (w % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barraDoWhile[(w/5)-1] = ' ';//Anterior posicion '<' se reemplaza por un ' ' 
                    barraDoWhile[(w/5)] = '<';//Cambio de posición de caracter de '=' a '<'
                    barraDoWhile[(w/5)+1] = '='; //Cambio de posición de caracter de '>' a '='
                    barraDoWhile[(w/5)+2] = '>'; //Cambio de posición de caracter de ' ' a '>'
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraDoWhile);
            System.out.println("[" + barraEnString + " ]" + w + " %");
            Thread.sleep(100);
            w++;
        }while (w <= 100);
        System.out.println("Carga Completa.");
    }

    public void g1_L07avanzarBarraConPuntaRotacional() throws InterruptedException{
        //Usando for:
        System.out.println("1. FOR: ");
        char[] barraFor = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres
        char[] rotacion = {'|', '/', '-', '\\'};
        int pos = 0;
        
        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            if (porcentaje < 10){ //Antes del 10%
                if (porcentaje % 5 == 0 && porcentaje != 0){ //Por cada 5% aumenta un caracter
                    barraFor[(porcentaje/5)-1] = rotacion[pos];
                    pos++;
                }
            } else { //Desde el 10%
                if (porcentaje % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barraFor[(porcentaje/5)-1] = rotacion[pos];//Cambio de posición de caracter al siguiente
                    barraFor[(porcentaje/5)-2] = '='; //Anterior posicion se reemplaza por un '='
                    if (pos == 3) pos = 0;
                    else pos++;
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraFor);
            System.out.println("[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

        //Usando while
        System.out.println("2. WHILE: ");
        char[] barraWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres
        int k = 0;
        while(k <= 100){
            if (k < 10){ //Antes del 10%
                if (k % 5 == 0 && k != 0){ //Por cada 5% aumenta un caracter
                    barraWhile[(k/5)-1] = rotacion[pos];
                    pos++;
                }
            } else { //Desde el 10%
                if (k % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barraWhile[(k/5)-1] = rotacion[pos];//Cambio de posición de caracter al siguiente
                    barraWhile[(k/5)-2] = '='; //Anterior posicion se reemplaza por un '='
                    if (pos == 3) pos = 0;
                    else pos++;
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraWhile);
            System.out.println("[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres
        int w = 0;
        do{
            if (w < 10){ //Antes del 10%
                if (w % 5 == 0 && w != 0){ //Por cada 5% aumenta un caracter
                    barraDoWhile[(w/5)-1] = rotacion[pos];
                    pos++;
                }
            } else { //Desde el 10%
                if (w % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barraDoWhile[(w/5)-1] = rotacion[pos];//Cambio de posición de caracter al siguiente
                    barraDoWhile[(w/5)-2] = '='; //Anterior posicion se reemplaza por un '='
                    if (pos == 3) pos = 0;
                    else pos++;
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barraDoWhile);
            System.out.println("[" + barraEnString + " ]" + w + " %");
            Thread.sleep(100);
            w++;
        } while (w <= 100);
        System.out.println("Carga Completa.");
    }

    public void g1_L08realizarCargaConNombreyApellidoCompleto (String nombre1, String apellido1, String apellido2) throws InterruptedException{
        String nombreCompleto = nombre1 + " " + apellido1 + " " + apellido2;

        double tamanio1 = nombreCompleto.length();
        

        double porcentajePorCaracter = (100/ tamanio1);
        
        //Usando for
        System.out.println("1. FOR: ");
        char[] barraFor = new char[(int) tamanio1];

        for(int i = 0; i<barraFor.length; i++){ //Relleno del arreglo con ' '
            barraFor[i] = ' ';
        }

        int posicionFor = 0;
        for (double porcentaje = 0; porcentaje <= 100; porcentaje += porcentajePorCaracter){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if ((porcentaje % porcentajePorCaracter == 0) && (porcentaje != 0)) {
                barraFor[posicionFor] = nombreCompleto.charAt(posicionFor);
                posicionFor++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barraFor);
            System.out.println("[" + barraString + "]" + porcentaje + "%" );
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

        //Usando while
        System.out.println("2. WHILE: ");
        char[] barraWhile = new char[(int) tamanio1]; 
        int i = 0;
        while (i < barraWhile.length){ //Relleno del arreglo con ' '
            barraWhile[i] = ' ';
            i++;
        }

        double k1 = 0;
        int posicionWhile = 0;
        while(k1 <= 100){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (k1 % porcentajePorCaracter == 0 && k1 != 0) {
                barraWhile[posicionWhile] = nombreCompleto.charAt(posicionWhile);
                posicionWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barraWhile);
            System.out.println("[" + barraString + "]" + k1 + "%" );
            Thread.sleep(100);
            k1+=porcentajePorCaracter;
        }
        System.out.println("Carga Completa.");

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = new char[(int) tamanio1];
        i = 0;
        do{ //Relleno del arreglo con ' '
            barraDoWhile[i] = ' ';
            i++;
        }while (i < barraDoWhile.length);

        double w = 0;
        int posicionDoWhile = 0;
        do{
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (w % porcentajePorCaracter == 0 && w != 0) {
                barraDoWhile[posicionDoWhile] = nombreCompleto.charAt(posicionDoWhile);
                posicionDoWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barraDoWhile);
            System.out.println("[" + barraString + "]" + w + "%" );
            Thread.sleep(100);
            w+= porcentajePorCaracter;
        } while (w <= 100);
        System.out.println("Carga Completa.");
    }

    public void g1_L09mostrarNombreCompletoUnaLetraPorLinea(String nombre, String apellido) throws InterruptedException{
        String nombreCompleto = nombre + apellido; 

        double tamanio1 = nombreCompleto.length();
        
        double porcentajePorCaracter = (100/ tamanio1);
        
        //Usando for
        System.out.println("1. FOR: ");
        char[] barraFor = new char[(int) tamanio1];
        for(int i = 0; i<barraFor.length; i++){ //Relleno del arreglo con ' '
            barraFor[i] = ' ';
        }
        int posicionFor = 0;
        for (double porcentaje = 0; porcentaje <= 101; porcentaje += porcentajePorCaracter){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (porcentaje == 0) {
                barraFor[posicionFor] = ' '; //Empieza con 0 caracteres en 0%
            } else if (porcentaje == porcentajePorCaracter){
                barraFor[posicionFor] = nombreCompleto.charAt(posicionFor); //Empieza con el primer caracter en el primer porcentajePorCaracter
                posicionFor++;
            } else {
                barraFor[posicionFor] = nombreCompleto.charAt(posicionFor); 
                barraFor[posicionFor-1] = ' '; //Anterior caracter se reemplaza por un ' ' 
                posicionFor++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barraFor);
            System.out.println( barraString + " " + String.format("%.1f",porcentaje) + "%" );
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

        //Usando while
        System.out.println("2. WHILE: ");
        char[] barraWhile = new char[(int) tamanio1]; //20 Caracteres
        int i = 0;
        while (i < barraWhile.length){ //Relleno del arreglo con ' '
            barraWhile[i] = ' ';
             i++;
        }
        double k1 = 0;
        int posicionWhile = 0;
        while(k1 <= 101){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (k1 == 0) {
                barraWhile[posicionWhile] = ' '; //Empieza con 0 caracteres en 0%
            } else if (k1 == porcentajePorCaracter){
                barraWhile[posicionWhile] = nombreCompleto.charAt(posicionWhile); //Empieza con el primer caracter en el primer porcentajePorCaracter
                posicionWhile++;
            } else {
                barraWhile[posicionWhile] = nombreCompleto.charAt(posicionWhile); 
                barraWhile[posicionWhile-1] = ' '; //Anterior caracter se reemplaza por un ' ' 
                posicionWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barraWhile);
            System.out.println( barraString + " " + String.format("%.1f",k1) + "%" );
            Thread.sleep(100);
            k1+=porcentajePorCaracter;
        }
        System.out.println("Carga Completa.");

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = new char[(int) tamanio1]; //20 Caracteres
        i = 0;
        do{ //Relleno del arreglo con ' '
            barraDoWhile[i] = ' ';
            i++;
        }while (i < barraDoWhile.length);
        double w = 0;
        int posicionDoWhile = 0;
        do{
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (w == 0) {
                barraDoWhile[posicionDoWhile] = ' '; //Empieza con 0 caracteres en 0%
            } else if (w == porcentajePorCaracter){
                barraDoWhile[posicionDoWhile] = nombreCompleto.charAt(posicionDoWhile); //Empieza con el primer caracter en el primer porcentajePorCaracter
                posicionDoWhile++;
            } else {
                barraDoWhile[posicionDoWhile] = nombreCompleto.charAt(posicionDoWhile); 
                barraDoWhile[posicionDoWhile-1] = ' '; //Anterior caracter se reemplaza por un ' ' 
                posicionDoWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barraDoWhile);
            System.out.println( barraString + " " + String.format("%.1f", w) + "%" );
            Thread.sleep(100);
            w+= porcentajePorCaracter;
        } while (w <= 101);
        System.out.println("Carga Completa.");
    }

    public void g1_L10simularDescargaDeArchivo() throws InterruptedException{

        Random random = new Random(); //Crea un objeto perteneciente al paquete estándar de Java

        int longitudBarra = 25;
        
        //Usando for:
        System.out.println("1. FOR: ");
        char[] barraFor = new char[longitudBarra];
        //Relleno de ' ' en el arreglo de Barra
        for(int i = 0; i < barraFor.length; i++){
            barraFor[i] = ' ';
        }

        double tamanioFor = random.nextInt(91) + 10;
        double proporcionDescarga = tamanioFor/ (double)longitudBarra;
        System.out.println("Downloading Grupo1-PoliretosFOR-main.zip (" + tamanioFor + " kb)");
        String barraString = new String(barraFor);
        //Sin aun descargar nada
        System.out.println( "\u001B[33m" + barraString + " \u001B[0m " + String.format("%.1f", 0.0) + " / " +  tamanioFor + " kb");
        //Descarga de archivo
        
        for (int pos = 0; pos < longitudBarra; pos++){
            
            double descargando = (pos + 1) * proporcionDescarga;
            barraFor[pos] = '-';
            
            //Para mostrar el arreglo completo de barra, se lo convierte en string
        	barraString = new String(barraFor);
        	System.out.println( "\u001B[33m" + barraString + " \u001B[0m " + String.format("%.1f", descargando) + " / " +  tamanioFor + " kb");
        	//El \u001B[33m cambia el texto a magenta hasta \u001B[0m, que es obligatorio para que el color no se propague al resto del texto, es decir, restablece el color al normal
        	//El String.format("%.1f", descargando) redondea el numero a una cifra decimal al mostrarse
        	Thread.sleep(250);
        }

        System.out.println("DOWNLOADED.");

        //Usando while
        System.out.println("2. WHILE: ");
        char[] barraWhile = new char[longitudBarra];
        //Relleno de ' ' en el arreglo de Barra
        int i = 0;
        while (i < barraWhile.length){
            barraWhile[i] = ' ';
            i++;
        }

        int pos = 0;
        double tamanioWhile = random.nextInt(91) + 10;
        proporcionDescarga = tamanioWhile/ (double)longitudBarra;
        System.out.println("Downloading Grupo1-PoliretosWHILE-main.zip (" + tamanioWhile + " kb)");
        //Em 0.0 kb
        barraString = new String(barraWhile);
        System.out.println( "\u001B[31m" + barraString + " \u001B[0m " + String.format("%.1f", 0.0) + " / " +  tamanioWhile + " kb");
        
        //Descarga de archivo
        while (pos < longitudBarra){

            double descargando = (pos + 1) * proporcionDescarga;
            barraWhile[pos] = '-';
            
            //Para mostrar el arreglo completo de barra, se lo convierte en string
        	barraString = new String(barraWhile);
        	System.out.println( "\u001B[31m" + barraString + " \u001B[0m " + String.format("%.1f", descargando) + " / " +  tamanioWhile + " kb");
        	//El \u001B[31m cambia el texto a rojo hasta \u001B[0m, que es obligatorio para que el color no se propague al resto del texto, es decir, restablece el color al normal
        	//El String.format("%.1f", descargando) redondea el numero a una cifra decimal al mostrarse
        	Thread.sleep(250);

            pos++;
        }

        System.out.println("DOWNLOADED.");

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        char[] barraDoWhile = new char[longitudBarra];
        //Relleno de ' ' en el arreglo de Barra
        i = 0; 
        do{ 
            barraDoWhile[i] = ' ';
            i++;
        } while (i < barraDoWhile.length);

        pos = 0;
        double tamanioDoWhile = random.nextInt(91) + 10;
        proporcionDescarga = tamanioDoWhile/ (double)longitudBarra;
        System.out.println("Downloading Grupo1-PoliretosDO_WHILE-main.zip (" + tamanioFor + " kb)");
        //En 0.0kb
        barraString = new String(barraDoWhile);
        System.out.println( "\u001B[36m" + barraString + " \u001B[0m " + String.format("%.1f", 0.0) + " / " +  tamanioWhile + " kb");
        
        //Descarga de archivo
        pos = 0;
        do{ 

            double descargando = (pos + 1) * proporcionDescarga;
            barraDoWhile[pos] = '-';
            
            //Para mostrar el arreglo completo de barra, se lo convierte en string
        	barraString = new String(barraDoWhile);
        	System.out.println( "\u001B[36m" + barraString + " \u001B[0m " + String.format("%.1f", descargando) + " / " +  tamanioDoWhile + " kb");
        	//El \u001B[36m cambia el texto a cian hasta \u001B[0m, que es obligatorio para que el color no se propague al resto del texto, es decir, restablece el color al normal
        	//El String.format("%.1f", descargando) redondea el numero a una cifra decimal al mostrarse
        	Thread.sleep(250);

            pos++;
        } while (pos < longitudBarra);

        System.out.println("DOWNLOADED.");
    }


    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
}
