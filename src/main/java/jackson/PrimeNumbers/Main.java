package jackson.PrimeNumbers;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int starRange;
        int finalRange;

        StringBuilder str = new StringBuilder();

        starRange = getNumber("ingrese el rango inicial");
        finalRange = getNumber("Ingrese el rango final");

        for (int i = starRange; i <= finalRange; i++) {
            if (isPrime(i)) {
                str.append(i);
                str.append(", ");
            }
        }

        System.out.println("Números naturales perfectos: " + str.toString());
    }

    private static int getNumber(String message) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(message));

        if (number <= 0) {
            JOptionPane.showMessageDialog(null, "El número debe ser mayor que 0.");

            return 1;
        }
        return number;
    }

    private static boolean isPrime(int number) {
        if (number == 2) return true;

        if (number % 2 == 0 || number < 2) return false;

        int i = 3;
        while (i < Math.sqrt(number)) {
            if (number % i == 0) return false;
            i += 2;
        }

        return true;
    }

}
