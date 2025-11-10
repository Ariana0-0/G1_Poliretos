package pkPoliRetosG1.serieFiguras;

public class F17_CruzBinaria {
    
    //For
    public static void g1_F17_CruzBinFor(int n){
         for (int i = 0; i < n; i++){
               for (int j = 0; j < n; j++){
                if (i == j || i + j == n - 1){
                     System.out.print((i % 2 == 0) ? "1" : "0");
                } else {
                     System.out.print(" ");
                }
               }
               System.out.println();
         }
    }

    //While
    public static void g1_F17_CruzBinWhile(int n){
         int i = 0;
         while (i < n){
               int j = 0;
               while (j < n){
                if (i == j || i + j == n - 1){
                     System.out.print((i % 2 == 0) ? "1" : "0");
                } else {
                     System.out.print(" ");
                }
                j++;
               }
               System.out.println();
               i++;
         }
    }

    //Do While
    public static void g1_F17_CruzBinDoWhile(int n){
         int i = 0;
         do {
               int j = 0;
               do {
                if (i == j || i + j == n - 1){
                     System.out.print((i % 2 == 0) ? "1" : "0");
                } else {
                     System.out.print(" ");
                }
                j++;
               } while (j < n);
               System.out.println();
               i++;
         } while (i < n);
    }
    
}
