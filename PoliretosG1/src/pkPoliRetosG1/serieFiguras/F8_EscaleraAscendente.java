package pkPoliRetosG1.serieFiguras;

public class F8_EscaleraAscendente {
    public static void g1_F8_EscaleraEspejoFor(int N){
    for (int i = 0; i < N; i++){
        int spaces = 2*(N - 1 - i) - 1;
        if (spaces < 0) spaces = 0;

        for (int s = 0; s < spaces; s++){
            System.out.print(" ");
        }

        System.out.print("_");

        if (i > 0){
            System.out.print("|");
        }

        System.out.println();
    }
}
    public static void g1_F8_EscaleraEspejoDoWhile(int N){
    int i = 0;

    do {
        int spaces = 2*(N - 1 - i) - 1;
        if (spaces < 0) spaces = 0;

        int s = 0;
        do {
            if (s >= spaces) break;
            System.out.print(" ");
            s++;
        } while (true);

        System.out.print("_");

        if (i > 0){
            System.out.print("|");
        }

        System.out.println();

        i++;

    } while (i < N);
}
    public static void g1_F8_EscaleraEspejoSwitch(int N){
    int ancho = 2*(N - 1) - 1 + 2; // espacios máximos + "_" + "|" (si aplica)
    if (ancho < 2) ancho = 2; // mínimo ancho

    for (int i = 0; i < N; i++){
        int spaces = 2*(N - 1 - i) - 1;
        if (spaces < 0) spaces = 0;

        int underscorePos = spaces;
        int barPos = (i == 0) ? -1 : spaces + 1;

        for (int c = 0; c < ancho; c++){
            int region;

            if (c < spaces){
                region = 0; // espacio
            } else if (c == underscorePos){
                region = 1; // underscore
            } else if (c == barPos){
                region = 2; // barra
            } else {
                region = 0; // espacio
            }

            switch (region){
                case 0 -> System.out.print(" ");
                case 1 -> System.out.print("_");
                case 2 -> System.out.print("|");
            }
        }
        System.out.println();
    }
}

}
