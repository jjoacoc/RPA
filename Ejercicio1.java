import java.util.Scanner;

public class Ejercicio1{
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        
        float pesoGato,cantComida;
        int cantDias;

        System.out.println ("Ingrese el peso del gato");
        pesoGato = sc.nextFloat();

        System.out.println ("Ingrese la cantidad de dias");
        cantDias = sc.nextInt();

        cantComida = 10 * 2 * cantDias * pesoGato;
        System.out.println("Los gramos que necesitas son: " +cantComida + "g");


    }
}