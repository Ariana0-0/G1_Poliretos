package pkPoliRetosG1.serieFiguras;

public class F19_FiguraSimbolica {

    //For
    public static void g1_F19_FiguraSimbolicaFor(int niveles){
        for(int i = 1; i <= niveles; i++){
            System.out.print("+ ");
            for (int j = 1; j < i; j++){
                int num = j * i - (j - 1);  
                System.out.print(num + " ");
            }
            System.out.println("*");
        }
    }

    //While
    public static void g1_F19_FiguraSimbolicaWhile(int niveles){
        int i = 1;
        while(i <= niveles){
            System.out.print("+ ");
            int j = 1;
            while (j < i){
                int num = j * i - (j - 1);  
                System.out.print(num + " ");
                j++;
            }
            System.out.println("*");
            i++;
        }
    }

    //Do While
    public static void g1_F19_FiguraSimbolicaDoWhile(int niveles){
        int i = 1;
        do {
            System.out.print("+ ");
            int j = 1;
            do {
                if (j < i){
                    int num = j * i - (j - 1);  
                    System.out.print(num + " ");
                }
                j++;
            } while (j < i);
            System.out.println("*");
            i++;
        } while (i <= niveles);
    }
    
}
