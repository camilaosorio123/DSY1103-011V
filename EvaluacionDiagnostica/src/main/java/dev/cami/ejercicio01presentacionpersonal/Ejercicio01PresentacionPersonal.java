package dev.cami.ejercicio01presentacionpersonal;
/*
En este ejercicio la lógica fue la siguiente, se declararon
las variables nombre, edad, carrera y semestre con los datos pedidos y luego en la variable
tieneExperienciaLaboral se declaró como tipo boolean y como falsa,
luego se  declaro otra variable llamada respuesta que es un operador ternario. Esta variable
utiliza el valor de la variable tieneExperienciaLaboral y la evalúa, al ser falsa da como respuesta
"no".
Luego se imprime utilizando  ->System.out.println<- y concatenando con ->+<- las sentencias y las
variables. Se hace un salto de linea con  ->"\n"<-
*/

public class Ejercicio01PresentacionPersonal {
    public static void main(String[] args) {
        // 1. Declarar variables
       String nombre = "Camila Osorio Rojas";
       int edad = 29;
       String carrera = "Ingenieria en Informatica";
       int semestre = 3;
       boolean tieneExperienciaLaboral = false;
       String respuesta = tieneExperienciaLaboral ? "Sí" : "No";

        // 2. Imprimir presentación

        System.out.println("=== Tarjeta de Presentación ===\n" + "Nombre: " + nombre + "\n"+ "Edad: "+ edad + "\n"
                + "Carrera:" + carrera + "\n" + "Semestre: " + semestre + "\n"
                + "Tiene Experiencia Laboral: " + respuesta);
    }
    }

