package misiontic2022.c2;
import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Ingrese fecha de nacimiento");
        String numeroEnteroS = sc.nextLine();
        fecha(numeroEnteroS);
    }
    public static void fecha(String x){
        int puntero=0;
        int numA = x.length();
        int a = Integer.parseInt(x.substring(0,2));
        int b = Integer.parseInt(x.substring(3,5));
        int c = Integer.parseInt(x.substring(6,numA));
        
        
        String number = String.valueOf(a+b+c);
        System.out.println( number );

        char[] digits1 = number.toCharArray();
        System.out.println(digits1);

        for(int i = 0; i < digits1.length; i++) {
            //System.out.println( digits1[i] );  
            puntero = Character.getNumericValue( puntero + digits1[i]);
            
            
            //System.out.println( "---"+puntero);
        }

    
    }

    /**
     * InnerPrimero
     */  
    
}