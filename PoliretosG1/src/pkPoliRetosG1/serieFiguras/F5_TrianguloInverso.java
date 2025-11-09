package pkPoliRetosG1.serieFiguras;

public class F5_TrianguloInverso {
    public static void g1_F5_TrianguloInversoFor(int N){
    int W = 2*N - 1;
    for (int r = 0; r < N; r++){
        // padding izquierdo
        for (int p = 0; p < r; p++) System.out.print(" ");
        // asteriscos
        int stars = 2*(N - r) - 1;
        for (int k = 0; k < stars; k++) System.out.print("*");
        System.out.println();
    }

    }

    public static void g1_F5_TrianguloInversoDoWhile(int N){
    int r = 0;
    int W = 2*N - 1;
    if (N <= 0) return;
    do {
        int p = 0;
        do { if (p >= r) break; System.out.print(" "); p++; } while(true);

        int stars = 2*(N - r) - 1;
        int k = 0;
        do { if (k >= stars) break; System.out.print("*"); k++; } while(true);

        System.out.println();
        r++;
    } while (r < N);
    }

    public static void g1_F5_TrianguloInversoSwitch(int N){
    int W = 2*N - 1;
    for (int r = 0; r < N; r++){
        int L = r;           // límite izq
        int R = W - r - 1;   // límite der
        for (int c = 0; c < W; c++){
            int region = (c < L) ? 0 : (c <= R ? 1 : 2);
            switch (region){
                case 0 -> System.out.print(" ");
                case 1 -> System.out.print("*");
                case 2 -> System.out.print(" ");
            }
        }
        System.out.println();
    }
}



}
