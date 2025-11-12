import java.util.Scanner;

import pkPoliRetosG1.Controller;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("                                        ");

        Scanner sc = new Scanner(System.in);
        
        Controller app = new Controller();
        
        app.run(sc);
        
        sc.close();
    }
}
