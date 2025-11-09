package pkPoliRetosG1.serieFiguras;
public class F9_PiramideEscaleras{
    public static void g1_F9_PiramidePeldañosFor(int N){
    if (N <= 0) return;
    // fila 0 (pico)
    for (int s = 0; s < 2*(N-1) - 1; s++) System.out.print(" ");
    System.out.println("_");
    // filas 1..N-1
    for (int i = 1; i < N; i++){
        int left = 2*(N-1 - i) - 1; if (left < 0) left = 0;
        int gap  = 4*i - 3;
        for (int s = 0; s < left; s++) System.out.print(" ");
        System.out.print("_|");
        for (int s = 0; s < gap;  s++) System.out.print(" ");
        System.out.println("|_");
    }
}
    public static void g1_F9_PiramidePeldañosDoWhile(int N){
    if (N <= 0) return;
    int s = 0; 
    int peakSpaces = 2*(N-1) - 1;
    while (s++ < peakSpaces) System.out.print(" ");
    System.out.println("_");

    int i = 1;
    do {
        int left = 2*(N-1 - i) - 1; if (left < 0) left = 0;
        int gap  = 4*i - 3;

        int k = 0; while (k++ < left) System.out.print(" ");
        System.out.print("_|");
        k = 0; while (k++ < gap)  System.out.print(" ");
        System.out.println("|_");

        i++;
    } while (i < N);
}
    public static void g1_F9_PiramidePeldañosSwitch(int N){
    if (N <= 0) return;
    int width = 2*(N-1) - 1 + 2 + (4*(N-1) - 3) + 2; // margen + "_|" + gap max + "|_"
    if (width < 6) width = 6;

    // fila 0
    for (int c = 0; c < width; c++){
        int region = (c == 2*(N-1) - 1) ? 1 : 0; // 1: '_'
        switch (region){ case 0 -> System.out.print(" "); case 1 -> System.out.print("_"); }
    }
    System.out.println();

    // filas 1..N-1
    for (int i = 1; i < N; i++){
        int left = 2*(N-1 - i) - 1; if (left < 0) left = 0;
        int gap  = 4*i - 3;
        int L_ = left;         // '_'
        int Lbar = left + 1;   // '|'
        int R_ = left + 2 + gap; // '_' del derecho
        int Rbar = R_ + 1;       // '|' derecho

        for (int c = 0; c < width; c++){
            int region = 0; // espacio
            if      (c == L_)   region = 1; // '_'
            else if (c == Lbar) region = 2; // '|'
            else if (c == R_)   region = 1; // '_'
            else if (c == Rbar) region = 2; // '|'

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