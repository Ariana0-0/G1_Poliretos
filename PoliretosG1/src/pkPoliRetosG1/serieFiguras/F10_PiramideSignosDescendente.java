package pkPoliRetosG1.serieFiguras;

public class F10_PiramideSignosDescendente {
    public static void g1_F10_EscaleraAlternaFor(int N){
    if (N <= 0) return;

    for (int i = 0; i < N; i++){
        if (i == 0){
            System.out.println("_+_");
        } 
        else if (i == N - 1){
            int spaces = 3 + 4*(i - 1);
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            System.out.println("|");
        }
        else {
            int spaces = 3 + 4*(i - 1);
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            char signo = (i % 2 == 1) ? '-' : '+';
            System.out.println("|_" + signo + "_");
        }
    }
}
    public static void g1_F10_EscaleraAlternaDoWhile(int N){
    if (N <= 0) return;
    int i = 0;

    do {
        if (i == 0){
            System.out.println("_+_");
        } 
        else if (i == N - 1){
            int spaces = 3 + 4*(i - 1);
            int s = 0;
            while (s < spaces){ System.out.print(" "); s++; }
            System.out.println("|");
        }
        else {
            int spaces = 3 + 4*(i - 1);
            int s = 0;
            while (s < spaces){ System.out.print(" "); s++; }
            char signo = (i % 2 == 1) ? '-' : '+';
            System.out.println("|_" + signo + "_");
        }
        i++;
    } while (i < N);
}
    public static void g1_F10_EscaleraAlternaSwitch(int N){
    if (N <= 0) return;
    int width = 3 + 4*(Math.max(0, N-2)) + 3;

    for (int i = 0; i < N; i++){
        int spaces = (i == 0)? 0 : 3 + 4*(i - 1);

        int posBar = spaces;
        int posU1  = spaces + 1;
        int posSign= spaces + 2;
        int posU2  = spaces + 3;

        for (int c = 0; c < width; c++){
            int region = 0; // espacio

            if (i == 0){
                if (c == 0) region = 1;
                else if (c == 1) region = 3;
                else if (c == 2) region = 1;
            }
            else if (i == N - 1){
                if (c == posBar) region = 2; // solo '|'
            }
            else {
                if (c == posBar) region = 2;          // '|'
                else if (c == posU1) region = 1;      // '_'
                else if (c == posSign) region = 3;    // +/- alternado
                else if (c == posU2) region = 1;      // '_'
            }

            switch (region){
                case 0 -> System.out.print(" ");
                case 1 -> System.out.print("_");
                case 2 -> System.out.print("|");
                case 3 -> System.out.print((i % 2 == 1) ? '-' : '+');
            }
        }

        System.out.println();
    }
}

}
