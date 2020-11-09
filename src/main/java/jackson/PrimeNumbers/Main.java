package jackson.PrimeNumbers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int starRange;
        int finalRange;
        ArrayList<Integer> list = new ArrayList<>();

        starRange = getNumber("ingrese el rango inicial");
        finalRange = getNumber("Ingrese el rango final");

        for (int i = starRange; i <= finalRange; i++) {
            if (isPerfectNumber(i)) {
                list.add(i);
            }
        }

        list.forEach(x -> System.out.println("Numeros naturales perfectos: " + x));
    }

    private static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static int getNumber(String message) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(message));

        if (number <= 0) {
            showMessage("El número debe ser mayor que 0.");
            return 1;
        }
        return number;
    }

    private static boolean isPerfectNumber(int number) {
        int dividend = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                dividend += i;
            }else if (dividend == number) {
                return true;
            }

        }
        return false;
    }

}
