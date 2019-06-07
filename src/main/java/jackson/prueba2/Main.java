package jackson.prueba2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jacks
 */
public class Main {

    public static void main(String[] args) {
        int inicioRango = 0;
        int finalRango = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>();

        inicioRango = getNumero("ingrese el rango inicial");
        finalRango = getNumero("Ingrese el rango final");

        for (int i = inicioRango; i <= finalRango; i++) {
            if (isNumeroPerfecto(i)) {
                lista.add(i);
            }
        }

        mostrarMensaje("Numeros naturales perfectos\n" + lista.toString());
    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static int getNumero(String mensaje) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

        if (numero <= 0) {
            mostrarMensaje("El número debe ser mayor que cero.");
            return 1;
        }
        return numero;
    }

    private static boolean isNumeroPerfecto(int numero) {
        int dividendo = 0;

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                dividendo += i;
            } else if (dividendo == numero) {
                return true;
            }

        }
        return false;
    }

}
