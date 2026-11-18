package S_5_1.packete_2;
import S_5_1.packete_1.Clase_1;

public class App {

    public static void main(String[] args) {
        Clase_1 obj1 = new Clase_1();

        obj1.metodoPublic();

    }

}

/*
 * RESPUESTAS TEÓRICAS - EJERCICIO 1 (SEMANA 5)
 *
 * 1. Importar Clase_1 vs Clase_2 desde otro paquete (packete_2):
 *    - Clase_1 tiene modificador 'public', por lo que es visible y se puede importar desde cualquier paquete.
 *    - Clase_2 no tiene modificador (visibilidad de paquete / package-private), por lo que solo es accesible
 *      dentro de packete_1 y da error de compilación al intentar importarla o instanciarla en packete_2.
 *
 * 2. Acceso a atributos y métodos de Clase_1 desde App (otro paquete sin herencia):
 *    - public: Accesible sin restricciones desde cualquier clase y paquete.
 *    - sin modificador (default): Error de compilación; solo visible dentro del mismo paquete (packete_1).
 *    - protected: Error de compilación; fuera de packete_1 solo sería visible si App heredase (extends) de Clase_1.
 *    - private: Error de compilación; solo visible dentro de la propia Clase_1.
 *
 * 3. Propósito de los modificadores de visibilidad y ejemplo:
 *    - Su propósito es garantizar el encapsulamento (ocultación de información), protegiendo el estado interno
 *      de los objetos frente a modificaciones externas no controladas y exponiendo solo una interfaz segura.
 *    - Ejemplo: En una clase CuentaBancaria, el atributo 'saldo' debe ser 'private' para impedir que se modifique
 *      directamente (cuenta.saldo = -500), mientras que los métodos 'ingresar()' y 'retirar()' son 'public'
 *      para validar la operación antes de actualizar el saldo.
 */