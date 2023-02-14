import java.util.Scanner;

public class Ejercicio4 {
    //Sabiendo que:
    //
    //Para cocinar 500 gramos de carne de vacuno, se necesita:
    //
    //10 minutos si quieres una cocción casi cruda
    //
    //17 minutos si quieres una cocción al punto
    //
    //25 minutos si quieres una cocción bien hecha
    //
    //Para cocinar 400 gramos de cordero se necesita:
    //
    //15 minutos si quieres una cocción casi cruda
    //
    //25 minutos si quieres una cocción al punto
    //
    //40 minutos si quieres una cocción bien hecha
    //
    //El tiempo de cocción es proporcional al peso.
    //
    //Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), mostrar el tiempo de cocción de una carne en segundos.

    public static void main(String[] args) {
        int tipoCarne, coccion, peso;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de carne");
        System.out.println("1. Carne de vacuno");
        System.out.println("2. Cordero");
        tipoCarne = entrada.nextInt();
        System.out.println("Ingrese el modo de coccion");
        System.out.println("1. Crudo");
        System.out.println("2. Al punto");
        System.out.println("3. Bien hecho");
        coccion = entrada.nextInt();
        System.out.println("Ingrese el peso");
        peso = entrada.nextInt();
        if (tipoCarne == 1) {
            if (coccion == 1) {
                System.out.println("El tiempo de coccion es de " + (10 * peso) + " segundos");
            } else if (coccion == 2) {
                System.out.println("El tiempo de coccion es de " + (17 * peso) + " segundos");
            } else if (coccion == 3) {
                System.out.println("El tiempo de coccion es de " + (25 * peso) + " segundos");
            } else {
                System.out.println("El modo de coccion ingresado no es valido");
            }
        } else if (tipoCarne == 2) {
            if (coccion == 1) {
                System.out.println("El tiempo de coccion es de " + (15 * peso) + " segundos");
            } else if (coccion == 2) {
                System.out.println("El tiempo de coccion es de " + (25 * peso) + " segundos");
            } else if (coccion == 3) {
                System.out.println("El tiempo de coccion es de " + (40 * peso) + " segundos");
            } else {
                System.out.println("El modo de coccion ingresado no es valido");
            }
        } else {
            System.out.println("El tipo de carne ingresado no es valido");
        }
    }

}
