import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.graalvm.compiler.nodes.java.NewArrayNode;

public class cuartoEjercicio {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        int numeroTabla;

        System.out.println("\nBuen día, por favor indique de que número requiere la tabla de multiplicar : ");
        String dtEntrada = sc.nextLine();

        if(valores(dtEntrada)==false){
            do {
                System.out.println("\nNo es un valor correcto... \npor favor indique de que número requiere la tabla de multiplicar: ");
                dtEntrada = sc.nextLine();
            } while (valores(dtEntrada)==false);
            numeroTabla=Integer.parseInt(dtEntrada);
        }else{
            numeroTabla=Integer.parseInt(dtEntrada);
        }
        System.out.println("Esta es la tabla del : "+"| "+numeroTabla+" |\n");
        
        for (int i = 0; i < 11; i++) {
            System.out.println("| "+numeroTabla+" x "+ i +" "+" |"+numeroTabla*i); 
        }

        

    }

    public static boolean valores(String valor) {
        boolean result;
            try {
                Integer.parseInt(valor);
                result=true;
                
             } catch (Exception e) {
                result=false;
             }
        return result;
    }
    
}
