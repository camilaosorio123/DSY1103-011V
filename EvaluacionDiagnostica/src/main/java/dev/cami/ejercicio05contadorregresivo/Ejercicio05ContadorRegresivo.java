package dev.cami.ejercicio05contadorregresivo;
/*
En este ejercicio se hizo un contador regresivo
1.- se declaran las variables que usaremos :
        int[] valoresPrueba = {-5, 0, 10};
        int indice = 0;
        int valorIngresado;
        int intentos = 0;

 2.- Usamos un bloque do while para validar que el número que ingresamos sea valido para realizar la cuenta
 regresiva.
 3.- usamos while para hacer la cuenta regresiva. cada ciclo le restamos 1 al contador
 */


public class Ejercicio05ContadorRegresivo {

    public static void main(String[] args) {

        // === PARTE A: Validación con do-while ===
        int[] valoresPrueba = {-5, 0, 10};
        int indice = 0;
        int valorIngresado;
        int intentos = 0;

        do {
            valorIngresado = valoresPrueba[indice++];

            if  (valorIngresado <= 0 ) {
                intentos++;
                System.out.println("Valor inválido. Intento #" + intentos + ". Ingresa un número mayor a 0.");
            }else{
                intentos++;
                System.out.println("Valor aceptado: " +  valorIngresado);

            }

        } while (valorIngresado <= 0);

        // === PARTE B: Cuenta regresiva con while ===
        int contador = valorIngresado;
        System.out.println("Iniciando cuenta regresiva desde " + contador + "...");
        while (contador >= 0) {

                System.out.println(contador);
                contador--;

        }
        System.out.println("¡Despegue! 🚀");
    }
}


