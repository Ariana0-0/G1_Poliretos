package pkPoliRetosG1.serieFiguras;

public class F12_NumerosDescendientes {
    public static void g1_F12_NumerosDescFor(int N){
    for (int i = N; i >= 1; i--){
        for (int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void g1_F12_NumerosDescDoWhile(int N){
    int i = N;
    do {
        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j <= i);
        System.out.println();
        i--;
    } while (i >= 1);
}
    public static void g1_F12_NumerosDescSwitch(int N){
    for (int i = N; i >= 1; i--){
        for (int j = 1; j <= N; j++){
            int region = (j <= i) ? 1 : 0;
            switch (region){
                case 1 -> System.out.print(j);
                case 0 -> { /* no imprimir nada */ }
            }
        }
        System.out.println();
    }
}

}
