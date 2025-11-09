package pkPoliRetosG1.serieFiguras;

public class F7_EscaleraDescendente {
    public static void g1_F7_EscaleraFor(int N){
    for (int i = 0; i < N; i++){
        if (i == 0){
            System.out.println("_");
        } else {
            int spaces = 2*i - 1;
            for (int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            System.out.println("|_");
        }
    }
}
    public static void g1_F7_EscaleraDoWhile(int N){
    int i = 0;
    do {
        if (i == 0){
            System.out.println("_");
        } else {
            int spaces = 2*i - 1;
            int s = 0;
            do {
                if (s >= spaces) break;
                System.out.print(" ");
                s++;
            } while (true);
            System.out.println("|_");
        }
        i++;
    } while (i < N);
}
    public static void g1_F7_EscaleraSwitch(int N){
    int maxSpaces = 2*(N-1) - 1;
    for (int i = 0; i < N; i++){
        int spaces = (i == 0) ? 0 : 2*i - 1;
        int ancho = spaces + 2; // para contener "|_"

        for (int c = 0; c < ancho; c++){
            int region;
            if (i == 0){
                // solo "_"
                region = (c == 0) ? 1 : 0;
            } else {
                if (c < spaces)       region = 0; // espacios
                else if (c == spaces) region = 2; // '|'
                else                  region = 3; // '_'
            }

            switch (region){
                case 0 -> System.out.print(" ");
                case 1 -> System.out.print("_");
                case 2 -> System.out.print("|");
                case 3 -> System.out.print("_");
            }
        }
        System.out.println();
    }
}

}