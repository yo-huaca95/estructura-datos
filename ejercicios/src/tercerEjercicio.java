import java.util.Scanner;

public class tercerEjercicio {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        float horasLab;

        System.out.println("\nBuen día, para calcular el salario devengado digite por favor el número de horas laboradas : ");
        String dtEntrada = sc.nextLine();

        if(valores(dtEntrada)==false){
            do {
                System.out.println("\nNo es un valor correcto... \nPor favor ingrese nuevamente el número de horas laboradas: ");
                dtEntrada = sc.nextLine();
            } while (valores(dtEntrada)==false);
            horasLab=Float.parseFloat(dtEntrada);
        }else{
            horasLab=Float.parseFloat(dtEntrada);
        }

        System.out.println("El sueldo devengado es de: $"+horasLab*30000);


    }
    
    public static boolean valores(String valor) {
        boolean result;
            try {
                Float.parseFloat(valor);
                result=true;
                
             } catch (Exception e) {
                result=false;
             }
        return result;
    }
}
