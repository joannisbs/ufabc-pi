import java.util.Scanner;

public class meteorito {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    
    boolean isFinished = false;
    int teste = 1;
    
    while (!isFinished) {

      int cordX1 = scanner.nextInt();
      int cordY1 = scanner.nextInt();
      int cordX2 = scanner.nextInt();
      int cordY2 = scanner.nextInt();

      if (cordX1 == 0 && cordY1 == 0 && cordX2 == 0 && cordY2 == 0 ){
          isFinished = true;
          break;
      }

      int qntMet = scanner.nextInt();
      
      int qntDentro = 0;

      for (int index = qntMet; index > 0; index --) {
          int x = scanner.nextInt();
          int y = scanner.nextInt();
  
          if ( x>=cordX1 && x<= cordX2 && y >= cordY1 && y <= cordY2) {
                qntDentro ++; 
          }
      }
      
      System.out.print("Teste ");
      System.out.println(teste);
      System.out.println(qntDentro);

      teste = teste + 1;
    }
  }
}