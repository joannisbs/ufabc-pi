
import java.util.Scanner;

public class triangulo {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
     
    float   var = scanner.nextFloat();
    int     var = scanner.nextInt();
    byte    var = scanner.nextByte();
    long    var = scanner.nextLong();
    boolean var = scanner.nextBoolean();
    double  var = scanner.nextDouble();
    String  var = scanner.nextLine();
  }
}

redirecionamento de entradas e saidas 

java prog > file // saida
java prog < file  // entrada

java prog > file1 < file2 // entrada e saida
java prog1 | prog2 // pipe