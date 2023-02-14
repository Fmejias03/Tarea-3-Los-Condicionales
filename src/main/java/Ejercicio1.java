import java.util.Scanner;

public class Ejercicio1 {
    //Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.

    public static void main(String[] args) {
        int temperatura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
        temperatura = entrada.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }else{
            System.out.println("No hay riesgo de hielo");
        }
    }


}
