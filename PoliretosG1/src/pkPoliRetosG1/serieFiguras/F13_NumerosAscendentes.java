package pkPoliRetosG1.serieFiguras;

public class F13_NumerosAscendentes {
    public static void g1_F13_NumerosAscFor(int N){
    for (int i = 1; i <= N; i++){
        for (int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void g1_F13_NumerosAscDoWhile(int N){
    int i = 1;
    do {
        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j <= i);
        System.out.println();
        i++;
    } while (i <= N);
}
    public static void g1_F13_NumerosAscSwitch(int N){
    for (int i = 1; i <= N; i++){
        for (int j = 1; j <= N; j++){
            int region = (j <= i) ? 1 : 0;
            switch (region){
                case 1 -> System.out.print(j);
                case 0 -> { /* no imprimir */ }
            }
        }
        System.out.println();
    }
}

}
