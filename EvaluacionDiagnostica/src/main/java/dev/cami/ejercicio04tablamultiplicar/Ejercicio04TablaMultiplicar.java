package dev.cami.ejercicio04tablamultiplicar;
/*
En este ejercicio se imprimio la tabla del 7 utilizando un for , en el cual iniciamos el contador i  en 1 y
damos la condicion de que mientras i sea igual o menor a 12 se siga ejecutando el código. despues de cada iteracion el
contador sube en 1.
en cada iteracion se impime la debida multiplicacion. para implimir usamos printf, que nos permite formatear el texto
utilizando las variables en el orden especifico:
%d  x %2d  = %3d%n", numero, i, numero * i
donde %d se refiere a numero
%2d a i
y %3d a numero * i

para la suma utilizamos la variable suma inicializada en 0 y le sumamos, en cada iteración el resultado de la
multiplicacion es decir -> numero * i

 */
public class Ejercicio04TablaMultiplicar {

    public static void main(String[] args) {
        int numero = 7;
        int suma = 0;

        System.out.println("=== Tabla del " + numero + " ===");
        for (int i = 1; i <= 12; i++) {
            // imprimir línea
            System.out.printf("%d  x %2d  = %3d%n", numero, i, numero * i);
            // acumular suma
            suma += numero * i;
        }
        System.out.println("Suma total de la tabla: " +  suma);
    }
}
