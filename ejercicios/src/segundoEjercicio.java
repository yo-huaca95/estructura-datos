import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class segundoEjercicio {

    public static void main(String[] args) {

        Dictionary <Integer,Float> dic=new Hashtable<Integer,Float>();
        var sc = new Scanner(System.in);
        String nombreAlum;
        String resultado;
        String nota1,nota2,nota3;

         
        System.out.println("\nBuen día Alumno, Por favor ingrese su nombre: ");
        nombreAlum = sc.nextLine();
        
        System.out.println("\nPor favor ingrese las notas de sus 3 ultimas evaluaciones: ");

        System.out.println("\nNota N1: ");
        nota1=sc.nextLine();

        if(valores(nota1)==false){
            do {
                System.out.println("\nNo es un valor correcto... \nPor favor ingrese nuevamente la nota N1: ");
                nota1=sc.nextLine();
            } while (valores(nota1)==false);
            dic.put(1, Float.parseFloat(nota1));
        }else{
            dic.put(1, Float.parseFloat(nota1));
        }

        System.out.println("\nNota N2: ");
        nota2=sc.nextLine();

        if(valores(nota2)==false){
            do {
                System.out.println("\nNo es un valor correcto... \nPor favor ingrese nuevamente la nota N2: ");
                nota2=sc.nextLine();
            } while (valores(nota2)==false);
            dic.put(2, Float.parseFloat(nota2));
        }else{
            dic.put(2, Float.parseFloat(nota2));
        }

        System.out.println("\nNota N3: ");
        nota3=sc.nextLine();

        if(valores(nota3)==false){
            do {
                System.out.println("\nNo es un valor correcto... \nPor favor ingrese nuevamente la nota N3: ");
                nota3=sc.nextLine();
            } while (valores(nota3)==false);
            dic.put(3, Float.parseFloat(nota3));
        }else{
            dic.put(3, Float.parseFloat(nota3));
        }

        resultado=promedioNotas(dic)<3.0 ? "Reprobado, " : " Aprobado, ";

        System.out.println("\nEstimado "+nombreAlum+ " Has: "+ resultado +"con un promedio de: "+promedioNotas(dic));

    }

    

        public static float promedioNotas(Dictionary<Integer,Float>notas) {
            float result;
               result=(notas.get(1)+notas.get(2)+notas.get(3))/notas.size();
            return result;
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
