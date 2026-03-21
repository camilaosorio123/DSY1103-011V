package dev.cami.ejercicio02mayordeedad;
/*
En este ejercicio se rellenaron las variables con datos fijos, para así
probar si funciona el codigo o no.
como la variable edad es 29 en la sentencia if al validar si se cumple la condicion
imprime  : Bienvenido/a, Camila Osorio.
Puedes completar el trámite de forma autónoma.

con la sentencia else, se verifica en el caso de que la edad fuese menor a 18 imprimiría la respuesta:
Hola, Camila Osorio.
Debes asistir con tu tutor legal para completar este trámite.
Tu edad registrada: 15 años.

 */
public class Ejercicio02MayorDeEdad {
    public static void main(String[] args) {
        String nombre = "Camila Osorio";
        int edad = 29;

        if (edad >= 18) {
            System.out.println("Bienvenido/a, " + nombre +".\n" +
                    "Puedes completar el trámite de forma autónoma.");
        } else {
            System.out.println("Hola, " + nombre +".\n" +
                    "Debes asistir con tu tutor legal para completar este trámite.\n" +
                    "Tu edad registrada: 15 años.");

        }
    }
}