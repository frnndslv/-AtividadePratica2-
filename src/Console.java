import java.util.Scanner;

public class Console {
    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {

        int valor = leitor.nextInt();
        return valor;

    }

    public static long lerLong() {

        long valor = leitor.nextLong();
        return valor;

    }

    public static String lerString() {

        String valor = leitor.next();
        return valor;

    }

}