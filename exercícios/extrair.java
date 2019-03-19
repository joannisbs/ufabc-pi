
import java.util.Scanner;

public class extrair {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    float dadoLido = scanner.nextFloat();

    int parteInteira = 0;
    while ( dadoLido >= 1 ) {
        dadoLido = dadoLido - 1;
        parteInteira = parteInteira + 1;
    }

    System.out.print("parteInteira: ");
    System.out.println(parteInteira);

    System.out.print("parteDecimaql: ");
    System.out.println(dadoLido);
  }
}