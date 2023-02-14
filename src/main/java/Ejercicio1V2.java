import java.util.Scanner;

public class Ejercicio1V2 {
    //Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.
    //Version 2

    public static void main(String[] args) {
        int temperatura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
        temperatura = entrada.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }else if(temperatura >= 2 && temperatura < 15){
            System.out.println("Hace frio");
        }else if(temperatura >= 15 && temperatura < 30){
            System.out.println("Buena temperatura");
        }else{
            System.out.println("Demasiado calor");
        }
    }
}
