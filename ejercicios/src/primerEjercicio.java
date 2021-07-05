import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class primerEjercicio {
    public static void main(String[] args) {

        Dictionary <Integer,String> dic=new Hashtable<Integer,String>();
        dic.put(1, "Suma");
        dic.put(2, "Resta");
        dic.put(3, "Multiplicación");

        var sc = new Scanner(System.in);
        int v1;
        int v2;
        String entradaOpc;
        String entradaV1;
        String entradaV2;
        int opc;
        
        System.out.println("\n por favor ingrese la operación que desea realizar: \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. Salir");
        entradaOpc =sc.nextLine();

        if(Validador.entradaOp(entradaOpc)==false){
            do {
                System.out.println("\nError No es una opción correcta ... \npor favor ingrese la operación que desea realizar: \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. Salir");
                entradaOpc =sc.nextLine();
            } while (Validador.entradaOp(entradaOpc)==false);
            opc=Integer.parseInt(entradaOpc);
        }else{
            opc=Integer.parseInt(entradaOpc);
            if (opc==4){
                System.out.println("Adios...");
                System.exit(0);
            }
        }
        
        System.out.println("\n por favor ingrese el primer valor: ");
        
        entradaV1 = sc.nextLine();

        if(Validador.valores(entradaV1)==false){
            do {
                System.out.println("\nError No es un valor correcto ... \npor favor ingrese el primer valor: ");
                entradaV1 =sc.nextLine();
            } while (Validador.valores(entradaV1)==false);

            v1 = Integer.parseInt(entradaV1) ;

        }else{
            v1 = Integer.parseInt(entradaV1) ;
        }

        System.out.println("\n por favor ingrese el segundo valor: ");
        entradaV2 = sc.nextLine();

        if (Validador.valores(entradaV2)==false){
            do {
                System.out.println("\nError No es un valor correcto ... \npor favor ingrese el segundo valor: ");
                entradaV2 =sc.nextLine();
            } while (Validador.valores(entradaV2)==false);
            v2 = Integer.parseInt(entradaV2);
        }else{
            v2 = Integer.parseInt(entradaV2);
        }

        System.out.println("La " + dic.get(opc) + " de "+ v1 +" y "+ v2 +" es igual a: "+ Operar(opc, v1, v2));

    }
    
    public static int Operar(int opc, int v1, int v2) {

        int result=0;

        switch (opc) {
            
            case 1:
                result= v1+v2 ;
                break;
            case 2:
                result= v1-v2 ;
                break;
            case 3:
                result= v1*v2 ;
                break;
                
            default:
                break;
        }

        return result;

        
    }
        
    
    /**
     * InnerprimerEjercicio
     */
    public static class Validador {

        public static boolean entradaOp(String entradaOpc) {
            boolean result;
                try {
                    Integer.parseInt(entradaOpc);
                    if(Integer.parseInt(entradaOpc)>0 && Integer.parseInt(entradaOpc)<5){
                        result=true;
                    }else{
                        result=false;
                    }
                    
                 } catch (Exception e) {
                    result=false;
                 }
            return result;
             
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

}
