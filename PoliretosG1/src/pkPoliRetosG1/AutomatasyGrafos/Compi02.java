package pkPoliRetosG1.AutomatasyGrafos;

public class Compi02 {

    public void validarCaracteres(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '1' && c <= '9')
                    || (c == '|' || c == 'n' || c == '_' || c == '$')) {

            } else {
                System.out.println("Declaracion inválido: ");
                return;
            }
        }
        System.out.println("La declaracion es valida");
    }
}