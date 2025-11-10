package pkPoliRetosG1.serieFiguras;

public class F18_PiramideNumerica {
    
    //For
    public static void g1_F18_PiramideNumFor(int niveles){
        for (int i = 1; i <= niveles; i++){
            for (int j = 1; j <= niveles - i; j++){
                int num = j * i - (j - 1);
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    //While
    public static void g1_F18_PiramideNumWhile(int niveles){
        int i = 1;
        while (i <= niveles){
            int j = 1;
            while (j <= i){
                int num = j * i - (j - 1);
                System.out.print(num + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //Do While
    public static void g1_F18_PiramideNumDoWhile(int niveles){
        int i = 1;
        do {
            int j = 1;
            do {
                int num = j * i - (j - 1);
                System.out.print(num + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= niveles);
    }
    
}
