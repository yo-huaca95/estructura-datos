package misiontic2022.c2;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa un valor númerico al que quieres quitar las cifras: ");
        int a=sc.nextInt();
        if (Procedimientos.Segundo(a)==0){
            ValidadorErrores.ValorInvalido(a);
        }else{
            System.out.println(Procedimientos.Segundo(a));
        }
        
    }
}
