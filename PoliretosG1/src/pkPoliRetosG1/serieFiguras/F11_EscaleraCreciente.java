package pkPoliRetosG1.serieFiguras;

public class F11_EscaleraCreciente {
    public static void g1_F11_EscaleraCrecienteFor(int N){
    if (N <= 0) return;
    for (int i = 0; i < N; i++){
        int indent = i*i + 2*i;                // 0,3,8,15,24...
        for (int s = 0; s < indent; s++) System.out.print(" ");
        System.out.print("| ");
        for (int j = 0; j <= i; j++){
            System.out.print("_");
            if (j < i) System.out.print(" ");
        }
        System.out.println();
    }
}
    public static void g1_F11_EscaleraCrecienteDoWhile(int N){
    if (N <= 0) return;
    int i = 0;
    do {
        int indent = i*i + 2*i;
        for (int s = 0; s < indent; s++) System.out.print(" ");
        System.out.print("| ");
        int j = 0;
        do {
            System.out.print("_");
            if (j < i) System.out.print(" ");
            j++;
        } while (j <= i);
        System.out.println();
        i++;
    } while (i < N);
}
    public static void g1_F11_EscaleraCrecienteSwitch(int N){
    if (N <= 0) return;
    int maxIndent = (N-1)*(N-1) + 2*(N-1);        // i^2+2i en i=N-1
    int maxUnders = 2*N - 1;                      // "_ _ _" -> 2*(N-1)+1 chars
    int width = maxIndent + 2 + maxUnders;        // indent + "| " + guiones

    for (int i = 0; i < N; i++){
        int indent = i*i + 2*i;
        int barPos = indent;          // '|'
        int spacePos = indent + 1;    // el espacio fijo tras '|'
        int firstUnder = indent + 2;  // primer '_'
        for (int c = 0; c < width; c++){
            int region = 0; // espacio
            if (c == barPos) region = 1;                     // '|'
            else if (c == spacePos) region = 0;              // espacio fijo
            else if (c >= firstUnder && c < firstUnder + (2*i + 1) && ((c - firstUnder) % 2 == 0))
                region = 2;                                   // '_' en posiciones pares
            switch (region){
                case 0 -> System.out.print(" ");
                case 1 -> System.out.print("|");
                case 2 -> System.out.print("_");
            }
        }
        System.out.println();
    }
}

}
