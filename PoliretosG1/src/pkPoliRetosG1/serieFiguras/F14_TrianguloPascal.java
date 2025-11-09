package pkPoliRetosG1.serieFiguras;

public class F14_TrianguloPascal {
    public static void g1_F14_PascalFor(int N){
    int[] previous = new int[N];

    for (int i = 0; i < N; i++){
        int[] current = new int[i + 1];
        
        for (int j = 0; j <= i; j++){
            if (j == 0 || j == i){
                current[j] = 1;
            } else {
                current[j] = previous[j-1] + previous[j];
            }
        }

        // imprimir con espacios
        for (int s = 0; s < (N - i); s++) System.out.print(" ");
        for (int j = 0; j < current.length; j++){
            System.out.print(current[j] + " ");
        }
        System.out.println();

        previous = current;
    }
}
    public static void g1_F14_PascalDoWhile(int N){
    int[] previous = new int[N];
    int i = 0;

    do {
        int[] current = new int[i + 1];
        int j = 0;

        do {
            if (j == 0 || j == i){
                current[j] = 1;
            } else {
                current[j] = previous[j-1] + previous[j];
            }
            j++;
        } while (j <= i);

        int s = 0;
        while (s++ < (N - i)) System.out.print(" ");

        j = 0;
        do {
            System.out.print(current[j] + " ");
            j++;
        } while (j < current.length);

        System.out.println();
        previous = current;
        i++;

    } while (i < N);
}
    public static void g1_F14_PascalSwitch(int N){
    int[] previous = new int[N];

    for (int i = 0; i < N; i++){
        int[] current = new int[i + 1];

        for (int j = 0; j <= i; j++){
            switch (j == 0 || j == i ? 1 : 2){
                case 1 -> current[j] = 1;
                case 2 -> current[j] = previous[j-1] + previous[j];
            }
        }

        int s = 0;
        while (s++ < (N - i)) System.out.print(" ");

        for (int j = 0; j < current.length; j++){
            System.out.print(current[j] + " ");
        }
        
        System.out.println();
        previous = current;
    }
}

}
