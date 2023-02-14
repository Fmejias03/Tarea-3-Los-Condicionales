import java.util.Scanner;

public class Ejercicio5 {
    /*Mostrar la nómina simplificada de un empleado a partir de la información introducida. El salario bruto depende de la cantidad de horas trabajadas y su tarifa por hora:
Las horas inferiores a 169 horas se pagan aplicando su tarifa horaria.
Las horas comprendidas entre 169 y 180 horas se pagan aplicando un incremento del 50 % sobre su tarifa horaria.
Las horas superiores a 180 horas se pagan aplicando un incremento del 60 %.
La prima familiar se calcula de la siguiente manera:
1 hijo: 20 €
2 hijos: 50 €
Por encima de 2 hijos : 70 € +20 € por cada hijo adicional
A continuación se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):
¿Apellido de la persona?
Camino
¿Nombre de la persona?
Gerardo
¿Puesto?
1 - Agente de servicio
2 - Empleado de oficina
3 - Directivo
1
Número de horas trabajadas
190
¿Tarifa horaria?
9,76
¿Número de hijos?
4
Nómina de Gerardo Camino
Estado : Agente de servicio
Salario bruto: 1.966,64 € (169 horas sin incremento, 11 horas con incremento del 50 %, 10 horas con incremento del 60 %)
Cálculo de deducciones:
Contribución para el pago de la deuda social y contingencias comunes imponible
1.966,64 € × 3,49 % = 68,64 €
Contribución de contingencias comunes no imponible
1.966,64 € × 6,15 % = 120,95 €
Seguro médico
1.966,64 € × 0,95 % = 18,68 €
Fondo de pensiones
1.966,64 € × 8,44 % = 165,98 €
Seguro de desempleo
1.966,64 € × 3,05 % = 59,98 €
Pensión complementaria (Entidad privada)
1.966,64 € × 3,81 % = 74,93 €
Contribución de jubilación anticipada
1.966,64 € × 1,02 % = 20,06 €
Deducciones totales de los empleados: 529,22 €
Salario neto: 1.437,42 €
Prima familiar: 110 €
Salario neto a pagar: 1.547,42 €*/

    public static void main(String[] args) {
        String apellido, nombre, puesto;
        int horas, hijos;
        double tarifa, salarioBruto, salarioNeto, deducciones, primaFamiliar;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el apellido de la persona");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el puesto de la persona");
        System.out.println("1 - Agente de servicio");
        System.out.println("2 - Empleado de oficina");
        System.out.println("3 - Directivo");
        puesto = entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        horas = entrada.nextInt();
        System.out.println("Ingrese la tarifa horaria");
        tarifa = entrada.nextDouble();
        System.out.println("Ingrese el numero de hijos");
        hijos = entrada.nextInt();
        if (horas < 169) {
            salarioBruto = horas * tarifa;
        } else if (horas >= 169 && horas <= 180) {
            salarioBruto = (horas - 169) * (tarifa * 1.5) + 169 * tarifa;
        } else {
            salarioBruto = (horas - 180) * (tarifa * 1.6) + 11 * (tarifa * 1.5) + 169 * tarifa;
        }
        deducciones = salarioBruto * 0.0349 + salarioBruto * 0.0615 + salarioBruto * 0.0095 + salarioBruto * 0.0844 + salarioBruto * 0.0305 + salarioBruto * 0.0381 + salarioBruto * 0.0102;
        salarioNeto = salarioBruto - deducciones;
        if (hijos == 1) {
            primaFamiliar = 20;
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else {
            primaFamiliar = 70 + (hijos - 2) * 20;
        }
        salarioNeto = salarioNeto + primaFamiliar;
        System.out.println("Nómina de " + nombre + " " + apellido);
        System.out.println("Estado: " + puesto);
    }
}
