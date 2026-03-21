package dev.cami.ejercicio03clasificadornotas;
/*
En este ejercicio primero se declararon las variables nombreAlumno y nota con valores fijos y tambien se
declararon las variables clasificacion y mensaje sin valores primeramente.
Luego se hizo un bloque if / else if / else para comprobar los valores de la variable double nota y así entregar un
mensaje adecuado al estudiante.
dentro de cada sentencia else if se le dio un valor a las variables vacías clasificacion y mensaje.
de acuerdo al rango de la nota.
se hizo un print que engloba las variables declaradas al inicio del metodo main con valores fijos y las cuales se les
agregó un valor dentro de la misma clausula.
en el bloque else, se dejo asignado implicitamente las notas insuficientes, ya que eran las unicas que no estaban dentro
de un rango ya declarado.
 */

public class Ejercicio03ClasificadorNotas {

    public static void main(String[] args) {
        String nombreAlumno = "María González";
        double nota = 5.8;

        String clasificacion;
        String mensaje;

        if (nota < 1.0 || nota > 7.0) {

            System.out.println("La nota debe ser entre 1.0 e 7.0");
        } else if (nota >= 6.0 || nota <= 7.0) {
            clasificacion = "Excelente";
            mensaje = "¡Felicitaciones! Rendimiento sobresaliente.";

            System.out.println("Alumno  : " + nombreAlumno + "\n" + "Nota : " + nota +  "\n" + "Estado : "
                    + clasificacion + "\n" + "Mensaje : " + mensaje);

        } else if (nota >= 5.0 || nota <= 5.9) {
            clasificacion = "Bueno";
            mensaje = "Buen trabajo, sigue así.";

            System.out.println("Alumno  : " + nombreAlumno + "\n" + "Nota : " + nota +  "\n" + "Estado : "
                    + clasificacion + "\n" + "Mensaje : " + mensaje);
        } else if (nota >= 4.0 || nota <= 4.9) {
            clasificacion = "Suficiente";
            mensaje = "Aprobado, pero puedes mejorar.";

            System.out.println("Alumno  : " + nombreAlumno + "\n" + "Nota : " + nota +  "\n" + "Estado : "
                    + clasificacion + "\n" + "Mensaje : " + mensaje);

        }else{
            clasificacion = "Suficiente";
            mensaje = "No aprobaste. Debes rendir el examen de repetición.";

            System.out.println("Alumno  : " + nombreAlumno + "\n" + "Nota : " + nota +  "\n" + "Estado : "
                    + clasificacion + "\n" + "Mensaje : " + mensaje);
        }
    }
}